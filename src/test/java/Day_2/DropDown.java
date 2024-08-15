package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		
		driver.manage().window().maximize();
		
		
		WebElement drop=driver.findElement(By.cssSelector("#dropdown-class-example"));
		
		Select a = new Select(drop);
		
		a.selectByVisibleText("Option2");		
		
		a.selectByValue("option1");
		
		
		Thread.sleep(1000);
		driver.quit(); 
		
		
	
	
	
	}

}
