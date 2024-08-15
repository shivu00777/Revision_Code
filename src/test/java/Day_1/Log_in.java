package Day_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_in {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();   //ChromeDriver 
		
		driver.get("https://the-internet.herokuapp.com/login");  // getting the url or website link using get method
		
		
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.className("radius")).click();
		
		
		//Thread.sleep(2000);
		
		driver.quit();  
		

		
		

	}

}
