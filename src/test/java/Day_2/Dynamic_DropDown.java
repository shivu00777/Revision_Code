package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		
	
		
		
		driver.findElement(By.cssSelector("[placeholder='Type to Select Countries']")).sendKeys("ja");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Japan')])[1]")).click();
//		
//		List<WebElement> ch = driver.findElements(By.cssSelector(".ui-autocomplete-input"));
//		
//		for (WebElement ele : ch) {
//			
//			if (ele.getText().equals("Japan")) {
//			
//				System.out.println(ele.getText());
//				
//				
//				
//				ele.click();
//				
//			}
			
			
//	}
		
		Thread.sleep(1000);
		driver.quit();
	}

}
