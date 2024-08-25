/***************
* Name: Felipe Villegas
* Course: cs-320
* Date: aug 10
* Desc: test for contact / contacttest
***************/

package Test;

import org.junit.jupiter.api.Test;
import Contact.Contact;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
	@Test
	@DisplayName("Contact ID connot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("FristName","MidName","LastName","PhoneNumber","Address");
		if(contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 charaters.");
		}
	}
	@Test
	@DisplayName("Contact first name cannot have more than 10 characters")
	void testContactFristNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("AAAAAAAAAAAAAAAA", "MidName", "LastName","PhoneNumber","Address");
		if(contact.getfristName().length() > 10) {
			fail("Frist Name has more than 10 characters.");
		}
	}
	@Test
	@DisplayName("Contact midname connot have more than 10 Characters")
	void testContactMidNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FristName","AAAAAAAAAAAAAAA","LastName","Phonenumber","Address");
		if(contact.getmidName().length() > 10) {
			fail("Middle Name has more than 10 characters.");
		}
	}
	@Test
	@DisplayName("Contact last name cannot have more than 10 characters")
	void testContactLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FristName", "Midname", "AAAAAAAAAAAAAAA", "Phonenumber","Address");
		if(contact.getlastName().length() > 10) {
			fail)("Last name has more than 10 characters.");
		}
	}
	@Test
	@DisplayName("Contact phone number is exactly 10 characters")
	void testContactNumberWithMorethanTenCharacters() {
		Contact contact = new Contact("FristName", "Midname", "Lastname", "555555555555555", "Address");
		if(contact.getNumber().length()!=10) {
			fail("Phone number length is more than 10 characters.");
		}
	}
	@Test
	@DisplayName("Contact address cannot have more than 30 characters")
	void testContactAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("FristName","MidName","LastName","PhoneNumber",
				"123456789 is nine characters long" + "123456789 is another nine characters long");
		if(contact.getAddress().length(0 > 30)) {
			fail("Address has more than 30 characters in the address feild.");
		}
	}
	@Test
	@DisplayName("Contact Frist Name shall not be null")
	void testContactfristNameNotNull() {
		Contact contact = new Contact(null, "MidName", "LastName","PhoneNumber","Address");
		assertNotNull(contact.getfristName(), "First name was null.");
	}
	@Test
	@DisplayName("Contact Mid Name shall not be null")
	void testContactMidNameNotNull() {
		Contact contact = new Contact("fristName",null,"LastName","PhoneNumber","Address");
		assertNotNull(contact.getmidName(), "Mid name not null.");
	}
	@Test
	@DisplayName("Contact Last Name shall not be null")
	void testcontactLastNameNotNull() {
		Contact contact = new Contact("fristName","MidName",null,"PhoneNumber","Address");
		assertNotNull(contact.getlastName(), "Last name not null.");
	}
	@Test
	@DisplayName("Contact Phone Number shall not be null")
	void testcontactPhoneNumberNull() {
		Contact contact = new Contact("FristName","MidName","LastName",Null,"Address");
		assertNotNull(contact.getphoneNumber(), "Phone number shall not be null.");
	}
	@Test
	@DisplayName("Contact Address shall not be null")
	void testContactAddressNitNull() {
		Contact contact = new Contact("FristName","MidName","LastName","PhoneNumber",null);
		assertNotNull(contact.getAddress(), "Address shall not be null.");	
	}
}