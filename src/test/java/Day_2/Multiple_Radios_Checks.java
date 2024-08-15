package Day_2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Radios_Checks {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		
		driver.manage().window().maximize();
		
		
		
		List<WebElement>check = driver.findElements(By.cssSelector("[type=\"radio\"]"));
		
		for (WebElement ch : check) {
			
			
			ch.click();
			Thread.sleep(1000);
			
		}
		
		
		
		driver.quit(); 

	}

}
