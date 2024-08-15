package Day_3;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstop.com/");  
		
		
		// Step - 1 create object of action class
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		WebElement Watches_link = driver.findElement(By.linkText("WATCHES"));
		
		Thread.sleep(1000);
		
		act.moveToElement(Watches_link).build().perform();
		
		
		
		
		
		

		Thread.sleep(10000);
		driver.quit();

	}

}
