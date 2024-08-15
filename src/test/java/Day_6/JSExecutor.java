package Day_6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");		
		// i want to call javascriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		// Execute javaseriRt commands using JavaScriptExecutor, using executescript()
		js.executeScript("document.getElementById('autocomplete').value='Hi Good morning'"); 
		
		
		js.executeScript("document.getElementById('checkBoxOption1').click();");
		// Scroll action using JavaScriptExecutor
		
		js.executeScript("window.scrollBy(0,900)");

	}

}
