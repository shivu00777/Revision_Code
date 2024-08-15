package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://www.ebay.com/"); 
		
		
		driver.findElement(By.cssSelector(".gh-tb")).sendKeys("mobile");
		
		
		driver.findElement(By.cssSelector("[value=\"Search\"]")).click();
		
		
		driver.findElement(By.cssSelector("[aria-label=\"128 GB\"]")).click();
		
		Thread.sleep(1000);
		
//		driver.quit();  
		

	}

}
