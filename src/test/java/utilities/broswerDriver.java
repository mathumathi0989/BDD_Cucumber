package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class broswerDriver {

		public static WebDriver driver;
		
	public broswerDriver() {
		this.driver = driver;
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
	
				
	}
	
	public void close() {
		this.driver.close();
	}


	
}
