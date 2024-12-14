package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}


	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckin() {
		return checkin;
	}



	public Date getCheckout() {
		return checkout;
	}
	
	
	public long duration() {
		//pegar tempo em milissegundos muito usado no java
		long diff = checkout.getTime() - checkin.getTime();
		//converter milissegundos para dias usando timeUnits
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	//para o metodo propagar a exception add a cláusula  throws na assinatura 
	public void updateDates(Date checkin, Date checkout) throws DomainException{
		Date now = new Date();
		//condicional regra de negocio checkin e checkout não deve ser antes da data atual 
		//e checkout não deve ser antes do checkin
		if (checkin.before(now) || checkout.before(now) ) {
			// estancio minha classe domainException passando a msg do erro
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		} 
		// estancio minha classe domainException passando a msg do erro
		if (!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		} 
		
		this.checkin = checkin;
		this.checkout = checkout;
		//se nao cair em nenhum if...o fluxo de dados será normal 
	
	}
	
	@Override
	public String toString() {
		return "Reservation: Room " 
				+ roomNumber + ", Check-in: " + sdf.format(checkin)  
				+ ", check-out: " +  sdf.format(checkout) +", " + duration() + " nights." ;
	}
}
