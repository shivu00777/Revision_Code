package Day_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicite_waut {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://the-internet.herokuapp.com/login");  // getting the URL or web_site link using get method
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		

		
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		

		
		driver.findElement(By.className("radius")).click();
		
		
		//Thread.sleep(2000);
		
		driver.quit();  
		
		
		
		
		

	}

}
