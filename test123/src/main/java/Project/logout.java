package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logout {
	
	logout(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
  
	@FindBy(css="#menu_button_container > div > div:nth-child(3) > div > button")
	WebElement Allpro;
	
	@FindBy(css="#inventory_sidebar_link")
	WebElement Allitem;
	
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	
	public void Allproduct() {
		Allpro.click();
	  }
	
	public void AllItem() {
		Allitem.click();
	  }
	
	public void logout() {
		 logout.click();
	  }
   
}
