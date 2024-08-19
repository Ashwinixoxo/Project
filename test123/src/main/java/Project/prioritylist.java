package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class prioritylist {
	
	prioritylist(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select")
	WebElement asscheck;
  
  public void assignment() {
	  
	 // asscheck.click();
	  Select sc=new Select(asscheck);
	  sc.selectByVisibleText("Price (high to low)");
  }
}
