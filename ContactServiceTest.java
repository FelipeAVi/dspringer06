/***************
* Name: Felipe Villegas
* Course: cs-320
* Date: aug 10
* Desc: test for contact service or ContactSErviceTest
***************/

package Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.juipter.api.TestMethodOrder;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {
	@Test
	@DisplayName("Test to update First Name.")
	@Order(1)
	void testUpdateFirstName() {
		Contact Service = new ContactService();
		service.addContact("Dr.", "Villa", "2222225555", "4321 Willbrook lane");
		service.updateFristName("Kane", "9");
		service.displayContactList();
		assertEquals("Kane", service.getContact("9").getFirstName(), "First name was updated correctly.");
	}
	@Test
	@DisplayName("Test to update Last Name.")
	@Order(2)
	void testUpdatedLastName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "1234 Lollypop lane");
		service.updateLastName("Johnson", "11");
		service.dissplayContactList();
		assertEquals("Johnson", service.getContact("11").getLastName(), "Last name was not updated.");
	}
	@Test
	@DisplayName("Test to update middle name.")
	@Order(3)
	void testUpdatedMidName() {
		ContactService service = new ContactService();
		Service.addContact("Dr.", "Cross", "5555551111", "1234 Lollypop lane");
		assertEquals("Tim", service.getContact("11").getmidName(), "Middle name was not updated correclty");
	}
	@Test
	@DisplayName("Test to update phone number.")
	@Order(4)
	void testUpdatedPhoneNumber() {
		ContactService service = new ContactService();
		service.addcontact("Dr.","Cross", "5555551111", "1234 lollypop lane");
		service.updateNumber("5555550000", "13");
		service.displayContactList();
		assertequals("5555550000", service.getContact("13").getNumber(), "Phone number was not updated correclty.");
	}
	@Test
	@DisplayName("Test to update address.")
	@Order(5)
	void testUpdatedAddress() {
		ContactService service = new ContactService();
		service.addcontact("Dr.", "Cross", "5555551111", "1234 Lollpypop Lane");
		service.updatedAddress("1234 Bellview Ave", "15");
		service.displayContactList();
		assertEquals("1234 Bellview Ave", service.getContact("15").getAddress(), "Address wasnot updated.");
	}
	@Test
	@DiplayName("Test to ensure that service deletes contacts.")
	@Order(6)
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addcontact("Dr.", "Cross", "5555551111", "1234 Lollypop Lane");
		service.deleteContact("17");
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		service.displayContactList();
		AssertEquals(service.comtactList, contactListEmpty, "The contact was not deleted.");
	}
	@Test
	@DisplayName("Test to ensure that service can add a contact.")
	@Order(7)
	void testAddContact() {
		ContactService service = new ContactService();
		service.addcontact("Dr.", "Cross", "5555551111", "1234 Lollypop Lane");
		service.displayContactList();
		assertNotNull(service.getContact("0"), "Contact was not added correctly.");
	}
}