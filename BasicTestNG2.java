package TestNG_Selenium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTestNG2 {
	@Parameters({"URL","username"})
	
	@Test
	public void TestCase3(String link,String UN) {
		System.out.println(link);
		System.out.println(UN);
		
	}
   @AfterTest
public void TestCase4() {
	System.out.println("I am the last exe method of this folder Test1");
   }
	@Test(groups="Smoke")
	public void Smoke() {
		System.out.println("2nd Smoke test");
		
	}
	@Test(groups="Smoke")
	public void Smoke1() {
		System.out.println("3rd Smoke test");
		
	}
}

