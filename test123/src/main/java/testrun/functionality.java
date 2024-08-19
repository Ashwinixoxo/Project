package testrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistener.class)
public class functionality extends validationwithAssert {
	
	private WebElement hello;
	private WebElement Signin;
	private WebElement Email;
	private WebElement Continue;
	private WebElement pass;
	private WebElement Fsign;
	private WebElement lang;
	private WebElement hindi;
	
	
	
	
  public WebElement getLang() {
		return driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]"));
	}


	public WebElement getHindi() {
		return driver.findElement(By.cssSelector("#icp-language-settings > div:nth-child(6) > div > label > i"));
	}


public WebElement getHello() {
		return driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	}


	public WebElement getSignin() {
		return driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
	}

	public WebElement getContinue() {
		return driver.findElement(By.xpath("//*[@id=\"continue\"]"));
	}
 
	public WebElement getpass() {
		return driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	}
	public WebElement getFsign() {
		return driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
	}



@Test(priority=2)
  public void login() {
	
	Actions act=new Actions(driver);
	act.moveToElement(getHello()).perform();
	getSignin().click();
	getEmail().sendKeys("8275926071");
	getContinue().click();
	getpass().sendKeys("ashu@123");
	getFsign().click();
  }

@Test(priority=3)
public void lang() {
	getLang().click();
	getHindi().click();
	
	String Actualtxt="अनुवाद\n"
			+ "हम आपकी ब्राउज़िंग, खरीदारी और कम्युनिकेशन के लिए सबसे ज़रूरी जानकारी का अनुवाद करेंगे. हमारे अनुवाद आपकी सहूलियत के लिए प्रदान किए जाते हैं. हमारी उपयोग की शर्तों सहित Amazon.in का अंग्रेज़ी वर्जन ही अंतिम वर्जन है. और जानें";
	String Expectedtxt=driver.findElement(By.xpath("//*[@id=\"icp-language-disclaimer\"]")).getText();
	Assert.assertEquals(Actualtxt,Expectedtxt,"Test does not match");
	
}

}
