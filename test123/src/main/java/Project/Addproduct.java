package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Addproduct {
	
	Addproduct(WebDriver driver){
		
		PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy(xpath="//*[@id=\"item_1_title_link\"]")
	  WebElement boltTshirt;
	  
	  @FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/div/div/button")
	  WebElement addtocart;	
	  
	  @FindBy(id="item_4_title_link")
	  WebElement backpack;  
	  
	  @FindBy(css="#inventory_item_container > div > div > div > button")
	  WebElement addbackpack;
	  
	//*[@id="inventory_item_container"]/div/button
	  @FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/button")
	  WebElement back;
		
	
 
  public void boltTshirt() {
	  boltTshirt.click();
	  //backpack.click();
  }
  
  public void AddboltTshirt() {
	  addtocart.click();
	 // addbackpack.click();
  }
  
  public void back()
  {
	  back.click();
  }
  
  public void backpack() {
	  backpack.click();
  }
  
  public void Addbackpack() {
	  
	 addbackpack.click();
  }
  
  @FindBy(css="#inventory_container > div > div:nth-child(2) > div.pricebar > button")
	WebElement bikelight;
  
  public void Addbikelight() {
	  
	  bikelight.click();
  }
  
  
}
