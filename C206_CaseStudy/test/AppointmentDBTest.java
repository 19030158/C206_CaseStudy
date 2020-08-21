import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19030158, 11 Aug 2020 4:10:55 pm
 */

public class AppointmentDBTest {
	
	private Appointment c1;
	private Appointment c2;
	
	private ArrayList<Appointment> appointmentList;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Appointment("13/08", "7:30 P.M", "John Smith", "CBR 1000");
		c2 = (new Appointment("15/08", "12:45 P.M", "Jane Doe", "Bike oil"));
		
		appointmentList = new ArrayList<Appointment>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testViewAllAppointment() {
		//Check appointment list not null
		assertNotNull("Check if list not null", appointmentList);
		//Check if output of appointment list is same as appointment list content
		appointmentList.add(c1);
		appointmentList.add(c2);
		
		String allAppt = AppointmentDB.retrieveAllAppointment(appointmentList);
		String testOutput = "";
		
		testOutput += String.format("%-20s %-20s %-80s %-80s\n", "13/08", "7:30 P.M", "John Smith", "CBR 1000");
		testOutput += String.format("%-20s %-20s %-80s %-80s\n", "15/08", "12:45 P.M", "Jane Doe", "Bike oil");
		assertEquals(testOutput, allAppt);
		
	}
	
	public void testAddAppointment() {
		//Check appointment list not null
		assertNotNull("Check if list not null", appointmentList);
		//Check when something is added into the list, the list size increases and correct item is added in
		AppointmentDB.addAppointment(appointmentList, c1);
		assertEquals("Check list size is now 1", 1, appointmentList.size());
		assertSame("Check that correct item is added", c1, appointmentList.get(0));
	}
	
}
