import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;
class AppointmentTest {

	@Test
	void testAppointmentClass() {
		Date currentDate = new Date();
		Appointment appt = new Appointment("test",currentDate, "description" );
		assertTrue(appt.getAppointmentID().equals("test"));
		assertTrue(appt.getDate().equals(currentDate));
		assertTrue(appt.getDescription().equals("description"));
	}
	@Test
	void testAppointmentIDTooLong() {
		Date currentDate = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Appointment("test1234567890",currentDate, "description" );
		});
	}
	
	@Test
	void testAppointmentIDNull() {
		Date currentDate = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Appointment(null,currentDate, "description" );
		});
	}
	@Test
	void testDateBeforeCurrent() {
		Date notCurrentDate = new Date((new Date().getTime()-12));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Appointment("test",notCurrentDate, "description" );
		});
	}
	@Test
	void testDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Appointment("test",null, "description" );
		});
	}
	@Test
	void testDescriptionTooLong() {
		Date currentDate = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Appointment("test",currentDate, "description00000000000000000000000000000000000000000000000000000000" );
		});
	}
	@Test
	void testDescriptionNull() {
		Date currentDate = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Appointment("test",currentDate, null );
		});
	}
	@Test
	void testSetDate() {
		Date date = new Date();
		Date newDate = new Date((new Date().getTime() + 12));
		Appointment appt = new Appointment("test", date, "description");
		appt.setDate(newDate);
		assertTrue(appt.getDate().equals(newDate));
	}
	@Test
	void testSetDateBefore() {
		Date date = new Date();
		Date newDate = new Date((new Date().getTime() - 12));
		Appointment appt = new Appointment("test", date, "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appt.setDate(newDate);
			
		});
	}
	@Test
	void testSetDateNull() {
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appt.setDate(null);
		});
	}
	@Test
	void testSetDescription() {
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		appt.setDescription("new");
		assertTrue(appt.getDescription().equals("new"));
	}
	@Test
	void testSetDescriptionTooLong() {
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appt.setDescription("00000000000000000000000000000000000000000000000000000000");
			
		});
	}
	@Test
	void testSetDescriptionNull() {
		Date date = new Date();
		Appointment appt = new Appointment("test", date, "description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appt.setDescription(null);
			
		});
	}
}
