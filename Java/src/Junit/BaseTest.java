package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseTest {
	@Before
	public void openBrowser() {
		System.out.println("open browser");
		}
	@After
	public void closeBrowser() {
		System.out.println("close browser");
		}
	
	@BeforeClass
	public static void run3() {
		System.out.println("this the beganing");
	}
	
	@AfterClass
	public static void run4() {
		System.out.println("this is the end");
	}
	@Test
	public void run1() {
		System.out.println("run first page");
	}
	@Test
	public void run2() {
		System.out.println("run second page");
		
	}
	
	 public void run5() {
		 System.out.println("did not run");
	 }
	
	

}
