import java.util.Date;
public class Appointment {
	private final String appointmentID;
	private Date date;
	private String description; 
	
	public Appointment(String appointmentID, Date date, String description) {
		if(appointmentID == null || appointmentID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		Date currentDate = new Date();
		if(date == null || currentDate.after(date)) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.appointmentID = appointmentID;
		this.date = date;
		this.description = description;
	}
	public void setDate(Date date) {
		Date currentDate = new Date();
		if(date == null || currentDate.after(date)) {
			throw new IllegalArgumentException("Invalid Date");
		}
		this.date = date;
	}
	public void setDescription(String description) {
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = description;
	}
	public String getAppointmentID() {
		return appointmentID;
	}
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
}
