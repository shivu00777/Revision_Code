package Day_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Function {

	public static void main(String[] args) throws InterruptedException {

		try {
			
			WebDriver driver = new ChromeDriver();   //ChromeDriver 
			
			driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			
			driver.findElement(By.cssSelector("#alertbtn")).click(); // now the alert will appear.
			
			Alert al = driver.switchTo().alert();  // this will switch the control from Web_page to alert.
			
			String text = al.getText();
			
			System.out.println(text); 
			
			al.accept();  // it will click on inside the alert 
			
			Thread.sleep(1000);
			
			
			driver.findElement(By.cssSelector("[value='Confirm']")).click();  //appear the alert
			
			driver.switchTo().alert().accept();   // click on ok on the alert
			
			
			
			
			
			
			driver.quit();

			
		} catch (Exception e) {
		
		}
		
				


	}

}
