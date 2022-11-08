package practice_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("5712367346");
		driver.findElement(By.id("pass")).sendKeys("subhan03");
		driver.findElement(By.name("login")).click();
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		
		driver1.findElement(By.id("email")).sendKeys("5712367346");
		driver1.findElement(By.id("pass")).sendKeys("subhan03");
		driver1.findElement(By.name("login")).click();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://facebook.com");
		driver2.manage().window().maximize();
		
		driver2.findElement(By.id("email")).sendKeys("5712367346");
		driver2.findElement(By.id("pass")).sendKeys("subhan03");
		driver2.findElement(By.name("login")).click();
		
		driver.quit();
		driver1.quit();
		driver2.quit();
		
		
		
	}

}
