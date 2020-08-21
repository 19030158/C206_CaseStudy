import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BikePartsDBTest {
// HELLO HOW DO BRO
	private BikeParts part1;
	private BikeParts part2;
	
	private ArrayList<BikeParts> bikePartsList;
	
	public void setUp() throws Exception {
		part1 = (new BikeParts("Seat" , "To fix it on bike", true));
		part2 = (new BikeParts("Wheel" , "To fix it on bike", true));
		
		bikePartsList = new ArrayList<BikeParts>();
	}

}
