
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19030158, 11 Aug 2020 3:50:49 pm
 * Created by jenessa
 */


public class Appointment {

	//declare class parameters
	private String date;
	private String time;
	private String customerName;
	private String productDetail;
	

	public Appointment(String date, String time, String customerName, String productDetail) {
		this.date = date;
		this.time = time;
		this.customerName = customerName;
		this.productDetail = productDetail;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getProductDetail() {
		return productDetail;
	}


	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	public void displayAppointment() {
		System.out.println("Date: " + date);
		System.out.println("Time: " + time);
		System.out.println("Customer Name: " + customerName );
		System.out.println("Products: " + productDetail);
	}


	

}

