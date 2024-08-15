package Day_5;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://the-internet.herokuapp.com/login");  // getting the url or website link using get method
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		
		WebElement user= driver.findElement(By.name("username"));
		
		wait.until(ExpectedConditions.visibilityOf(user)).sendKeys("tomsmith");
		

		
		WebElement pass= driver.findElement(By.name("password"));
		
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("SuperSecretPassword!");
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("radius")))).click();
		
		
		Thread.sleep(2000);
		
		driver.quit();  
		
		
		
	
	
	}

}
