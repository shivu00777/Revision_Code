package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");  
		
		
		// create object of actions class
		
		Actions ac = new Actions(driver);
		
		
		// Locator for webelement.
		
		WebElement db_click = driver.findElement(By.cssSelector("[alt=\"Electronics\"]"));
		
		
		
		// doubleclick() using for doubleclick with build and perform function
		
		ac.doubleClick(db_click).build().perform();
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
