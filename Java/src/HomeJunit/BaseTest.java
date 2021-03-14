package HomeJunit;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static ChromeDriver dr;
	@BeforeClass
	public static void test() {
		System.out.println("open Browser");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\gafur\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		 
		dr =new ChromeDriver();
		
	}
	
	public static void test2() throws InterruptedException {
		System.out.println("Closing the browser");
		Thread.sleep(50000);
		dr.quit();
		
	}

}
