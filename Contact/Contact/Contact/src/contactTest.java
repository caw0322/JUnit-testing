import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class contactTest {

	@Test
	void testContactClass() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		assertTrue(newContact.getContactID().equals("test"));
		assertTrue(newContact.getFirstName().equals("first"));
		assertTrue(newContact.getLastName().equals("last"));
		assertTrue(newContact.getPhoneNumber().equals("1234567890"));
		assertTrue(newContact.getAddress().equals("address"));
	}
	
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test5678901", "first", "last", "1234567890", "address");
		});
	}
	@Test
	void testContactIDNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact(null, "first", "last", "1234567890", "address");
			
		});
		
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", "first123456789", "last", "1234567890", "address");
		});
	}
	@Test
	void testFirstNameNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", null, "last", "1234567890", "address");
			
		});
		
	}
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", "first", "last123456789", "1234567890", "address");
		});
	}
	@Test
	void testLastNameNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", "first", null, "1234567890", "address");
			
		});
		
	}
	@Test
	void testPhoneNumberLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", "first", "last", "123456789", "address");
		});
	}
	@Test
	void testPhoneNumberNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", "first", "last", null, "address");
			
		});
		
	}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", "first", "last", "1234567890", "address11111111111111111111111111111111111111");
		});
	}
	@Test
	void testAddressNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("test", "first", "last", "1234567890", null);
			
		});
		
	}
	@Test
	void testSetFirstName() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newContact.setFirstName("first1");
		assertTrue(newContact.getFirstName().equals("first1"));
	}
	@Test
	void testSetFirstNameTooLong() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName("first1111111111111");
			
		});
			
	}
	@Test
	void testSetFirstNameNull() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName(null);
			
		});
			
	}
	@Test
	void testSetLastName() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newContact.setLastName("first1");
		assertTrue(newContact.getLastName().equals("first1"));
	}
	@Test
	void testSetLastNameTooLong() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName("first1111111111111111");
			
		});
			
	}
	@Test
	void testSetLastNameNull() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName(null);
			
		});
			
	}
	@Test
	void testSetPhoneNumber() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newContact.setPhoneNumber("0987654321");
		assertTrue(newContact.getPhoneNumber().equals("0987654321"));
	}
	@Test
	void testSetPhoneNumberNotTen() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhoneNumber("1234");
			
		});
			
	}
	@Test
	void testSetPhoneNumberNull() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhoneNumber(null);
			
		});
			
	}
	@Test
	void testSetAddress() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		newContact.setAddress("first1");
		assertTrue(newContact.getAddress().equals("first1"));
	}
	@Test
	void testSetAddressTooLong() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName("first1111111111111111111111111111111111111111111");
			
		});
			
	}
	@Test
	void testSetAddressNull() {
		contact newContact = new contact("test", "first", "last", "1234567890", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress(null);
			
		});
			
	}
}
	
	
	

