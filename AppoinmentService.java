/*************
* Name: Felipe Villegas
* Course: cs-320
* Date: Aug 9th
* Description: Appointment Service class section
*************/

package Appointment;

import java.util.ArrayList;
import java.util.Date;

import Appointment.Appointment;

public class AppointmentService {
	public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	public void displayAppointmentList() {
		for (int counter = 0; counter < appointmentList.size(); counter++) {
			System.out.println("\t Appointment ID: " + appointmentList.get(counter).getAppointmentID());
			System.out.println("\t Appointment Date: " + appointmentList.get(counter).getAppointmentDate());
			System.out.println("\t Apointment Description: " + appointmentList.get(counter).getAppointmentDesc());
		}
	}
	public void addAppointment(Date appointmentDate, String appointmentDesc) {
		Appointment appointment = new Appointment(appointmentDate, appointmentDesc);
		appointmentList.add(appointment);
	}
	public Appointment getAppointment(String appointmentID) {
		Appointment appointment = new Appointment(null, null);
		for (int counter = 0; counter < appointmentList.size(); counter++) {
			if (appointmentList.get(counter).getAppointmentID().contentEquals(appointmentID)) {
				appointment = appointmentList.get(counter);
			}
		}
		return appointment;
	}
	public void deleteAppointment(String appointmentID) {
		for (int counter = 0; counter < appointmentList.size(); counter++) {
			if (appointmentList.get(counter).getAppointmentID().equals(appoinmentID)) {
				appointmentList.remove(counter);
				break;
			}
			if (counter == appointmentList.size() - 1) {
				System.out.println("Appointment ID: " + appointmentID + "not availible.");
			}
		}
	}
	public void updateAppointment(Date updatedDate, String appointmentID) {
		for (int counter = 0; counter < appointmentList.size(); counter++) {
			if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
				appointmentList.get(counter).setAppointmentDate(updatedDate);
				break;
			}
			if (counter == appointmentList.size() - 1) {
				System.out.println("Appointment ID: " + appointmentId + " not availible.");
			}
		}
	}
	public void updateAppointmentDesc(String updateString, String appointmentID) {
		for (int counter = 0; counter < appointmentList.size(); counter++) {
			if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
				appointmentList.get(counter).setAppointmentDesc(updatedString);
				break;
			}
			if (counter == appointmentList.size() - 1) {
				System.out.println("Appointment ID: " + appointmentID + " not avaiable.");
			}
		}
	}
}