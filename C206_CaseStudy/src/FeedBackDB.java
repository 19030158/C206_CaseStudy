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
		
		System.out.println("");
		
       // Enter input 
		System.out.println("Enter Choice : "); 
		subOption = scanner.nextInt();  
		
		processOption(subOption);

	}
	public static void processOption(int subOption) {
		
		while (subOption != 4) {
			if (subOption == 1) {
				// View all feedback
			FeedBackDB.shAllFeedback( allFback);
			break;
				
		
			} else if (subOption  == 2) {
				// View feedback by name 
		     FeedBackDB.fbByName(allFback);
		     break;
		     
			
		
			} else if (subOption  == 3) {
				// Record feedback
			 Feedback feb =fbForm();
		     FeedBackDB.addFeedback(allFback,feb);
		     break;
						
			}
			
			else {
				System.out.println("EXITING");
				break;
			}
			
			//show the menu again & ask for option
//			fbMenu();
			
		}
		menuChoice();

	}
	
	public static String retrieveAllfeedback(ArrayList<Feedback> allFback) {

            String op =" ";
            
		for(int i = 0 ; i < allFback.size() ; i ++) {
			
			
			op += String.format("%-5s %10s\n", allFback.get(i).getFeedback(),allFback.get(i).getName());
			System.out.println(op);
			
		}	
		return op;
	}
	
	public static void shAllFeedback(ArrayList<Feedback> allFback) {
		FeedBackDB.setHeader("FEEDBACK LIST");
		String op = String.format(" %-5s %15s\n","FEEDBACKS:" ,"NAME:");
	    op += retrieveAllfeedback(allFback);	
		System.out.println(op);
	}
	
	public static void fbByName(ArrayList<Feedback> allFback) {
		String name = Helper.readString("ENTER NAME > ");
		
	for(int i = 0 ; i < allFback.size() ; i ++) {
		if(name.equalsIgnoreCase(allFback.get(i).getName())) {
		
			String output = String.format(" %-10s %-10s\n ","NAME" ,"FEEDBACKS");
			output += String.format("%-10s   %-10s\n",allFback.get(i).getName(), allFback.get(i).getFeedback());
			System.out.println(output);
			
		}
		else {
			System.out.println("Invalid Name !!!");
		}	
		}		
	}
	
	public static Feedback fbForm() {
		
		String name = Helper.readString("ENTER NAME >" );
		String fb =Helper.readString("Enter Feedback >" );
		
		Feedback feb = new Feedback(fb,name);
		return feb;
	}
	
	    
	public static void addFeedback(ArrayList<Feedback> allFback , Feedback feb) {
		
		allFback.add(feb);
		System.out.println("Added!");
		
		
	}
	/**
	 * 
	 */
	public static void handleFeedbackOptions() {
		fbMenu();
		
		menuChoice();
		processOption(0);
		
	}
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	
	
}
	