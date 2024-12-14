package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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


	public String updateDates(Date checkin, Date checkout) {
		Date now = new Date();
		//condicional regra de negocio checkin e checkout não deve ser antes da data atual 
		//e checkout não deve ser antes do checkin
		if (checkin.before(now) || checkout.before(now) ) {
			return "Error in reservation: Check-out date must be after check-in date";
		} 
		
		if (!checkout.after(checkin)) {
			return "Check-out date must be after check-in date";
		} 
		
		this.checkin = checkin;
		this.checkout = checkout;
		//se retornar nulo é pq não deu nenhum erro
		return null;
	}
	
	@Override
	public String toString() {
		return "Reservation: Room " 
				+ roomNumber + ", Check-in: " + sdf.format(checkin)  
				+ ", check-out: " +  sdf.format(checkout) +", " + duration() + " nights." ;
	}
}
