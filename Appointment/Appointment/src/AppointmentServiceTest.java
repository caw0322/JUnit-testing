import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
class AppointmentServiceTest {

	@Test
	void testUniqueID() {
		AppointmentService apptService = new AppointmentService();
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		Appointment appt2 = new Appointment("test", date, "description");
		apptService.addAppointment(appt);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			apptService.addAppointment(appt2);
			
		});
	}
	@Test
	void testListAdd() {
		AppointmentService apptService = new AppointmentService();
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		apptService.addAppointment(appt);
		assertEquals(1,apptService.getInt().size());
		
	}
	@Test
	void testListRemove() {
		AppointmentService apptService = new AppointmentService();
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		apptService.addAppointment(appt);
		apptService.deleteAppointment("test");
		assertEquals(0,apptService.getInt().size());
		
	}
	@Test
	void testListRemoveNoID() {
		AppointmentService apptService = new AppointmentService();
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		apptService.addAppointment(appt);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		apptService.deleteAppointment("test1");
		});
	
	}
}
