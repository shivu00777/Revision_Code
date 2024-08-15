package Day_3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");  
		
		
		Actions ch = new Actions(driver);
		
		
		WebElement right_click = driver.findElement(By.cssSelector("[alt=\"Mobiles\"]"));
		
		
		// use contains click for right click and after use build and perform
		
		ch.contextClick(right_click).build().perform();
		
		
		

		Thread.sleep(2000);
		driver.quit();

	}

}
