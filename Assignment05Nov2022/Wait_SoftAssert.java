package assignment_05nov;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_SoftAssert {
public static WebDriver driver;
public static Select select;
WebDriverWait wait;
SoftAssert softassert = new SoftAssert();

@BeforeTest 
public void LaunchBrowser(){
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(priority=1)
public void signinlink() {
	WebElement singinlink= driver.findElement(By.className("login"));
	softassert.assertTrue(singinlink.isDisplayed());
	wait= new WebDriverWait (driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(singinlink)).click();
	softassert.assertAll();
}
@Test(priority=2, dependsOnMethods= "signinlink", alwaysRun=true)
public void EmailAddressTextBox() {
	WebElement EmailAddress= driver.findElement(By.id("email_create"));
	softassert.assertTrue(EmailAddress.isEnabled());
	wait= new WebDriverWait (driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(EmailAddress)).sendKeys("farhankhalid@hotmail.com");
	WebElement CreateanAccount = driver.findElement(By.id("SubmitCreate"));
	softassert.assertTrue(CreateanAccount.isDisplayed());
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(CreateanAccount)).click();
	softassert.assertAll();
}
@Test(priority=3, dependsOnMethods= {"signinlink","EmailAddressTextBox"}, alwaysRun=true)
public void PersonalInformation() {
	WebElement Gender= driver.findElement(By.id("id_gender1"));
	softassert.assertTrue(Gender.isDisplayed());
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(Gender)).click();
	
	WebElement FirstName= driver.findElement(By.id("customer_firstname"));
	softassert.assertTrue(FirstName.isDisplayed());
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(FirstName)).sendKeys("Farhan");
	
	WebElement LastName= driver.findElement(By.id("customer_lastname"));
	softassert.assertTrue(LastName.isEnabled());
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(LastName)).sendKeys("Khalid");
	
	WebElement Password= driver.findElement(By.id("passwd"));
	softassert.assertTrue(Password.isDisplayed());
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(Password)).sendKeys("subhan14");
	
	select= new Select (driver.findElement(By.id("days")));
	select.deselectByVisibleText("8");
	select= new Select (driver.findElement(By.id("months")));
	select.deselectByVisibleText("December");
	select= new Select(driver.findElement(By.id("years")));
	select.deselectByVisibleText("1983");
	
	WebElement Address= driver.findElement(By.name("address1"));
	softassert.assertTrue(Address.isDisplayed());
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(Address)).sendKeys("7120 Healy DR");
	
	WebElement City= driver.findElement(By.id("city"));
	softassert.assertTrue(City.isDisplayed());
	wait= new WebDriverWait (driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(City)).sendKeys("Springfield");
	
	select= new Select(driver.findElement(By.name("id_state")));
	select.selectByVisibleText("Virginia");
	
	WebElement Zipcode= driver.findElement(By.id("postcode"));
	softassert.assertTrue(Zipcode.isDisplayed());
	wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(Zipcode)).sendKeys("22150");
	
    select= new Select(driver.findElement(By.id("id_country")));
	select.deselectByVisibleText("United States");
	
	WebElement Mobileno= driver.findElement(By.name("phone_mobile"));
	softassert.assertTrue(Mobileno.isDisplayed());
	wait = new WebDriverWait (driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(Mobileno)).sendKeys("5712367346");
	
	WebElement Alias= driver.findElement(By.id("alias"));
	softassert.assertTrue(Alias.isDisplayed());
	wait= new WebDriverWait (driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(Alias)).sendKeys("HelloByeBye");
	softassert.assertAll();
}
@Test(priority=4, dependsOnMethods= {"signinlink","EmailAddressTextBox","PersonalInformation"}, alwaysRun=true)
public void Register() {
	WebElement register= driver.findElement(By.name("submitAccount"));
	softassert.assertTrue(register.isDisplayed());
	wait= new WebDriverWait (driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(register)).click();
	softassert.assertAll();
}
@AfterTest
public void AfterTest() {
	//driver.quit();
}
}
