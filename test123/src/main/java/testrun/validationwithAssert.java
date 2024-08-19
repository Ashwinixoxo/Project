package testrun;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Testlistener.class)
public class validationwithAssert extends FirstMaven {
  @Test(priority=1)
  public void validate() {
	  String ExpectedUrl="https://www.amazon.in/";
	  String ActualUrl=driver.getCurrentUrl();
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(ActualUrl, ExpectedUrl,"Failed Url");
	  
	  // Assert.assertEquals(ActualUrl, ExpectedUrl,"Failed Url");
	   System.out.println("Hiii Assertion");
	   
	   sa.assertAll();
  }
}
