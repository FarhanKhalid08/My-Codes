package assignment_30oct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CNN_TestNG {
	public static WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://cnn.com");
	}
@Test
public void LoginButton() {
	driver.findElement(By.xpath("//button[@class='indexes__ButtonContainer-oqeuru-1 brLPZF indexes__AccountUserLogInButton-nujtvs-30 gjhHbD']/descendant::span[@class='Text-sc-1amvtpj-0-span kDWOQ']")).click();
}
@Test
public void Email() {
	driver.findElement(By.id("login-email-input")).sendKeys("farhankhalid@hotmail.com");
}
@Test
public void Password() {
	driver.findElement(By.xpath("//input[@id='login-password-input']")).sendKeys("subhan");
}
@Test
public void LoginButton2() {
	driver.findElement(By.xpath("//button[@class='user-account-login-form__button user-account-shared__button']")).click();
}
@Test
public void SignUp() {
	driver.findElement(By.id("login-registration-link")).click();
}
@AfterTest
public void AfterTest() {
	driver.quit();
}
}
