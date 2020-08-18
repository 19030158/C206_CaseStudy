
public class BikeParts {

	//declare class parameters
	private String partName;
	private String description;
	private boolean isAvailable;
	
	
	public BikeParts(String partName, String description, boolean isAvailable) {
		this.partName = partName;
		this.description = description;
		this.isAvailable = isAvailable;
	}


	public String getPartName() {
		return partName;
	}


	public void setPartName(String partName) {
		this.partName = partName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


}
