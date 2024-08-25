/*************
* Name: Felipe Villegas
* Course: cs-320
* Date: Aug 9th
* Description: Contact service area, add and deleting contact as needed.
*************/

package Contact;

import java.util.ArrayList;

public class ContactService{
	public ArrayList<Contact> contactList = new ArrayList<contact>();
	
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
			System.out.println("\t Frist Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Mid Name: " + contactList.get(counter).getMidName());
			System.out.println("\t Last Name: " + contactList.get(counter).getlastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n";
		}
	}
	public void addcontact(String FirstName, String lastName, String midName, String number, String address) {
		Contact contact = new Contact(firstName, lastName, midName, number, address);
		contact.add(contact);
	}
	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null);
		for (int counter = 0, counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().contactEquals(contactID)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}
	public void deleteContact(String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.remove(counter);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not Available.");
			}
		}
	}
	public void updateFristName(String updatedString, String contactID) {
		for (int counter = 0; counter).getContactID().equals(contactID)){
				contactList.get(counter).setFristName(updatedString);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not available.");
			}
	    }
	}
	public void updateLastName(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contact)) {
				contactList.get(counter).setLastName(updatedString);
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not available.");
			}
		}
	}
	public void updateNumber(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(): counter++) {
			if (contactList.get(counter).setNumber(updatedString);
			break;
		}
		if (counter == contactList.size() - 1) {
			System.out.println("Contact ID: " + contactID + " not available." );
		}
	public void updateAddress(String updatedString, string contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (counterList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setAddress(updatedString);;
				break;
			}
			if (counter == contactList.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not Available.");
			}
		}
	}
}