import java.util.List;
import java.util.ArrayList;
public class TaskService {
	protected List<Task> list;
	
	public TaskService() {
		list = new ArrayList<Task>();
	}
	public List<Task> getInt() {
		return list;
	}
public void addTask(Task newTask) {
		
		for(Task c: list) {
			if(c.getTaskID().equalsIgnoreCase(newTask.getTaskID())) {
				throw new IllegalArgumentException("Invalid ID");
				
			}
			}
			
		list.add(newTask);
		
	}
public void deleteTask(String taskID) {
	List<Task> temp = new ArrayList();
	for(Task c: list) {
		if((c.getTaskID().equalsIgnoreCase(taskID))) {
			temp.add(c);
		}
		else {
			throw new IllegalArgumentException("No ID found");
		}
}
	list.removeAll(temp);
} 
public void updateName(String taskID, String newName) {
	for(Task c: list) {
		if(c.getTaskID().equalsIgnoreCase(taskID)) {
			c.setName(newName);
		}
		else {
			throw new IllegalArgumentException("No ID found");
		}
	}}
public void updateDescription(String taskID, String newDescription) {
	for(Task c: list) {
		if(c.getTaskID().equalsIgnoreCase(taskID)) {
			c.setDescription(newDescription);
		}
		else {
			throw new IllegalArgumentException("No ID found");
		}
	}}
}
