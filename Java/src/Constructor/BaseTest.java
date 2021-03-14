package Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	ChromeDriver driver;
   
	public BaseTest(ChromeDriver driver) throws InterruptedException {
		this.driver=driver;
		
		SampleTest a =new SampleTest(driver);
		
		a.gotoAnyWebsite("https://www.doordash.com/en-US");
		Thread.sleep(5000);
		a.verifyElementDisplayed(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]/div[1]/div/div"));
		Thread.sleep(5000);
		a.verifyUrl("https://www.doordash.com/en-US");
		Thread.sleep(5000);
		a.verifyTitle("DoorDash Food Delivery - Delivering Now, From Restaurants Near You");
		Thread.sleep(5000);
		a.clickOnElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/a[2]/div/div/span/div"));
		Thread.sleep(5000);
		a.typeOnElement(By.id("FieldWrapper-6"),"emon");
		Thread.sleep(5000);
		a.typeOnElement(By.xpath("//*[@id=\"FieldWrapper-7\"]"), "mr.");
		Thread.sleep(5000);
		a.typeOnElement(By.xpath("//*[@id=\"signup-form\"]/div[3]/div/div[2]/div/div"), "asdad123@gmail.com");
		Thread.sleep(5000);
		a.clickOnElement(By.xpath("//*[@id=\"FieldWrapper-9\"]"));
		Thread.sleep(5000);
		a.typeOnElement(By.xpath("//*[@id=\"signup-form\"]/div[4]/div/div[2]/div[2]/div/div"), "91234342353");
		Thread.sleep(5000);
		a.typeOnElement(By.xpath("//*[@id=\"signup-form\"]/div[5]/div/div[2]/div/div"),"Emon123@#");
		Thread.sleep(5000);
		a.clickOnElement(By.xpath("//*[@id=\"sign-up-submit-button\"]/div/div"));
		a.closeBrowser();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
