package Project;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class driverset {
	WebDriver driver;
	login l;
	prioritylist pl;
	Addproduct ap;
	 Cart c;
	 checkoutp cc;
	 logout lg;
	 
  @BeforeTest
  public void setup() {
	  driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	  l=new login(driver);
	  pl=new prioritylist(driver); 
	  ap=new Addproduct(driver);
	  c=new Cart(driver);
	  cc=new checkoutp(driver);
	  lg=new logout(driver);
	  
	  
  }
  @Test (priority=1)
  public void logintest()
  {
	  l.username();
	  l.password();
	  l.loginb();
	  
  }
  
  @Test (priority=2)
  public void priorityl()
  {
	   pl.assignment();
	  
  }
  
  
  @Test (priority=3)
  public void addtocart()
  {
	  ap.boltTshirt();
	  ap.AddboltTshirt();
	  ap.back();
	  ap.backpack();
	  ap.Addbackpack();
	  ap.back();
	  
  }
  
  @Test (priority=4)
  public void cartpage()
 
  {
	  c.cartlogo();
	  c.remove();
	  c.continueshop();
	  ap.Addbikelight();
	  c.cartlogo();  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,600)", "");
      c.checkout();
  }
  
  @Test (priority=5)
  public void checkout() throws InterruptedException
 
  {
	  
	  cc.firstname();
	  cc.lastname();
	  cc.postalcode();
	  cc.contibutton();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,600)", "");
	  cc.finish();
	  Thread.sleep(3000);
	  
	  
  
  }
  
  @Test (priority=6)
  public void logout() throws InterruptedException
  {
	  lg.Allproduct();
	  lg.AllItem();
	  Thread.sleep(3000);
	  lg.Allproduct();
	  lg.logout();
  }
  
}
