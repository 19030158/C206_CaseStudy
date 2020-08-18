import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION_QUIT = 5;
	
	public static void main(String[] args) {
		
		//insert initial data
	//	BikeDB.populateBikeDB();
		
		int option = 0;
			
		while (option != OPTION_QUIT) {
			
			C206_CaseStudy.showMainMenu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				//Call BikeDB 
			//	BikeDB.handleBikeOptions();
				
				
			}else if (option == 2) {
				//Call BikePartDB menu
				BikePartsDB.menuChoice();
			}else if (option == 3) {
				//Call Feedback menu
				
			}else if(option == 4) {
				//Call Appointment menu
		
			}else if(option == 5) {
				//quit
				
			}
				
		}
		
		//clean up data
//		BikeDB.cleanupBikeDB();
	}
	
	public static void showMainMenu() {
		//insert your menu here

	}
	
}
