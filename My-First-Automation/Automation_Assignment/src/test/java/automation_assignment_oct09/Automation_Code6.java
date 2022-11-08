package automation_assignment_oct09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Code6 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://whatsapp.com");
		driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1= new FirefoxDriver();
		driver1.get("http://yahoo.com");
		driver1.manage().window().maximize();
		
		driver.quit();
		driver1.quit();
		
	}

}
