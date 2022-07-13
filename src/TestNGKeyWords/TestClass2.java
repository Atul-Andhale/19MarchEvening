package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
	 @Test(groups = "regression")
	  public void p()
	  {
		  Reporter.log("p method is running",true);
	  }
	  @Test(groups = "sanity")
	  public void q() 
	  {
		  Reporter.log("q method is running",true);
		  
	  }
	  @Test
	  public void r() 
	  {
		  Reporter.log("r method is running",true);
	  }
}
