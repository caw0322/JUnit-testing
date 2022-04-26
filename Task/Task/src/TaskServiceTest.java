import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void testUniqueID() {
		TaskService newTest = new TaskService();
		Task newTask = new Task("test", "name", "description");
		Task newerTask = new Task("test", "name", "description");
		newTest.addTask(newTask);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTest.addTask(newerTask);
			
		});
}
	@Test
	void testListAdd() {
		TaskService newTest = new TaskService();
		Task newTask = new Task("test", "name", "description");
		newTest.addTask(newTask);
		assertEquals(1,newTest.getInt().size());
		
	}
	@Test
	void testRemoveTask() {
		TaskService newTest = new TaskService();
		Task newTask = new Task("test", "name", "description");
		newTest.addTask(newTask);
		newTest.deleteTask("test");
		assertEquals(0,newTest.getInt().size());
		
	}
	@Test
	void testRemoveTaskNoID() {
		TaskService newTest = new TaskService();
		Task newTask = new Task("test", "name", "description");
		newTest.addTask(newTask);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newTest.deleteTask("test1");
			
		});
	}
	@Test
	void testAddName() {
		TaskService newTest = new TaskService();
		Task newTask = new Task("test", "name", "description");
		newTest.addTask(newTask);
		newTest.updateName( "test", "new");
		assertTrue(newTask.getName().equals("new"));
		
}
	@Test
	void testNameNoID() {
			TaskService newTest = new TaskService();
			Task newTask = new Task("test", "name", "description");
			newTest.addTask(newTask);
			
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newTest.updateName("test1","new");
				
			});
		}
	@Test
	void testAddDescription() {
		TaskService newTest = new TaskService();
		Task newTask = new Task("test", "name", "description");
		newTest.addTask(newTask);
		newTest.updateDescription( "test", "new");
		assertTrue(newTask.getDescription().equals("new"));
		
}
	@Test
	void testDescriptionNoID() {
			TaskService newTest = new TaskService();
			Task newTask = new Task("test", "name", "description");
			newTest.addTask(newTask);
			
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newTest.updateDescription("test1","new");
				
			});
		}
}
