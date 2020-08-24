import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;


/**
 * @author 19019072
 *
 */
public class BikeDBTest {
	private ArrayList<Bike> bikeList;
	
	@Before
	public void setUp() throws Exception{
	        Bike b1 = new Bike("cannondale","road bike",true);
	        Bike b2 = new Bike("Giant","mountain bike",true);
	        Bike b3 = new Bike("Giant","road bike",false);
	        BikeDB.setBikeList(new ArrayList<Bike>());
	}
	@Test
	public void retrieveAllBike() {
		assertNotNull("Check if there is an existing bike arraylist to be added to",BikeDB.getBikeList());
		BikeDB.addBike(b1);
		BikeDB.addBike(b2);
		BikeDB.addBike(b3);
		assertEquals("Check if arraylist of bike is 3", 3, BikeDB.getBikeList().size());
		}
	@Test
	public void addBikeTest() {
		assertNotNull("Check if there is an existing bike arraylist to be added to",BikeDB.getBikeList());
		BikeDB.addBike(b1);
		BikeDB.addBike(b2);
		BikeDB.addBike(b3);
		assertEquals("Check if arraylist of bike is 3", 3, BikeDB.getBikeList().get(0));
	}
	@Test
	public void delBike() {
		assertNotNull("Check if there is an existing bike arraylist to be added to",BikeDB.getBikeList());
		BikeDB.addBike(b1);
		BikeDB.addBike(b2);
		BikeDB.addBike(b3);
		BikeDB.delBike(b1);
		BikeDB.delBike(b2);
	
		assertEquals("Check if arraylist of bike is 1", 1, BikeDB.getBikeList().size());
		assertSame("Check if 1 bike is added", b3, BikeDB.getBikeList().get(0));
	}
	@Test
	public void updateBike() {
		assertNotNull("Check if there is an existing bike arraylist to be added to",BikeDB.getBikeList());
		BikeDB.addBike(b1);
		BikeDB.updateBike(1,"TSUNAMI","FIXED BIKE",false);
		assertSame("Check if bike information is updated","TSUNAMI","FIXED BIKE",FALSE, BikeDB.getBikeList().get(0).getModel().getDescription().isAvailable());
	}
}