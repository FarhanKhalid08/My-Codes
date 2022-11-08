package assignment_22oct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logout_Button {
public static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='login1' and @name='login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password' and @name='passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='signinbtn' and @name='proceed']")).click();
		//driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

}
