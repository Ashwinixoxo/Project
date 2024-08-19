package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class login {
	
  login(WebDriver driver){
	  PageFactory.initElements(driver, this);  
	  
  }
  
  @FindBy(xpath="//*[@id=\"user-name\"]")
  WebElement user;
  
  @FindBy(xpath="//*[@id=\"password\"]")
  WebElement pass;
  
  @FindBy(id="login-button")
  WebElement loginb;
  
  public void username() {
	  user.sendKeys("standard_user");
  }
  
  public void password() {
	  pass.sendKeys("secret_sauce");
  }
  
  public void loginb() {
	   loginb.click();
  }
  
}
