package TestNG_Selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	//all the below methods will automaticall import after righ click class > source >Implement/override methods > enable checkbox

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Execution is starting");
		
		//before running tc u need to tell ur testng xml file u need to tell where listeners class located then only it will execute
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("Execution is success");
		//by using ITest Listeners u can also know the method name which is passed or failed etc.
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("Execution is Failed " + result.getName());
		//result will capture the all results of the tc by using above syntax we can get a name of tc which is failed
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	//listeners will listen ur tc
	//if tc fail or pass it will execute another method so listeners keep on waiting all tc
	//u ca write whatever u want in that method
	//ITestListener is an interface which implemets testng 
	//we can also run tests parallally simply by putting <parallel="tests" thread-count="2"> in suite level if u want to run on suite level
	//also if u want in test u can add parallel="classs" in test tag
	//there is a test-output folder rt so in that we can take results of our testNG project in that select rtclick index.html  >properties>copy the location
	//paste in chrome u will find the result
}
