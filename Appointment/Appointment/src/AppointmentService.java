import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class AppointmentService {
	protected List<Appointment> list;

public AppointmentService(){
	list = new ArrayList<Appointment>();
}
public List<Appointment> getInt(){
	return list;
}
public void addAppointment(Appointment newAppointment) {
	
	for(Appointment c: list) {
		if(c.getAppointmentID().equalsIgnoreCase(newAppointment.getAppointmentID())) {
			throw new IllegalArgumentException("Invalid ID");
			
		}
		}
		
	list.add(newAppointment);
	
}
public void deleteAppointment(String AppointmentID) {
	List<Appointment> temp = new ArrayList();
	for(Appointment c: list) {
		if((c.getAppointmentID().equalsIgnoreCase(AppointmentID))) {
			temp.add(c);
		}
		else {
			throw new IllegalArgumentException("No ID found");
		}
}
	list.removeAll(temp);
} 
}
