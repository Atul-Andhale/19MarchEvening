package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
	 @Test(groups = "regression")
	  public void x()
	  {
		  Reporter.log("x method is running",true);
	  }
	  @Test(groups = "sanity")
	  public void y() 
	  {
		  Reporter.log("y method is running",true);
		  
	  }
	  @Test(groups = "regression")
	  public void z() 
	  {
		  Reporter.log("z method is running",true);
	  }
}
