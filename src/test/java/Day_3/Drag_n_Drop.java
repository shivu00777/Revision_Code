package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/"); 
		
		
		Actions drag = new Actions(driver);
		
		
		WebElement selec = driver.findElement(By.xpath("[src=\"images/high_tatras_min.jpg\"]"));
		
		WebElement target = driver.findElement(By.cssSelector("[id=\"trash\"]"));
		
		
		drag.dragAndDrop(selec, target).build().perform();
		
		 
		Thread.sleep(2000);
		driver.quit();
		

	}

}
