package TestNG_Selenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;  

@Listeners(TestNG_Selenium.Listeners.class) 
  
public class Parameterization1 {
	private static final boolean False = false;
	@Parameters({"URL","username"})
	@Test
	public void PI(String Link,String UN)
	{
		System.out.println(Link);
		System.out.println(UN);
		
	}
	@Test
	public void PI1()
	{
		System.out.println("for listeners1");
	}
	@Test
	public void PI2()
	{
		Assert.assertTrue(false);
		System.out.println("for listeners2");
		
	}
}


