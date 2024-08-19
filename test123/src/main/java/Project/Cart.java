package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Cart {
	
	Cart(WebDriver driver){
		
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	
	@FindBy(css="#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > button")
	  WebElement remove;
	
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")
	WebElement continues;
	
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement checkout;
	
	
	
	
  public void cartlogo() {
	  
	  cart.click();
  }
  
  public void remove() {
	  remove.click();
  }
  
  public void continueshop() {
	  continues.click();
  }
  
  public void  checkout() {
	  checkout.click();
  }

  
  
  
}
