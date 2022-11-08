package assignment_30oct_2022;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Walmart_TestNG {
public static WebDriver driver;

@BeforeTest
public void Setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://walmart.com");
}
@Test
public void Homepage() throws Exception {
	WebElement WalmartLogo= driver.findElement(By.xpath("//img[@class='db']"));
	System.out.println(System.getProperty("user.dir"));
	File source= WalmartLogo.getScreenshotAs(OutputType.FILE);
	File destination= new File (System.getProperty("user.dir")+ "\\Screen Shots\\WalmartLogo.png");
	FileHandler.copy(source, destination);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("http://target.com");
}
@Test
public void Signin()  {
	 WebElement SearchBar= driver.findElement(By.xpath("//input[@id='search']"));
	 SearchBar.sendKeys("Hello");
	
	}

@Test
public void HouseholdEssentials() {
	WebElement HouseholdEssentials= driver.findElement(By.xpath("//span[contains(text(),'Household Essentials')]"));
	HouseholdEssentials.click();
	
}
@Test
public void SigninButton() {
	WebElement SigninButton= driver.findElement(By.xpath("//span[text()='Sign in']"));
	SigninButton.click();
}
@Test
public void Registry() {
	driver.findElement(By.xpath("//a[@id='utilityNav-registries']")).click();
	}
@AfterTest
public void AfterTest() {
	driver.quit();
}
}
