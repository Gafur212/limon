package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
WebDriver dr;
@Given("^open browser$")
public void open_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gafur\\Downloads\\chromedriver_win32 (2).chromeDriver.exe");
    dr = new ChromeDriver();
   
}

@Given("^nevigate to url$")
public void nevigate_to_url()  {
    dr.get("http://www.Facebook.com");
    
}

@When("^user type userid in usertext box$")
public void user_type_userid_in_usertext_box()  {
    dr.findElement(By.id("pass")).sendKeys("");
   
}

@When("^user gtype password in password box$")
public void user_gtype_password_in_password_box(){
    dr.findElement(By.id("")).sendKeys("");
    
}

@When("^user click on login button$")
public void user_click_on_login_button() {
    dr.findElement(By.id("")).click();
   
}

@Then("^user should be in his profile page$")
public void user_should_be_in_his_profile_page() {
    if(dr.findElement(By.id("")).isDisplayed()) {
    	System.out.println("i am in profile page");
    }else {
    	System.out.println("not in profile page");
    }
    
}

}
