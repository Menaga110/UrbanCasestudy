package mavenproject.urbanladder;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Resources.Reusable;

//ITest listioner

public class Listeners implements ITestListener {
	
	Reusable s=new Reusable();
	@Override
	public void onTestStart(ITestResult result) {
		 
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed "+result.getName());
		 
	}
	@Override
	public void onTestFailure(ITestResult result) {
		///take screenshot
		System.out.println("Failed test"+result.getName());
		try {
			s.getscreenshot(result.getName());}
		catch(IOException e){
		e.printStackTrace();
			
		}
		 
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		 
	}
	}

