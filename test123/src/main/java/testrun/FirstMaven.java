package testrun;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 
public class FirstMaven {
	WebDriver driver;
  @BeforeTest
  public void Setup() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  @BeforeMethod
  public void url()
  {
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
  }
  @AfterTest
  public void teardown() {
	  driver.quit();
  }
}
