package assignment_22oct_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		String actualCurrentUrl = "https://www.facebook.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Facebook - log in or sign up";
		String expectedTitle = driver.getTitle();

		if (actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle)) {
			System.out.println("My URL is Valid");
		} else {
			System.out.println("My URL is not Valid");
		}
		driver.quit();
	}

}
