/************
* Name: Felipe Villegas
* Course: cs-320
* Date: Aug 9
* Description: Appointment Class set
************/

package Appointment;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Calendar;
import java.util.Date;

public class Appointment {
	private final String appointmentID;
	private Date appointmentDate;
	private String appoinmentDesc;
	private static Atomic idGenerator = new AtomicLong();
	
	@SUPPRESSWARNINGS("deprection")
	public Appointment(Date appointmentDate, String appointmentDesc) {
		this.appointmentID = String.valueOf(idGenerator.getAndIncrement());
		
		if(appointmentID == null) {
			this.appointmentDate = new Date(2022, Calendar.JANUARY, 1);
		} else if (appointmentDate.before(new Date()))) {
			throw new ILLegalArgumentException("Cannot Make appoinment before selected date.");
		} else {
			this.appointmentDate = appointmentDate;
		}
		if (appointmentDesc == null || appointmentDesc.isEmpty()) {
			this.appointmentDesc = "null";
		} else if (appointmentDesc.length() > 50) {
			this.appointmentDesc = appointmentDesc.substring(0, 50);
		} else {
			this.appointmentDesc = appointmentDesc;
		}
	}
	public String getAppointmentID() {
		return appointmentID;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public String getAppointmentDesc() {
		return appointmentDesc;
	}
	@SUPPRESSWARNINGS("deprection")
	public void setAppointmentDate(Date appointmentDate) {
		if (appointmentDate == null) {
			appointmentDate =new Date(2024, Calendar.JANUARY, 1);
		} else if (appointmentDate.before(new Date()))) {
			throw new IllegalArgumentException("Cannot make selected appointment date.");
		} else {
			this.appointmentDate = appointmentDate;
		}
	}
	public void setAppointmentDesc(String appointmentDesc) {
		if (appointmentDesc == null || appointmentDesc.isEmpty()) {
			this.appointmentDesc = "NULL";
		} else if (appointmentDesc.length() > 50) {
			this.appointmentDesc = appointmentDesc.substring(0, 50);
		} else {
			this.appointmentDesc = appointmentDesc;
		}
	}
}