package practice_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Elements_Practice {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("farhan.khalid@hotmail.co.uk");
		driver.findElement(By.id("passwd")).sendKeys("subhan14");
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://automationpractice.com");
		driver1.manage().window().maximize();
		
		driver1.findElement(By.className("login")).click();
		driver1.findElement(By.id("email")).sendKeys("farhan.khalid@hotmail.co.uk");
		driver1.findElement(By.id("passwd")).sendKeys("subhan14");
		driver1.findElement(By.id("SubmitLogin")).click();
		driver.quit();
		driver1.quit();
		
	}

}
