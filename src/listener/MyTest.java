package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listner.class)
public class MyTest 
{
	
  @Test
  public void myMethod1() 
  {
	  Reporter.log("myMethod1  is running",true);
  }
  
  @Test
  public void myMethod2() 
  {
	  Assert.fail();
	  Reporter.log("myMethod2  is running",true);
  }
  
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("myMethod3  is running",true);
  }
}
