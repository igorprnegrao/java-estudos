package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {
		
		private Double pricePerHour;
		private Double pricePerDay;
		
		private BrazilTaxServices taxServices;
		
		//construtor default não vai ser implementado forçando a passagem dos argumentos

		public RentalServices(Double pricePerHour, Double pricePerDay, BrazilTaxServices taxServices) {
			
			this.pricePerHour = pricePerHour;
			this.pricePerDay = pricePerDay;
			this.taxServices = taxServices;
		}


		public Double getPricePerHour() {
			return pricePerHour;
		}


		public void setPricePerHour(Double pricePerHour) {
			this.pricePerHour = pricePerHour;
		}


		public Double getPricePerDay() {
			return pricePerDay;
		}


		public void setPricePerDay(Double pricePerDay) {
			this.pricePerDay = pricePerDay;
		}


		public BrazilTaxServices getTaxServices() {
			return taxServices;
		}


		public void setTaxServices(BrazilTaxServices taxServices) {
			this.taxServices = taxServices;
		}
		
		
		public void processInvoice(CarRental carRental) {
			//para pegar a duração de tempo durante duas datas e horas
			//usar duartion.between
			double minutes =   Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
			double hours = minutes / 60.0;
			double basicPayment;
			if (hours <= 12.0) {
				basicPayment = getPricePerHour() * Math.ceil(hours);
			} else {
				basicPayment = getPricePerDay() * Math.ceil(hours / 24.0);
			}
			
			double tax = taxServices.tax(basicPayment);
			
			
			
			carRental.setInvoice(new Invoice(basicPayment, tax));
		}
		
}
