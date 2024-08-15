package Day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_CheckBoxes {

	public static void main(String[] args) {
		
		
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		
		driver.manage().window().maximize();
		
		
		List<WebElement> check = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
		
		
		for(WebElement a:check) {
			
			a.click();
			
		}
		
		
		//driver.quit(); 

	}

}
