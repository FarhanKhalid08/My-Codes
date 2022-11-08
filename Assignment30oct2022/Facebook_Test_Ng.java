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

public class Facebook_Test_Ng {
public static WebDriver driver;
public static Select select;

@BeforeTest
public void Setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://facebook.com");
}
@Test
public void CreateNewAccountButton() {
	WebElement CreateNewAccountButton = driver.findElement(By.xpath("//div[@class='_6ltg']/descendant::a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	CreateNewAccountButton.click();
}
@Test
public void FirstandLastName() {
	WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	FirstName.sendKeys("Farhan");
	WebElement LastName= driver.findElement(By.xpath("//input[@name='lastname']"));
	LastName.sendKeys("Khalid");
}
@Test
public void EmailAddress() {
	WebElement EmailAddress= driver.findElement(By.xpath("//input[@name='reg_email__']"));
	EmailAddress.sendKeys("farhankhalid920@hotmail.com");
	WebElement ReEnterEmailAddress= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	ReEnterEmailAddress.sendKeys("farhankhalid920@hotmail.com");
}
@Test
public void PasswordAndDOB() {
	WebElement Password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	Password.sendKeys("Subhan");
	select= new Select (driver.findElement(By.id("month")));
	select.selectByVisibleText("Dec");
	select= new Select (driver.findElement(By.id("day")));
	select.selectByVisibleText("8");
	select = new Select (driver.findElement(By.id("year")));
	select.selectByVisibleText("1983");
}
@Test
public void GenderAndSignupButton() throws InterruptedException {
	Thread.sleep(3000);
	WebElement Gender=driver.findElement(By.xpath("//div[@id='custom_gender_container']/preceding::input[2]"));
	Gender.click();
	WebElement SignUpButton= driver.findElement(By.name("websubmit"));
	SignUpButton.click();
}
@AfterTest
public void AfterTest() {
	driver.quit();
}
}
