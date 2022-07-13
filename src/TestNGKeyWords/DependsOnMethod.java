package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void d()
  {
	  Reporter.log("d method is running",true);
  }
  @Test
  public void z() 
  {
	  Reporter.log("z method is running",true);
	  
  }
  @Test(dependsOnMethods = "z")
  public void a() 
  {
	  Reporter.log("a method is running",true);
  }
}
