
import java.util.ArrayList;

public class BikeDB  {

	private static ArrayList<Bike> bikeList = new ArrayList<Bike>();

		 
	 
	public static void populateBikeDB() {
		//add some data to the list
		Bike b1 = new Bike("cannondale","road bike",true);
		Bike b2 = new Bike("Giant","mountain bike",true);
		bikeList.add(b1);
		bikeList.add(b2);
	}
	
	public static void cleanupBikeDB() {
		//clean up the data in the list
		bikeList.clear();
	}
	
	
	public static void handleBikeOptions() {
		//show bike menu, ask user for input, process the choice
		int subOption = 0;
		processOption(subOption);
		
		
	}
	
	public static void showBikeMenu() {
		//Display the menu
		Helper.line(50,"=");
		System.out.println("Bike Menu");
		Helper.line(50,"=");
		System.out.println("1. View Bike");
		System.out.println("2. Add Bike");
		System.out.println("3. Delete Bike");
		System.out.println("4. Exit");
	}	
	
	public static void processOption(int subOption) {
			
		while (subOption != 4) {
			showBikeMenu();
			subOption = Helper.readInt("Enter option:");
			if (subOption == 1) {
				// View all bike
				viewAllBike();
				
		
			} else if (subOption  == 2) {
				// Add a bike
				Bike b = inputBikeDetails();
				addBike(b);
		
			} else if (subOption  == 3) {
				// Delete a bike
				int i = selectBike();
				try {
					delBike(bikeList.get(i-1));
				
				} catch (IndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
							
			} else if (subOption == 4) {
				System.out.println("End Bike Menu");
				
			}else {
			
				//invalid option
				System.out.println("Invalid type");
				
			}
			
			//show the menu again & ask for option
			Helper.line(50,"=");
			System.out.println("Bike Menu");
			Helper.line(50,"=");
			System.out.println("1. View Bike");
			System.out.println("2. Add Bike");
			System.out.println("3. Delete Bike");
			System.out.println("4. Exit");
			
		
		}
	
	}
	
	//==========Option 1 ==============
	public static void viewAllBike() {
		//display all bikes in the list
		System.out.println(retrieveAllBike());
		
	}
	
	public static String retrieveAllBike() {
		
		//retrieve and format all bikes in the list
		int i = 0;
		String output = "";
		if (!bikeList.isEmpty()) {
			output = String.format("%-5S%-11S%-16S %S\n", "ID", "NAME", "DESC", "PRICE");
			for (Bike b : bikeList) {
				i++;
				output += String.format("%-4S %-10S %-15S %.2f \n", i, b.getModel(), b.getDescription(), b.getIsAvailable());
			}
		} else {
			output += "No bikeparts available";
		}
		return output;
	}
	
	//==========Option 2 ==============
	public static Bike inputBikeDetails() {
		//request user for the bike to add to the list
		String model = Helper.readString("Enter Bike Name : ");
		String description = Helper.readString("Enter description for bike : ");
		boolean isAvailable = Helper.readBoolean("Enter availability of bike :");
		return new Bike(model, description, isAvailable);
	}
	public static void addBike(Bike b) {
		//add bike to list
		
		bikeList.add(b);
		System.out.println("Bike added");
	}

	
		
	//==========Option 3 ==============
	public static int selectBike() {
		//request the user to select bike for process
		int id = Helper.readInt("Enter Bike ID:");
		return id;
	}
	
	public static void delBike(Bike b) {
		//remove bike to list
		bikeList.remove(b);
		System.out.println("BikePart deleted");
		
	}
	
	
	//==============Helper Functions=======
	public static ArrayList<Bike> getBikeList() {
		return bikeList;}
	
	public static void setBikeList(ArrayList<Bike> b) {
		bikeList = b ;
	}
}
	 