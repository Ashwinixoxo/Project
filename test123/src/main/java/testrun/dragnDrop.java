package testrun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragnDrop {
	WebDriver driver;
  @BeforeTest
  public void setup() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @Test
  public void drag()
  {
	  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  WebElement capital=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
	  WebElement country=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
	  
	  
	  Actions act=new Actions(driver);
	 // act.dragAndDrop(capital, country).build().perform();
	  
	  act.clickAndHold(capital).perform();
	  act.release(country).build().perform();
	  
  }
  @Test
  public void drop()
  {
	  driver.get("https://www.globalsqa.com/demo-site/draggableboxes/#google_vignette");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  
	  
	  WebElement frame=driver.findElement(By.xpath("//*[@id=\"post-2665\"]/div[2]/div/div/div[1]/p/iframe"));
	  driver.switchTo().frame(frame);
	  
	  
	  WebElement ele=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("window.scrollBy(0,600)", "");
      
	  Actions act=new Actions(driver);
	  act.moveByOffset(800, 550).build().perform();
  }
}
