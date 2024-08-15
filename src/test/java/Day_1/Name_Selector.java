package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  // getting the url or website link using get method
		
		driver.manage().window().maximize();  // for maximize the window
		
		
		//driver.findElement(By.name("radioButton")).click();  //name selector
		
		
		driver.findElement(By.cssSelector("input[name='radioButton']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();  // to close the whole browser window after programme executed

	}

}
