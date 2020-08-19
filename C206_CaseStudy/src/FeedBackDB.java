import java.util.ArrayList;
import java.util.Scanner;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19008997, 18 Aug 2020 4:09:08 pm
 */

public class FeedBackDB {
	private static ArrayList<Feedback> allFback  = new ArrayList<Feedback>();
	

	public static void fbMenu()  {
	//Display the menu
	System.out.println("===================");
	System.out.println("FEEDBACK MENU");
	System.out.println("===================");
	System.out.println("1 - View All Feedback");
	System.out.println("2 - View Feedback by Name");
	System.out.println("3 - FEEDBACK FORM ");
	System.out.println("4 - EXIT");
}	
	public static void menuChoice() {
		//show bike menu, ask user for input, process the choice
		int subOption = 0;
		Scanner scanner= new Scanner(System.in);
       // Enter input 
		System.out.println("Enter Choice : "); 
		subOption = scanner.nextInt();   
		
		System.out.println("Choice : " + subOption);
	}
	public static void processOption(int subOption) {
		
		while (subOption != 4) {
			if (subOption == 1) {
				// View all feedback
			shAllFeedback();
				
		
			} else if (subOption  == 2) {
				// View feedback by name 
		     fbByName();
			
		
			} else if (subOption  == 3) {
				// Record feedback
		     fbForm();
						
			}
			
			else {
				System.out.println("EXITING");
			}
			
			//show the menu again & ask for option
			fbMenu();
			menuChoice();
		}

	}
	
	public static void shAllFeedback() {
		
		for(int i = 0 ; i < allFback.size() ; i ++) {
			
			String output = String.format(" %-10s ","FEEDBACKS");
			output += String.format("-10s", allFback.get(i).getFeedback());
			System.out.println(output);
			
			
		}		
	}
	
	public static void fbByName() {
		String name = Helper.readString("ENTER NAME > ");
		
	for(int i = 0 ; i < allFback.size() ; i ++) {
		if(name.equalsIgnoreCase(allFback.get(i).getName())) {
		
			String output = String.format(" %-10s %-10s ","NAME" ,"FEEDBACKS");
			output += String.format("%-10s   %-10s",allFback.get(i).getName(), allFback.get(i).getFeedback());
			System.out.println(output);
			
		}
		else {
			System.out.println("Invalid Name !!!");
		}	
		}		
	}
}