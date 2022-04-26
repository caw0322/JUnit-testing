import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void testContactClass() {
		Task newTask = new Task("test", "name", "description");
		assertTrue(newTask.getTaskID().equals("test"));
		assertTrue(newTask.getName().equals("name"));
		assertTrue(newTask.getDescription().equals("description"));
	
	}
	@Test
	void testTaskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("test5678901", "name", "description");
		});
	}
	@Test
	void testTaskIDNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "name", "description");
			
		});
		
	}
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", "name1234567890987654321", "description");
		});
	}
	@Test
	void testNameNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", null, "description");
			
		});
		
	}
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", "name", "123456789012345678901234567890123456789012345678901234567890");
		});
	}
	@Test
	void testDescriptionNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("test", "name", null);
			
		});
		
	}
	@Test
	void testSetName() {
		Task newTask = new Task("test", "name", "description");
		newTask.setName("name1");
		assertTrue(newTask.getName().equals("name1"));
	}
	@Test
	void testSetNameTooLong() {
		Task newTask = new Task("test", "name", "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setName("name111111111111111111111111111111111111111111111111111");
			
		});	
	}
	@Test
	void testSetNameNull() {
		Task newTask = new Task("test", "name", "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setName(null);
			
		});
		
			
	}
	@Test
	void testSetDescription() {
		Task newTask = new Task("test", "name", "description");
		newTask.setDescription("name1");
		assertTrue(newTask.getDescription().equals("name1"));
	}
	@Test
	void testSetDescriptionTooLong() {
		Task newTask = new Task("test", "name", "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setDescription("name111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
			
		});
			
	}
	@Test
	void testSetDescriptionNull() {
		Task newTask = new Task("test", "name", "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTask.setDescription(null);
			
		});
			
	}
}
