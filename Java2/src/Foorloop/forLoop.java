package Foorloop;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class forLoop extends BaseTest{
	
	@Test
	public void singleTest() {
		
		String actual=driver.getTitle();
		String expectedTitle="Target : Expect More. Pay Less.";
		if(actual.equals(expectedTitle)) {
			System.out.println("print home page");
		}
		
		boolean a=actual.equals(expectedTitle);
		if(a) {
			System.out.println("print home page");
			}
		
		else {
			System.out.println("did not match");
		}
		
		
			
		}
	

 public void sample() throws InterruptedException {
	 if(emon()) {
		 driver.findElement(By.xpath("")).click();
		 
	 }
	 else {
		 System.out.println("print nothing");
	 }
 }


 
	 public boolean emon () throws InterruptedException {
		 WebElement e=driver.findElement(By.xpath(""));
		 Thread.sleep(4000);
		 if(e.isDisplayed()) {
			 System.out.println("element is display");
			 return true;
		 }
		 else {
			 System.out.println("element is not display");
			 return false;
			 
		 }
	 }
	 public String verifyText() {
		 String actualText=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[7]/div/h2")).getText();
		 if(actualText.equals(actualText)) {
			 return actualText;
			 
		 }
		 else {
			 return actualText+"Did not match";
		 }
		
		 
	 }
	 @Test
	 public void verifyFooterLinks() throws InterruptedException {
		 List<WebElement> ele=driver.findElements(By.xpath("//div[@id=\"footer\"]/div[2]"));
		 
		 int size=ele.size();
		 for(int i=1;i<=size;i++) {driver.findElement(By.xpath("//div[@id='footer']/div[2]/ul[1]/li["+i+"]/a")).click();
		 System.out.println(driver.getTitle());
		 driver.navigate().back();
		 Thread.sleep(4000);
			 
		 }
	 }
	 public void textVerify() {
		 WebElement e=driver.findElement(By.xpath("//a[@id='footer']/div[2]/ul[1]/li[1]/a"));
	 }
 }
	 

		 
		 
		