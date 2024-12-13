package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.LongFunction;

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


	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Reservation: Room " 
				+ roomNumber + ", Check-in: " + sdf.format(checkin)  
				+ ", check-out: " +  sdf.format(checkout) +", " + duration() + " nights." ;
	}
	
}
