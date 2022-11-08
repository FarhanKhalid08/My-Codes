package assignment_30oct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram_TestNg {
	public static WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/emailsignup/");
	}
	@Test
	public void EmailorPhone() {
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("farhankhalid@yahoo.com");
	}
	@Test
	public void Fullname() {
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Farhan khalid");
	}
	@Test
	public void Username() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Farhan123");
		}
	@Test
	public void password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("subhan");
	}
	@Test
	public void signupbutton() {
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
