package oct15_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static WebDriver driver;
	public static void main(String[] args) {

		String Browser = "Chrome";
		String Browser1 = "Firefox";
		String Browser2 = "Edge";
		
		if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
			driver.quit();
		}
		else if (Browser1.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://amazon.com");
			driver.manage().window().maximize();
			driver.quit();	
		}
		else if (Browser2.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://facebook.com");
			driver.manage().window().maximize();
			driver.quit();
		}
		else { System.out.println("None of the Browsers are Working");
		}
		}
	}
