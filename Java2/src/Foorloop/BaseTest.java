package Foorloop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
static ChromeDriver driver;
	@Before
	public void openBrowser() {
		 driver.get("https://www.target.com");
		}
	@After
	public void closeBrowser() {
		System.out.println("close browser");
		}
	
	@BeforeClass
	public static void run3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gafur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver= new ChromeDriver();
	}
	
	@AfterClass
	public static void run4() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
	
	
	

}
