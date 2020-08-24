
import java.util.ArrayList;

public class BikeDB  {


    private static ArrayList<Bike> bikeList = new ArrayList<Bike>();
     
    public static void populateBikeDB() {
        //add some data to the list
        Bike b1 = new Bike("cannondale","road bike",true);
        Bike b2 = new Bike("Giant","mountain bike",true);
        Bike b3 = new Bike("Giant","road bike",false);
        bikeList.add(b1);
        bikeList.add(b2);
        bikeList.add(b3);
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
        System.out.println("BIKE MENU");
        Helper.line(50,"=");
        System.out.println("1. VIEW BIKE");
        System.out.println("2. ADD BIKE");
        System.out.println("3. DELETE BIKE");
        System.out.println("4. UPDATE BIKE");
        System.out.println("5. EXIT");
    }    
    
    public static void processOption(int subOption) {
            
        while (subOption != 5) {
            showBikeMenu();
            subOption = Helper.readInt("ENTER OPTION:");
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
            }else if (subOption == 4) {
            updateBike();
            handleBikeOptions();
            
                                
            } else if (subOption == 5) {
                System.out.println("END BIKE MENU");
                
            }else {
            
                //invalid option
                System.out.println("INVALID TYPE");
                
            }
        }
            
            //show the menu again & ask for option
        
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
            output = String.format("%-5S %-11S %-16S %S\n", "ID", "NAME", "DESC", "AVAIL");
            for (Bike b : bikeList) {
                i++;
                output += String.format("%-4S %-10S %-15S %S \n", i, b.getModel(), b.getDescription(), b.getIsAvailable());
            }
        } else {
            output += "NO BIKE AVAILABLE";
        }
        return output;
    }
    
    //==========Option 2 ==============
    public static Bike inputBikeDetails() {
        //request user for the bike to add to the list
        String model = Helper.readString("ENTER BIKE NAME : ");
        String description = Helper.readString("ENTER DESCIRPTION FOR BIKE: ");
        boolean isAvailable = Helper.readBoolean("ENTER AVAILABILITY FOR BIKE:");
        return new Bike(model, description, isAvailable);
    }
    public static void addBike(Bike b) {
        //add bike to list
        
        bikeList.add(b);
        System.out.println("BIKE ADDED");
    }

 

 

 

    
        
    //==========Option 3 ==============
    public static int selectBike() {
        //request the user to select bike for process
        int id = Helper.readInt("ENTER BIKE ID:");
        return id;
    }
    
    public static void delBike(Bike b) {
        //remove bike to list
        bikeList.remove(b);
        System.out.println("BIKE DELETED");
        
    }
    //=========== Option 4 =================
    public static void updateBike() {
        int i = 0;
        System.out.println("=========================UPDATE BIKE INFO============================");
        String output =  String.format("%-5S %-11S %-16S %S\n", "ID", "NAME", "DESC", "AVAIL");
        for (Bike b : bikeList) {
            i++;
            output += String.format("%-4S %-10S %-15S %S \n", i, b.getModel(), b.getDescription(), b.getIsAvailable());
        }
        
        System.out.println(output);
        String name = Helper.readString("ENTER NAME OF BIKE TO UPDATE: ");
        for (int n = 0; n < bikeList.size(); n++) {
            if (bikeList.get(n).getModel().equalsIgnoreCase(name)) {      
                String newName = Helper.readString("ENTER NEW BIKE MODEL: ");
                String newDesc = Helper.readString("ENTER NEW DESCRIPTION: ");
                Boolean newAvail = Helper.readBoolean("ENTER AVAILABILITY OF BIKES (TRUE/FALSE): ");
                Bike updateBike = new Bike (newName, newDesc, newAvail);
                bikeList.set(n, updateBike);
                
                
                System.out.println("SUCCESSFULLY UPDATED!");
                break;
            } else {
                System.out.println("");
            }
        }
     }
        
    
    //==============Helper Functions=======
    public static ArrayList<Bike> getBikeList() {
        return bikeList;}
    
    public static void setBikeList(ArrayList<Bike> b) {
        bikeList = b ;
    }
} 