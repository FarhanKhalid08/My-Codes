package assignment_22oct_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation5 {
public static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://hotmail.com");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String actualCurrentUrl="https://outlook.live.com/owa/";
	String expectedCurrentUrl=driver.getCurrentUrl();
	String actualTitle="Outlook – free personal email and calendar from Microsoft";
	String expectedTitle=driver.getTitle();
	if (actualCurrentUrl.equals(expectedCurrentUrl)&& actualTitle.equals(expectedTitle)) {
		System.out.println("MY URL is Valid");
	}else {
		System.out.println("My URL is not Valid");
	}
	driver.quit();
	}

}
