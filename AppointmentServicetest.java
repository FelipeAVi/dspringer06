/*************
* Name: Felipe Villegas
* Course: cs-320
* Date: Aug 9th
* Description: Test for the Task service part
*************/

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arraylist;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;
import Appointment.Appointmentservice;

class AppointmentServiceTest {
	public Date Date(int i, int january, int j) {
		java.util.Date Date = null;
		retun Date;
	}
	@Test
	@DisplayName("Test to update appointment date")
	@Order(1)
	void testUpdatedAppointmentDate(0) {
		AppointmentService service = new AppointmentService();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1),"Description");
		sevvice.updateappointmentDate(Date(3024, Calendar.FEBRUARY, 1), "8");
		service.displayAppointmentList();
		assertEquals(Date(3024, Calendar.FEBRUARY, 1), service.getAppointment("8).getAppointmentDate(),"Appointment date cannot be updated.");
	}
	@Test
	@DisplayName("Test to update desctription based on appointment.")
	@order(2)
	void testUpdateAppointmentDesc() {
		AppointmentService service = new AppointmentService();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1), "Description");
		service.updateAppointmentDesc("Updated Description", "9");
		service.displayAppointmentList();
		assertEquals("Updated description", service.getAppointment("9").getappointmentDesc(), "Appointment desc was not corrected.");
	}
	@test
	@DisplayName("Test to make sure the the service date is deleting the appointments.")
	@order(3)
	void testDeleteAppointment() {
		AppintmentService service = new Appointmentservice();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1), " Description");
		service.deleteAppointment("10");
		ArrayList<Appointment> appointmentListEmpty = new ArrayList<Appointment>();
		service.displayAppointmentList();
		assertEquals(service.appointmentList, appointmentListEmpty, "The picked appointment was not deleted.");
	}
	@test
	@DisplayName("Test to confirm appointment was added.")
	@Order(4)
	void testAddAppointment() {
		Appointmentservice service = new AppointmentService();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1), "Description");
		service.displayAppointmentList();
		assertNotNull(service.getAppointment("1"), "Appointment not added in the correct manner please check.");
	}
}