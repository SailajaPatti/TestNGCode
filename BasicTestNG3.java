package TestNG_Selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTestNG3 {
     @Test(dependsOnMethods={"TestCase6"})
	public void TestCase4() {
		System.out.println("4th tc");
	}
     @BeforeSuite
     public void TestCase5() {
 		System.out.println("I am the first method of entire suite");
 	}
     @Test(dataProvider="getdata")
     
     public void TestCase6(String UN,String pwd) {
 		//System.out.println("I am the last method of entire suite");
 		System.out.println(UN);
 		System.out.println(pwd);
 		
 	}
     @Test(enabled=false)
     public void Enabled()
     {
    	 System.out.println("Enable and disable");
     }
    @DataProvider
    public Object[][] getdata() {
    	Object[][] data=new Object[3][2];
    	data[0][0]="1st UN";
    	data[0][1]="1st pwd";
    	data[1][0]="2nd UN";
    	data[1][1]="2nd pwd";
    	data[2][0]="3rd UN";
    	data[2][1]="3rd pwd";
    	return data;
    	
    }
}
