import java.util.ArrayList;

public class CustomerDB {

	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void addCustomer(Customer cus) {
		//add some data to the list
		
		if(customerList.contains(cus) == false) {
			customerList.add(cus);
			System.out.println("Successfully added!");
		} else {
			System.out.println("Customer is already in list!");
		}
	}
	
	public static void delCustomer(int cusID) {
		//clean up the data in the list
		customerList.remove(cusID - 1);
		
	}
	
	
	public static void viewAllCustomer() {
		
		if (customerList.size() > 0) {
			String output = String.format("%-10s %-10s %-10s %-10s\n","No.","Name","Email","Phone");
			for(int i=0; customerList.size() > i; i++) {
				output += String.format("%-10d %-10s %-10s %-10s\n", i+1, customerList.get(i).getName(),customerList.get(i).getEmail(), customerList.get(i).getPhone());
			}
			System.out.println(output);
		}
		
	}
	
	public static void searchCustomerName() {
		
		boolean found = false;
		String name = Helper.readString("Enter name > ");
		String output = String.format("%-10s %-10s %-10s %-10s\n","No.","Name","Email","Phone");
		for (int i = 0; customerList.size() > i; i++) {
			if (customerList.get(i).getName().equals(name)) {
				output += String.format("%-10d %-10s %-10s %-10s\n", i+1, customerList.get(i).getName(),customerList.get(i).getEmail(), customerList.get(i).getPhone());
				break;
			}
			
		}
		if (found == true) {
			System.out.println(output);
		}
		else {
			System.out.println("No customer found");
		}
		
		
		
		
	}
	
	public static void showCustomerMenu() {
		//Display the menu
		System.out.println("1. View all Customer");
		System.out.println("2. Add Customer");
		System.out.println("3. Delete Customer");
		System.out.println("4. Search Customer by Name");
		System.out.println("5. Exit");
		
	}	
	
	public static void processOption(int subOption) {
			
		subOption =0;
		
		while (subOption != 5) {

			showCustomerMenu();			
			
			subOption = Helper.readInt("Enter option> ");
			
			if (subOption == 1) {
				// View all Customer
			    viewAllCustomer();
				
			} else if (subOption  == 2) {
				// Add a Customer
				Customer newCust = inputCustomerToAdd();
				addCustomer(newCust);
		
			} else if (subOption  == 3) {
				// Delete a Customer
				viewAllCustomer();
				int delete = selectCustomerToDelete();
				int size = customerList.size();
				delCustomer(delete);
				if (size != customerList.size()) {
					System.out.println("Successfully deleted!");
				} else {
					System.out.println("Delete unsuccessful.");
				}
				
			} else if ( subOption == 4) {
			
				searchCustomerName();
				
			}else if (subOption ==5){
				//invalid option
				System.out.println("End");
				break;
			} else {
				System.out.println("Invalid type");
			}
		}
	
	}
	
	// ====== Option 2 ========
	public static Customer inputCustomerToAdd() {
		
		String name = Helper.readString("Enter name > ");
		String email = Helper.readString("Enter email > ");
		String phone = Helper.readString("Enter phone > ");
		
		Customer newCus = new Customer(name,email,phone);
		return newCus;
		
	}
	
	// ====== Option 3 ======
	public static int selectCustomerToDelete() {
		
		int number = Helper.readInt("Enter NO. to delete > ");
		return number;
		
	}
}