package assignment_30oct_2022;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chickfila_TestNG {
	public static WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chick-fil-a.com/");
	}	
	@Test(priority=2)
	public void About() {
		driver.findElement(By.xpath("//li[@id='navitem-about']")).click();
	}
	@Test(priority=1)
	public void Careers() {
		driver.findElement(By.xpath("//li[@id='navitem-about']/descendant::span[text()='Careers']")).click();
	}
	@Test(priority=1)
	public void Stories() {
		driver.findElement(By.xpath("//li[@id='navitem-stories']")).click();
	}
@Test(priority=5)
public void Signin() {
	WebElement signinlink=driver.findElement(By.xpath("//div[@id='navitem-cfaone']/descendant::form[1]/descendant::button"));
	if (signinlink.isDisplayed()==true && signinlink.isEnabled()==true) {
		signinlink.click();
	}else {
		System.out.println("The link is not working");
	}
}
@Test(priority=1)
public void Logo() throws Exception {
	WebElement Logo=driver.findElement(By.xpath("//a[@class='icon-logo-desktop logo']"));
	File source= Logo.getScreenshotAs(OutputType.FILE);
	File destination= new File (System.getProperty("user.dir")+ "\\Screen Shots\\Chickfila.png");
	FileHandler.copy(source, destination);
}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
