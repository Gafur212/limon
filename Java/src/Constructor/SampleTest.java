package Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	ChromeDriver driver;
	
	SampleTest(ChromeDriver driver){
		this.driver=driver;
		}
	public void gotoAnyWebsite(String url) {
		driver.get(url);
		
	}
	public void getCurrentUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	public void verifyUrl(String expUrl) {
		String actualUrl=driver.getCurrentUrl();
		boolean result =actualUrl.equals(expUrl);
		System.out.println(result);
		}
	public void verifyTitle(String expectedTitel) {
		String title=driver.getTitle();
		boolean result=title.equals(expectedTitel);
		System.out.println(result);
	}
	public void clickOnElement(By locator) {
		driver.findElement(locator).click();
		
	}
    public void getText(By by) {
	System.out.println(driver.findElement(by).getText());
}
    public void typeOnElement(By locator,String value) {
    	driver.findElement(locator).sendKeys(value);
    }
    public void verifyElementDisplayed(By by) {
    	WebElement emon=driver.findElement(by);
    	boolean result=emon.isDisplayed();
    	System.out.println("Element Displayed="+result);
    	
    }
    
    public void closeBrowser() {
    	driver.quit();
    }
    
}
