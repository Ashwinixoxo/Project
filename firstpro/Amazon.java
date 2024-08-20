package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//*[@id="nav-link-accountList"]
		//#nav-signin-tooltip > a > span
		WebElement sign=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		WebElement in=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
		
		Actions act=new Actions(driver);
		act.moveToElement(sign).perform();
		act.moveToElement(in).click().build().perform();
		
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("ashuhkoli@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		

	}

}
