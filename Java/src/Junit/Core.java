package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Core {
	
	static ChromeDriver driver;
	
	
	@Before
	public void openBrowser() {
		System.out.println("Open browser");
	}
	@After
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	@BeforeClass
	public static void run() {
		System.out.println("before class");
		
		System.setProperty("webdriver.chrome.diver","C:\\\\Users\\\\gafur\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		driver=new ChromeDriver(); 
	}
	@AfterClass
	public static void run2() {
		System.out.println("after class");
	}
	@Test
	public void run3() {
		//WebElement e = dr.findElement(By.id(""));
				//System.out.println("Test 4");
				Assert.assertTrue(3>2);
				System.out.println("True");
				// Assert.assertTrue(message, condition);
				//Assert.assertFalse(dr.findElement(By.id("cart")).isDisplayed());
				// Assert.assertFalse(message, condition);
				//Assert.assertEquals(e.getText(), "Create your Target account");

	}

}   
    

