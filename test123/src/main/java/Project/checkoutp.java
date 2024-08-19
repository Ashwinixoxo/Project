package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class checkoutp {
	
	checkoutp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement zipcode;
	
	@FindBy(css="#checkout_info_container > div > form > div.checkout_buttons > input")
	WebElement continuebutton;
	
	@FindBy(css="#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button")
	WebElement finish;
	
	 
	
	
	public void  firstname() {
		   firstname.sendKeys("Ashu");
	  }
	
	public void  lastname() {
		   lastname.sendKeys("Khodke");
	  }
	
	public void  postalcode() {
		   zipcode.sendKeys("413527");
	  }
	
	public void contibutton() {
		continuebutton.click();
	  }
	
	public void finish() {
		finish.click();
	  }
	
	
	
	
	
	
	 
 
  
}
