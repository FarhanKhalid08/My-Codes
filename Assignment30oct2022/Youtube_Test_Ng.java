package assignment_30oct_2022;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube_Test_Ng {
public static WebDriver driver;

@BeforeClass
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://youtube.com");
	System.out.println(System.getProperty("user.dir"));
	}
@Test
public void HomePage() throws Exception {
	WebElement YoutubeLogo= driver.findElement(By.id("logo-icon"));
	File source = YoutubeLogo.getScreenshotAs(OutputType.FILE);
	File destination= new File (System.getProperty("user.dir")+ "\\Screen Shots\\YoutubeLogo.png");
	FileHandler.copy(source, destination);
	WebElement Gaming= driver.findElement(By.xpath("//div[@id='scroll-container']/descendant::yt-formatted-string[text()='Gaming']"));
	if (Gaming.isDisplayed()==true && Gaming.isEnabled()==true) {
		Gaming.click();
	}else {
		System.out.println("The Gaming link is not working");
	}
	}
@Test
public void SigninButton() {
	WebElement SigninButton= driver.findElement(By.xpath("//div[@id='contentContainer']/preceding::div[2]"));
	SigninButton.click();
}
@Test
public void Music()  {
	WebElement Music= driver.findElement(By.xpath("//div[@id='scroll-container']/descendant::yt-formatted-string[2]"));
	Music.click();
	}
@Test
public void Live() {
	WebElement Live= driver.findElement(By.xpath("//div[@id='scroll-container']/descendant::yt-formatted-string[text()='Live']"));
	Live.click();
}
@Test
public void SigninPage() {
	WebElement ForgotEmailLink= driver.findElement(By.xpath("//button[text()='Forgot email?']"));
	if (ForgotEmailLink.isDisplayed()==true && ForgotEmailLink.isEnabled()==true) {
		ForgotEmailLink.click();
	}else {
		System.out.println("Forgot Email Link is not working");
	}
	}

@AfterTest
public void AfterTest() {
	driver.quit();
}


















}
