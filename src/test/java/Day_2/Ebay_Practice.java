package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Practice {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/"); 
		
		
		driver.findElement(By.cssSelector("[class=\"gh-tb ui-autocomplete-input\"]")).sendKeys("Nike Shoes");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("[aria-label=\"nike shoes\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("[aria-label=\"Select a category for search\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),\"Sporting Goods\")]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[value=\"Search\"]")).click();
		
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
