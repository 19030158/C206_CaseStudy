import java.util.ArrayList;
import java.util.Scanner;

public class BikePartsDB {
	
	private static ArrayList<BikeParts> bikePartsList = new ArrayList<BikeParts>();
	
	public static void addBikeParts(String BikeParts) {
		//add some data to the list
		BikeParts bikeP1 = new BikeParts("Grip" , "To fix it on handle", true );
		BikeParts bikeP2 = new BikeParts("Paddle", "For cycle", true);
		BikeParts bikeP3 = new BikeParts("Bell", "For signal", true);
	}
	
	public static void delBikeParts(String BikeParts) {
		//clean up the data in the list
		for (int i = 0; i < bikePartsList.size(); i++) {
			bikePartsList.clear();
		}
	}
	
	
	public static void menuChoice() {
		//show bike menu, ask user for input, process the choice
		int subOption = 0;
		Scanner myObj = new Scanner(System.in);
//
		// Enter input 
		System.out.println("Enter Choice : "); 
		subOption = myObj.nextInt();   
		
		System.out.println("Choice : " + subOption);
	}
	
	public static void showBikePartsMenu() {
		//Display the menu
		System.out.println("===================");
		System.out.println("Bike Parts Menu");
		System.out.println("===================");
		System.out.println("Option 1 - View All Bike Parts");
		System.out.println("Option 2 - Add Bike Parts");
		System.out.println("Option 3 - Delete Bike Parts");
	}	
	
	public static void processOption(int subOption) {
			
		while (subOption != 4) {
			if (subOption == 1) {
				// View all bike
			
				viewAllBikeParts();
		
			} else if (subOption  == 2) {
				// Add a bike
				addBikeParts(null);
		
			} else if (subOption  == 3) {
				// Delete a bike
			//	delBike();
							
			}else {
				//invalid option
				System.out.println("Invalid type");
			}
			
			//show the menu again & ask for option
			showBikePartsMenu();
			menuChoice();
			
		}
	
	}
	
	//==========Option 1 ==============
	public static void viewAllBikeParts() {
		//display all bikes in the list
		for (int i = 1; i < bikePartsList.size(); i++) {
			System.out.println(String.format("%-5d, %-5s", i+1, bikePartsList.get(i).getPartName()));
		}
	}
	
	/*public static String retrieveAllBikeParts() {
		return null;
		//retrieve and format all bikes in the list
	}*/
	
	
	//==========Option 2 ==============
	public static void inputBikeDetails() {
		//request user for the bike to add to the list
		Scanner myObj = new Scanner(System.in);
		String bPtoAdd;
		String toAddDesc;
		// Enter input 
		System.out.println("Enter Bike Part : "); 
		bPtoAdd = myObj.nextLine();  
		System.out.println("Enter Bike Part Description : "); 
		toAddDesc = myObj.nextLine();  
//set isAvailable to true
		BikeParts new1 = new BikeParts(bPtoAdd, toAddDesc, true);
		addBike(new1);
	}
	
	public static void addBike(BikeParts bk) {
		//add bike to list
		bikePartsList.add(bk);
	}
	
		
	//==========Option 3 ==============
	public static int selectBike() {
		Scanner myObj = new Scanner(System.in);
		int toDel;
		// Enter input 
		System.out.println("Enter Bike Part No. : "); 
		toDel = myObj.nextInt();   
		int finalDel = toDel - 1;
		
		delBike(finalDel);

		return finalDel;
		//request the user to select bike for process
	}
	
	public static void delBike(int bikeID) {
		//remove bike to list
		for (int i = 0; i < bikePartsList.size(); i++) {
			bikePartsList.remove(bikeID);
		}
	}
	
	
	//==============Helper Functions=======
	public static int getBikePartsDBSize() {
		return bikePartsList.size();
	}
	
	public static String getBikeInfo(int bikeID) {
		return null;
		//format and return the string
	}
}
