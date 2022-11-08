package assignment_30oct_2022;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo_TestNg {
public static WebDriver driver;
public static Select select;
@BeforeTest
public void SetUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://yahoo.com");
}
@Test
public void CreateAccount() {
	WebElement SigninButton= driver.findElement(By.className("_yb_1rtzu"));
	SigninButton.click();
	
	WebElement CreateAccountButton= driver.findElement(By.id("createacc"));
	CreateAccountButton.click();
	 
}
@Test
public void FirstandLastName() {
	WebElement FirstName= driver.findElement(By.name("firstName"));
	FirstName.sendKeys("Farhan");
	
	WebElement LastName= driver.findElement(By.id("usernamereg-lastName"));
	LastName.sendKeys("Khalid");
}
@Test
public void EmailAddress() {
	WebElement EmailAddress= driver.findElement(By.name("userId"));
	EmailAddress.sendKeys("farhankhalid123");
}
@Test
public void Password() {
	WebElement Password=driver.findElement(By.name("password"));
	Password.sendKeys("123456");
}
@Test
public void DOBandContinueButton() {
	WebElement BirthYear=driver.findElement(By.name("birthYear"));
	BirthYear.sendKeys("1983");
	WebElement ContinueButton= driver.findElement(By.name("signup"));
	ContinueButton.click();
}
@AfterTest
public void AfterTest() {
	driver.quit();
}
}
