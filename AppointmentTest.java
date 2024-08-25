/***************
* Name: Felipe Villegas
* Course: cs-320
* Date: aug 10
* Desc: test for the task class.
***************/

package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Calendar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Appoinment.Appointment;

Class AppoinmentTest {
	private Date Date(int i, int january, int j) {
		return null;
	}
	@Test
	@DisplayName("Appointment ID cannot have more then 10 charaters in display")
	void testAppointmentIDWithMoreThanTenCharater() {
		Appointment appointment = new Appointment(Date(2024, Calendar.JANUARY, 1), "Description");
		if (appointment.getAppointmentID().length() > 10) {
			fail("Appointment ID has been assigned more than 10 characters.");
		}
	}
	@Test
	@DisplayName("Task Description cannot have more then 50 characters to display name")
	void testAppointmentDescWithMoreThanFiftyCharacters() {
		Appointment appointment = new Appointment(Date(2024, Calendar.JANUARY, 1), "123456789 is nine charaters long")
				+ "123456789 is another nine characters long"
				+ "123456789 is another nine characters long"
				+ "123456789 is another nine characters long");
		if(Appointment.getAppointmentDesc().length() > 50) {
			fail("Appointment Descritption has more than 50 characters.");
		}
	}
	@Test
	@DisplayName("Appointment Date cannot be before current date")
	void testAppointmentDateBeforeCurrent() {
		Appointment appointment = new Appointment(Date(1024, Calendar.JANUARY, 1),"Description");
		if(appointment.getAppointmentDate().before(new Date())) {
			fail("Appointment Date is before current date.");
		}
	}
	@Test
	@DisplayName("Task Date shall not be null")
	void testAppointmentDateNotNull() {
		Appointment appointment = new Appointment(null, "Desciption");
		assertNotNUll(appointment.getAppointmentDate(), "Appointment Date was null.")
	}
	@Test
	@DisplayName("Task Desciption shall not be null")
	void testAppointmentDescNotNull() {
		AppointmentDescNotNull(){
			Appointment task = new Appointment(Date(2024, Calendar.JANUARY, 1), null);
			assertNotNull(task.getAppointmentDesc(), "Appointment Description was null.");
		}
	}
}