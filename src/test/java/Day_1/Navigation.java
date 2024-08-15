package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		

		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		
		driver.get("https://www.flipkart.com/"); 
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("[src=\"https://static-assets-web.flixcart.com/www/linchpin/batman-returns/images/fk-default-image-75ff340b.png?q=90\"]")).click();
		
		//driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).click();
		
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		
		
		Thread.sleep(1000);
		
		
		driver.navigate().forward();
		
		
		Thread.sleep(1000);
		
		
		driver.navigate().to("https://www.youtube.com/watch?v=mGGqI7bToRE");
		
		
		Thread.sleep(1000);
		
		driver.quit();  

	}

}
