package Junit;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {
ChromeDriver dr;
	
	public void InputData(ChromeDriver dr){
		
		this.dr = dr;
		
	}
	
	
	public void goToAnyWebsite(String url) {
			dr.get(url);
		
		}
		
	public void clickOnElement(By by) {
			
			dr.findElement(by).click();	
			
		}
		
	public void clickOnElementWithXpath(String using) {
			
			dr.findElementByXPath(using).click();
			
		}
		
	public void clickOnElementWithCssSelector(String using){
			
			
			dr.findElementByCssSelector(using).click();
			
		}
	public void typeOnelement(By by, String text) {
			
			dr.findElement(by).sendKeys(text);
			
		}
		
	public void  catchMultipleElements(By by, int index) {
			WebElement ele = dr.findElement(by); //CatchingSingleElement
			
			List result = (List) dr.findElements(by);
			((java.util.List<WebElement>) result).get(index).click();//user will put the number of the element from the list in "index".
		}
		
		
	public void verifyPageTitle(String expectedTitle ) {
			
			String actualTitle = dr.getTitle();
			
			boolean returns = actualTitle.equals(expectedTitle);
			System.out.println("Title Matched:" + returns);
			
		}
	    
	public void verifyPageUrl(String expectedUrl ) {
			
			String actualUrl = dr.getCurrentUrl();
			
			boolean returns = actualUrl.contains(expectedUrl);
			System.out.println("URL Matched:" + returns);
			
		}
		
	public void getAnyTextFromWebsite(By by) {

			dr.findElement(by).getText();
			System.out.println(dr.findElement(by).getText());
		}
		
		
	public void verifyText(By by, String exPectedtext) {
			String actualText = dr.findElement(by).getText();
			
			boolean outcome = actualText.equals(exPectedtext);
			System.out.println("Login Page Header Text Matched:" + " " + outcome );
			
		}
		
	public void verifyElementDisplayed(By by) {
		
			WebElement ele = dr.findElement(by);
			
			boolean result = ele.isDisplayed();
			
			System.out.println("Cart Element is displayed:" + " " + result);
		
		
		/*if (ele.isDisplayed()) {
			
			System.out.println("Element is displayed:" + by + " : " + ele.isDisplayed());
		
		}
		
		else {
			
			System.out.println("Element is not displayed:" + by + " : " + ele.isDisplayed());
			
		} */
			
			
		/*if (result) {
			
			System.out.println("Element is displayed:" + by + " : " + ele.isDisplayed());
			
			}
			
		else {
				
			System.out.println("Element is not displayed:" + by + " : " + ele.isDisplayed());
				
			} */
			
	    }
		
		
	public void verifyElementSelected(By by) {
			
			WebElement ele = dr.findElement(by);
			
			boolean result = ele.isSelected();
			
			System.out.println("Checkbox Element is Selected:" + " " + result);
		

		}
		
	public void verifyElementEnabled(By by) {
			
			WebElement ele = dr.findElement(by);
			
			boolean result = ele.isEnabled();
			
			System.out.println("Create Account Element is Enabled:" + " " + result);
		
		}
		
		
	public void closeBrowser() {
		 
			dr.quit();	
		
		}


}
