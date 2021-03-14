package Constructor;

import org.openqa.selenium.chrome.ChromeDriver;

public class Smoketest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gafur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		BaseTest asd = new BaseTest(driver);
		
		
		
		
	}

}
