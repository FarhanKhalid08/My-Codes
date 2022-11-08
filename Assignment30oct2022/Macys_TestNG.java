package assignment_30oct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Macys_TestNG {
	public static WebDriver driver;
public static Select select;
	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.macys.com/account/signin");
	}
	@Test
	public void FirstName() {
		driver.findElement(By.name("user.email_address")).sendKeys("Farhan");
	}
	@Test
	public void LastName() {
		
		driver.findElement(By.id("pw-input")).sendKeys("Khalid");
	}
	@Test
	public void KeepSignin() {
		driver.findElement(By.id("stay-signedin")).click();
	}
	@Test
	public void SigninButton() {
		driver.findElement(By.id("sign-in")).click();
	}
	@Test
	public void ForgotPassowrd() {
		driver.findElement(By.id("forgot-password")).click();
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
