package assignment_30oct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeDepot_TestNg {
	public static WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.homedepot.com/auth/view/createaccount/diy?redirect=/&ref=null");
	}
	@Test
	public void Email() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("farhankhalid@hotmail.com");
	}
	@Test
	public void Password() {
		driver.findElement(By.xpath("//input[@id='password-input-field']")).sendKeys("subhan");
	}
	@Test
	public void zipcode() {
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("22150");
	}
	@Test
	public void phoneno() {
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("5712367346");
	}
	@Test
	public void CAButton() {
		driver.findElement(By.xpath("//span[@class='bttn__content']")).click();
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
