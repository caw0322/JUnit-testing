import java.util.ArrayList;
import java.util.List;
public class ContactService {
	protected List<contact> list;
	
	
	public ContactService() {
		list = new ArrayList<contact>();
	}
	public List<contact> getInt(){
		return list;
		
	}
	public void addContact(contact newContact) {
		
		for(contact c: list) {
			if(c.getContactID().equalsIgnoreCase(newContact.getContactID())) {
				throw new IllegalArgumentException("Invalid ID");
				
			}
			}
			
		list.add(newContact);
		
	}
	public void deleteContact(String contactID) {
		List<contact> temp = new ArrayList();
		for(contact c: list) {
			if((c.getContactID().equalsIgnoreCase(contactID))) {
				temp.add(c);
			}
			else {
				throw new IllegalArgumentException("No ID found");
			}
	}
		list.removeAll(temp);
	} 
	public void updateFirstName(String contactID, String newFirstName) {
		for(contact c: list) {
			if(c.getContactID().equalsIgnoreCase(contactID)) {
				c.setFirstName(newFirstName);
			}
			else {
				throw new IllegalArgumentException("No ID found");
			}
		}
	}
	public void updateLastName(String contactID, String newLastName) {
		for(contact c: list) {
			if(c.getContactID().equalsIgnoreCase(contactID)) {
				c.setLastName(newLastName);
			}
			else {
				throw new IllegalArgumentException("No ID found");
			}
		}
	}
	public void updatePhoneNumber(String contactID, String newPhoneNumber) {
		for(contact c: list) {
			if(c.getContactID().equalsIgnoreCase(contactID)) {
				c.setPhoneNumber(newPhoneNumber);
			}
			else {
				throw new IllegalArgumentException("No ID found");
			}
		}
	}
	public void updateAddress(String contactID, String newAddress) {
		for(contact c: list) {
			if(c.getContactID().equalsIgnoreCase(contactID)) {
				c.setAddress(newAddress);
			}
			else {
				throw new IllegalArgumentException("No ID found");
			}
		}
	}
}


