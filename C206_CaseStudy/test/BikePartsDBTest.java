import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BikePartsDBTest {
	private BikeParts part1;
	private BikeParts part2;
	
	private ArrayList<BikeParts> bikePartsList;
	
	public void setUp() throws Exception {
		part1 = (new BikeParts("Seat" , "To fix it on bike", true));
		part2 = (new BikeParts("Wheel" , "To fix it on bike", true));
		
		bikePartsList = new ArrayList<BikeParts>();
	}
	
	@Test
	public void viewtest() {
		// Check if list is not null so able to display
		assertNotNull("Test if there is a valid BikeParts arraylist", bikePartsList);

		// Given an empty list, test the appointment list have the size of 0
		assertEquals("Test if the BikeParts arraylist size is 0", 0, bikePartsList.size());

		// Given an empty list, after adding 4 item, the size of the list is 4
		assertEquals("Test if that BikeParts arraylist size is 4?", 4, bikePartsList.size());

		// Test if the expected output string same as the list of AppointmentDB
		//String viewAll = C206_CaseStudy.viewAllBikeParts(bikepartsList);

		String output = String.format("%-5d %-5s - %-10s - %-10s", "ID", "Name", "Description", "Availability");
		for (int i = 0; bikePartsList.size() > i; i++) {
			output += String.format("%-5d %-5s - %-10s - %-10s", i + 1, bikePartsList.get(i).getPartName(),
					bikePartsList.get(i).getDescription(), bikePartsList.get(i).isAvailable());
		}
		//assertEquals("Check view BikeParts list", output, viewAll);
	}

	@Test
	public void addBikePartstest() {

		// Item list is not null, so that can add a new appointment
		assertNotNull("Test if there is valid BikeParts arraylist to add to", bikePartsList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		assertEquals("Test if that BikeParts arraylist size is 1?", 1, bikePartsList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that BikeParts is added same as 1st item of the list?", part2, bikePartsList.get(0));

	}

	@Test
	public void deletetest(){
		 //Item list is not null, so that can delete a new appointment
		assertNotNull("Test if there is valid BikeParts arraylist to delete to", bikePartsList);


	}

}
