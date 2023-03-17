package TestNG_Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTestNG1 {
     @Test
	public void TestCase1() //every method in testNG is treated as one tc
	{

		System.out.println("hello");
	}
    @Test(groups="Smoke")
    public void TestCase2()
   {
	System.out.println("1st Smoke test");
    }
    @Test
    @Parameters({"URL"})
    public void TestCase3(String Url)
    {
 	System.out.println(Url);
     }
    @BeforeMethod
    public void BM()
    {
 	System.out.println("Have a nice day");
     }
    @AfterMethod
    public void AM()
    {
 	System.out.println("Had a nice day");
     }
    @BeforeTest
    public void TestCase4()
    {
 	System.out.println("I am running before of all tc in this test folder or shell");
     }
    @org.testng.annotations.BeforeClass
    public void BeforeClass()
    {
 	System.out.println("Before the class");
     }
    @org.testng.annotations.AfterClass
    public void AfterClass()
    {
 	System.out.println("After the class");
     }
}
