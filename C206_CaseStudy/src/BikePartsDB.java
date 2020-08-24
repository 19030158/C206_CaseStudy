import java.util.ArrayList;
import java.util.Scanner;

public class BikePartsDB {
	
	private static ArrayList<BikeParts> bikePartsList = new ArrayList<BikeParts>();
	
	public static void populateBikePartDB() {
		//add some data to the list
		BikeParts bikeP1 = new BikeParts("Grip" , "To fix it on handle", true);
		BikeParts bikeP2 = new BikeParts("Paddle", "For cycle", true);
		BikeParts bikeP3 = new BikeParts("Bell", "For signal", true);
		bikePartsList.add(bikeP1);
		bikePartsList.add(bikeP2);
		bikePartsList.add(bikeP3);

	}
	
	public static void clearBikeParts() {
		//clean up the data in the list
		for (int i = 0; i < bikePartsList.size(); i++) {
			bikePartsList.clear();
		}
	}
	
	
	public static void menuChoice() {
		//show bike menu, ask user for input, process the choice
		/* int subOption = 0;

		// Enter input 
		subOption = Helper.readInt("Enter Choice : ");
		
		System.out.println("Choice : " + subOption);
		*/
		showBikePartsMenu();
		int subOption = Helper.readInt("Enter Option (1-5) > ");
		processOption(subOption);
	}
	
	public static void showBikePartsMenu() {
		//Display the menu
		Helper.line(30, "=");
		System.out.println("Bike Parts Menu");
		Helper.line(30, "=");
		System.out.println("Option 1 - View All Bike Parts");
		System.out.println("Option 2 - Add Bike Parts");
		System.out.println("Option 3 - Delete Bike Parts");
		System.out.println("Option 4 - Update Bike Parts");
		System.out.println("Option 5 - Exit");

	}	
	
	public static void processOption(int subOption) {
			
		while (subOption != 5) {
			if (subOption == 1) {
				// View all bike parts
			
				viewAllBikeParts();
		
			} else if (subOption  == 2) {
				// Add a bike part
				addBikeParts();
				
			} else if (subOption  == 3) {
				// Delete a bike part
				delBikeParts();
				
			} else if (subOption  == 4) {
				// Update a bike part
				upBikeParts();	
				
			}else {
				//invalid option
				System.out.println("Invalid type");
			}
			
			//show the menu again & ask for option
			menuChoice();
			
		}
	
	}
	
	public static void viewAllBikeParts() {
		//display all bikes in the list
		for (int i = 0; i < bikePartsList.size(); i++) {
			System.out.println(String.format("%-5d %-5s - %-10s - %-10s", i+1, bikePartsList.get(i).getPartName(), bikePartsList.get(i).getDescription(), bikePartsList.get(i).isAvailable()));
		}
	}
	
	
	
	public static void addBikeParts() {
		/*	//request user for the bike to add to the list
		String bPtoAdd;
		String toAddDesc;
		// Enter input 
		bPtoAdd= Helper.readString("Enter Bike Part > "); 
		toAddDesc = Helper.readString("Enter Bike Part Description > "); 
		//set isAvailable to true
		BikeParts new1 = new BikeParts(bPtoAdd, toAddDesc, true);
		addBike(new1);*/

		String name = Helper.readString("Enter Part Name > "); 
		String desc = Helper.readString("Enter Part Description > ");
		boolean isAvail = Helper.readBoolean("Enter Availablity > ");

		BikeParts newBike = new BikeParts(name, desc, isAvail);
		bikePartsList.add(newBike);
	}
	
/*	public static void addBikeParts(BikeParts bk) {
		//add bike to list
		bikePartsList.add(bk);
	}
	*/
	
	public static void delBikeParts() {
		//remove bike to list
		viewAllBikeParts();
		int toDel = Helper.readInt("Enter ID to delete > ");
		int toDelIndex = toDel - 1;
			bikePartsList.remove(toDelIndex); //removes the bikePart with the id bikeID
		
	}
	
	public static void upBikeParts() {
		viewAllBikeParts();
		int toUpdate = Helper.readInt("Enter ID to update > ");
		boolean isUpdated = false;
		
		int idxToUpdate = toUpdate - 1;
		for(int i = 0; i < bikePartsList.size(); i++) {
			if(idxToUpdate == i) {
				boolean newAvail = Helper.readBoolean("New Availability > ");
				bikePartsList.get(i).setAvailable(newAvail);
				isUpdated = true;
				System.out.println("Updated");
			}
		}
		if(isUpdated == false) {
			System.out.println("Update Failed");
		}
	}
	public static void cleanupBikePartsDB() {
		bikePartsList.clear();
	}
}
