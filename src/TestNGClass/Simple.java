package TestNGClass;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple {
  @Test
  public void Display()
  {
	  System.out.println("Hi...Good Morning !");
  
      Reporter.log("Hi Good Morning");
  
      Reporter.log("Hi Good Aternoon ", true);
  
  }
}
