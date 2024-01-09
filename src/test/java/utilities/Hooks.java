package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static broswerDriver driver;
	
	
//	@Before
	public void setup() {
	driver = new broswerDriver();
	}
	
	//@After
	public void tearDown() {
		driver.close();
	}
	
	
}
