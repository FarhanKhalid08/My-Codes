package assignment06nov_2022;

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

public class Facebook_CssSelector {
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	public static Select select;
	public static WebDriverWait wait;

	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1, alwaysRun = true)
	public void CreateAccountButton() {
		WebElement createaccountbutton = driver.findElement(By.cssSelector("div._6ltg+div+div+div>a"));
		softassert.assertTrue(createaccountbutton.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(createaccountbutton));
		createaccountbutton.click();
		softassert.assertAll();
	}

	@Test(priority = 2, dependsOnMethods = "CreateAccountButton", alwaysRun = true)
	public void PersonalInformation() throws Exception {
		
		WebElement FirstName = driver.findElement(By.cssSelector("div[id=fullname_field]>div>div>div>input"));
		softassert.assertTrue(FirstName.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(FirstName));
		FirstName.sendKeys("Farhan");
 
		WebElement LastName = driver.findElement(By.cssSelector("input[name=lastname]"));
		softassert.assertTrue(LastName.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(LastName));
		LastName.sendKeys("Khalid");

		WebElement EmailAddress = driver.findElement(By.cssSelector("input[name=reg_email__]"));
		softassert.assertTrue(EmailAddress.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(EmailAddress));
		EmailAddress.sendKeys("farhankhalid123@hotmail.com");

		WebElement ReEnterEmailAddress = driver.findElement(By.cssSelector("input[name=reg_email_confirmation__]"));
		softassert.assertTrue(ReEnterEmailAddress.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ReEnterEmailAddress));
		ReEnterEmailAddress.sendKeys("farhankhalid123@hotmail.com");

		WebElement Password = driver.findElement(By.cssSelector("input#password_step_input"));
		softassert.assertTrue(Password.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Password));
		Password.sendKeys("subhan123");
		
		
		select = new Select(driver.findElement(By.cssSelector("select#month")));
		select.selectByVisibleText("Dec");
		select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.selectByVisibleText("8");
		select = new Select(driver.findElement(By.cssSelector("select#year")));
		select.selectByVisibleText("1983");
		
Thread.sleep(5000);
		WebElement Gender = driver.findElement(By.xpath("//div[@id='custom_gender_container']/preceding::input[2]"));
		softassert.assertTrue(Gender.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(Gender));
		Gender.click();
		softassert.assertAll();

	}

	@Test(priority = 3, dependsOnMethods = { "CreateAccountButton", "PersonalInformation" }, alwaysRun = true)
	public void SigninButton() {
		WebElement signinbutton = driver.findElement(By.cssSelector("button[name=websubmit]"));
		softassert.assertTrue(signinbutton.isDisplayed());
		signinbutton.click();
		softassert.assertAll();
	}

	@AfterTest
	public void Quit() {
		driver.quit();
	}
}
