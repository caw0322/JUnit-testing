import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	
	
	@Test
	void testUniqueID() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		contact newerContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTest.addContact(newerContact);
			
		});
}
	@Test
	void testListAdd() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		assertEquals(1,newTest.getInt().size());
		
	}
	@Test
	void testRemoveContact() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		newTest.deleteContact("test");
		assertEquals(0,newTest.getInt().size());
		
	}
	@Test
	void testRemoveContactNoID() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTest.deleteContact("test1");
			
		});
	}
	@Test
	void testAddFirstName() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		newTest.updateFirstName( "test", "new");
		assertTrue(newContact.getFirstName().equals("new"));
		
}
	@Test
	void testFirstNameNoID() {
			ContactService newTest = new ContactService();
			contact newContact = new contact("test", "first", "last", "1234567890", "address");
			newTest.addContact(newContact);
			
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newTest.updateFirstName("test1","new");
				
			});
		}
	@Test
	void testAddLastName() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		newTest.updateLastName( "test", "new");
		assertTrue(newContact.getLastName().equals("new"));
		
}
	@Test
	void testLastNameNoID() {
			ContactService newTest = new ContactService();
			contact newContact = new contact("test", "first", "last", "1234567890", "address");
			newTest.addContact(newContact);
			
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newTest.updateLastName("test1","new");
				
			});
		}
	@Test
	void testAddPhone() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		newTest.updatePhoneNumber( "test","0987654321");
		assertTrue(newContact.getPhoneNumber().equals("0987654321"));
		
}
	@Test
	void testPhoneNumberNoID() {
			ContactService newTest = new ContactService();
			contact newContact = new contact("test", "first", "last", "1234567890", "address");
			newTest.addContact(newContact);
			
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newTest.updatePhoneNumber("test1","0987654321");
				
			});
		}
	@Test
	void testAddAddress() {
		ContactService newTest = new ContactService();
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newTest.addContact(newContact);
		newTest.updateAddress( "test","addresses");
		assertTrue(newContact.getAddress().equals("addresses"));
		
}
	@Test
	void testAddressNoID() {
			ContactService newTest = new ContactService();
			contact newContact = new contact("test", "first", "last", "1234567890", "address");
			newTest.addContact(newContact);
			
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newTest.updateAddress("test1","0987654321");
				
			});
		}
	}
	
