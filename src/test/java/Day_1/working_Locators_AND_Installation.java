package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_Locators_AND_Installation {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  // getting the url or website link using get method
		
		
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Hi this is shivam");
		
		
		driver.findElement(By.id("autocomplete")).clear();
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("Hi this is swati");
		
		
		Thread.sleep(2000);
		
		driver.quit();  // to close the whole browser window after programme executed
		
		
		
		

	}

}
