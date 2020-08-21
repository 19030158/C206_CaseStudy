import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION_QUIT = 5;
	
	public static void main(String[] args) {

		
		//insert initial data
		BikeDB.populateBikeDB();
		BikePartsDB.populateBikePartDB();
		FeedBackDB.populateFeedbackDB();
		AppointmentDB.populateAppointmentDB();
		

		
		int option = 0;
			
		while (option != OPTION_QUIT) {
			
			C206_CaseStudy.showMainMenu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				//Call BikeDB 
				BikeDB.handleBikeOptions();
				
				
			}else if (option == 2) {
				//Call BikePartDB menu
				BikePartsDB.handleBikePartOptions();
				
				
				BikePartsDB.menuChoice();

			}else if (option == 3) {
				//Call Feedback menu
				FeedbackDB.handleFeedbackOptions();
				
				
			}else if(option == 4) {
				//Call Appointment menu
				AppointmentDB.handleAppointmentOptions();
		
			}else if(option == 5) {
				System.out.println("Goodbye");
				 
			}
				
		}
		
		//clean up data
		BikeDB.cleanupBikeDB();
		BikePartsDB.cleanupBikePartsDB();
		FeedBackDB.cleanupFeedbackDB();
		AppointmentDB.cleanupAppointmentDB();

	}
	
	public static void showMainMenu() {
		System.out.println("Welcome to the bike shop!");
		System.out.println("1. Display Bike Menu");
		System.out.println("2. Display Bike Parts Menu");
		System.out.println("3. Display Feedback Menu");
		System.out.println("4. Display Appointment Menu");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
}
