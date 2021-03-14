package HomeJunit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreTest {
	ChromeDriver dr;
	public void Coretest(ChromeDriver dr) {
		this.dr=dr;
		}
	
	public void waitForElement(long millis) throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public void maxmizeWindows() {
		dr.manage().window().maximize();
	}
	
	public void deletAllcokis() {
		dr.manage().deleteAllCookies();
	}
	public void gotoWebsite(String url) {
		dr.get(url);
	}
	public void currentUrl() {
		String url=dr.getCurrentUrl();
		System.out.println(url);
	}
	public void verifyElement(By by) {
		WebElement ad =dr.findElement(by);
		boolean result = ad.isDisplayed();
		System.out.println(result);
	}
	public void verifyTitle(String expTitle) {
		String actualtitle =dr.getTitle();
		boolean result = actualtitle.equals(expTitle);
		System.out.println(result);
				}
	public void clickOnElement(By locator) {
		dr.findElement(locator);
		}
	public void typeOnElement(By locator,String value) {
		dr.findElement(locator).sendKeys(value);;
		
	}
	public void getText(By by) {
		
		System.out.println(dr.findElement(by).getText());
	}

}
