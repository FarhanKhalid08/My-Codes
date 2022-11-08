package assignment_22oct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Videos {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.findElement(By.xpath("//a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'vdicon')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
	}

}
