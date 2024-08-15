package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		
//		driver.findElement(By.cssSelector(".hasDatepicker")).sendKeys("31/12/2025",Keys.ENTER);
		
		
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		
		driver.findElement(By.cssSelector("(//a[@class=\"ui-state-default\"])[1]")).click();
		
		
		
		WebElement actual_Month = driver.findElement(By.cssSelector("[class=\"ui-datepicker-month\"]"));
		

		WebElement actual_year = driver.findElement(By.cssSelector("[class=\"ui-datepicker-year\"]"));
		
		
		
		String month = actual_Month.getText();
		
		String year = actual_year.getText();
		
		
		while (!(month.equals("September") && year.equals("2024"))) {
			
			
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			
		
			month = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			

			year = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();	
			
		}
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@data-month='09']/a[.='10']")).click();
		
		
		driver.quit();
		
		
	}

}
