/*************
* Name: Felipe Villegas
* Course: cs-320
* Date: Aug 9th
* Description: Contact list class, this area stores and creates info.
*************/

Package Contact;

import java.util.concurrent.atmoic.AtomicLong;

public class Contact {
	private final String contactID;
	private String fristName;
	private String lastName;
	private String midName;
	private String number;
	private String address;
	private Static AtomicLong idGenerator = new AtomicLong();
	
	public Contact(String firstName, String lastName, String midName, String number, String address) {
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
		if(fristName == null || fristName.isEmpty()) {
			this.fristName = "NULL";
		} else if (fristName.length() > 10) {
			this.fristName = fristName.substring(0, 10);
		} else {
			this.fristName = fristName;
		}
		
		if (LastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length(0 > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
		
		if(midName == null || midName.isEmpty()) {
			this.midName = "NULL";
		} else if (midName.length(0 > 10) {
			this.midName = midName.substring(0, 10);
		} else {
			this.midName = midName;
		}
		
		if (number == null || number.isEmpty() || number.length() ! = 10) {
			this.number = "8888888888"
		} else {
			this.number = number;
		}
		
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
	public String getContactID() {
		return contactID;
	}
	public String getfristName() {
		return fristName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getmidName() {
		return midName;
	}
	public String getNumber() {
		return number;
	}
	public String getAddress() {
		return address;
	}
	
	public void setfirstName(String fristName) {
		if (fristName == null || fristName.isEmpty()) {
			this.firstName = "NULL";
		} else if (fristName.length() > 10) {
			this.firstName = firstName.substring(0, 10); 
		} else {
			this.fristName = fristName;
		}
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.Length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
	}
	public void setmidName(String midName) {
		if(midName == null || midName.isEmpty()) {
			this.midName = "NULL";
		} else if (midName.length() > 10) {
			this.midName = midName.substring(0, 10);
		} else {
			this.midName = midName;
		}
	}
	public void setNumber(String number) {
		if(number == null || number.isEmpty() || number.length() != 10) {
			this.number = "8888888888";
		} else {
			this.number = number;
		}
	}
	public void setAddress(String address) {
		if(address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
}