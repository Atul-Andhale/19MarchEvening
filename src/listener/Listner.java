package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
     @Override
    public void onTestSuccess(ITestResult result) 
     {
    	Reporter.log("TestCase Passed Succesfully",true);
    	result.getName();
    	Reporter.log("Name of Test Method Completed Successfully is"+result.getName(),true);
    }
     
     @Override
    public void onTestFailure(ITestResult result) 
     {
    	Reporter.log("TestCase Failed please check again",true);
    	Reporter.log("Name of Test Method failed is"+result.getName(),true);
    }
     
     @Override
    public void onTestSkipped(ITestResult result) {
    	 Reporter.log("TestCase Skipped please Check dependent method",true);
    	 Reporter.log("Name of Test Method skipped is"+result.getName(),true);
    }
}
