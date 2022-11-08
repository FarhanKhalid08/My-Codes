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

public class Google_TestNG {
	public static WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://google.com");
	}
	@Test
	public void Google() throws Exception {
		WebElement GoogleLogo= driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File source= GoogleLogo.getScreenshotAs(OutputType.FILE);
		File destination= new File(System.getProperty("user.dir")+"\\Screen Shots\\GoogleLogo.png");
		FileHandler.copy(source, destination);
	}
	@Test
	public void SearchBar() {
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Hello");
	}
	@Test
	public void SignInButton() {
		driver.findElement(By.xpath("//a[@class='gb_2 gb_3 gb_9d gb_9c']")).click();
	}
	
	@Test
	public void Images() {
		driver.findElement(By.xpath("//a[text()='Images']")).click();
	}
	@Test
	public void CameraSearchButton() {
		driver.findElement(By.xpath("//img[@class='Gdd5U']")).click();
	}
	
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
