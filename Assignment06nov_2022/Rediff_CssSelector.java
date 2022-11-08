package assignment06nov_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_CssSelector {
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();

	@BeforeTest
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1, alwaysRun = true)
	public void SigninLink() {
		WebElement signinlink = driver.findElement(By.cssSelector("a.signin"));
		softassert.assertTrue(signinlink.isDisplayed());
		signinlink.click();
		softassert.assertAll();
	}

	@Test(priority = 2, dependsOnMethods = "SigninLink", alwaysRun = true)
	public void LoginCredentials() {
		WebElement usernametextbox = driver.findElement(By.cssSelector("input#login1"));
		softassert.assertTrue(usernametextbox.isDisplayed());
		usernametextbox.sendKeys("seleniumpanda@rediffmail.com");

		WebElement password = driver.findElement(By.cssSelector("div.pwdpass>input#password"));
		softassert.assertTrue(password.isDisplayed());
		password.sendKeys("Selenium@123");

		WebElement signinbutton = driver.findElement(By.cssSelector("div.pwdpass>input.signinbtn"));
		softassert.assertTrue(signinbutton.isDisplayed());
		signinbutton.click();
		softassert.assertAll();
	}

	@Test(priority = 3, dependsOnMethods = { "SigninLink", "LoginCredentials" }, alwaysRun = true)
	public void Logoutlink() {
		WebElement logoutlink = driver.findElement(By.cssSelector("a[class=rd_logout]"));
		softassert.assertTrue(logoutlink.isDisplayed());
		logoutlink.click();
		softassert.assertAll();
	}

	@Test(priority = 4, dependsOnMethods = { "SigninLink", "LoginCredentials", "Logoutlink" }, alwaysRun = true)
	public void Homepagelink() {

		WebElement homepagelink = driver.findElement(By.cssSelector("div.new_container>a.logo+span>a:nth-child(2)>b"));
		softassert.assertTrue(homepagelink.isDisplayed());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(homepagelink)).click();
		softassert.assertAll();
	}

	@AfterTest
	public void Quit() {
		driver.quit();
	}
}
