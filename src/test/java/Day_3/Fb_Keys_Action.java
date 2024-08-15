package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb_Keys_Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/"); 
		
		
		
		WebElement mail =driver.findElement(By.cssSelector("[placeholder=\"Email address or phone number\"]"));
	
	
		WebElement pass =driver.findElement(By.cssSelector("[id=\"passContainer\"]"));
		
		
		Actions press = new Actions(driver);
		
		press.keyDown(mail, Keys.SHIFT).sendKeys("shivam").keyUp(mail, Keys.SHIFT).build().perform();
		
		pass.sendKeys("sharma");
		
//		for(int i =0;i<=press.leng)
		
		
		press.keyDown(pass, Keys.BACK_SPACE).keyUp(pass, Keys.BACK_SPACE).build().perform();
		
		
		 
		Thread.sleep(2000);
		driver.quit();
		
	
	
	
	}

}
