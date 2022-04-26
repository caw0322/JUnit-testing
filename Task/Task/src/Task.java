
public class Task {
	private final String taskID;
	private String name;
	private String description;
	
	//Default constructor with exceptions to meet criteria
	public Task(String taskID, String name, String description) {
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		this.taskID = taskID;
		this.name = name;
		this.description = description;
		
	}
	
	public void setName(String name){
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.name = name;
		
	}
	public void setDescription(String description){
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.description = description;
		
	}
	
	public String getTaskID() {
		return taskID;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
}
