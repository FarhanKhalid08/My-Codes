package assignment_23oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Yahoo {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.yahoo.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String actualCurrentUrl="https://login.yahoo.com/";
        String expectedCurrentUrl=driver.getCurrentUrl();
        String actualTitle="Yahoo";
        String expectedTitle=driver.getTitle();
        if (actualCurrentUrl.equals(expectedCurrentUrl)&& actualTitle.equals(expectedTitle)) {
        System.out.println("My URL and Title are valid.");
	}else {
		System.out.println("My URL and Title are not valid.");
	}
        WebElement CreateanAccount=driver.findElement(By.id("createacc"));
        if (CreateanAccount.isEnabled()==true && CreateanAccount.isDisplayed()==true) {
        	CreateanAccount.click();
        }else {
        	System.out.println("The Create an Account Button is not working.");
        }
        WebElement FirstNameTextLine=driver.findElement(By.id("usernamereg-firstName"));
        if (FirstNameTextLine.isEnabled()==true && FirstNameTextLine.isDisplayed()==true) {
        	FirstNameTextLine.sendKeys("Farhan");
          }else {
        	  System.out.println("The first name text line is not working");
          }
        WebElement LastNameTextLine=driver.findElement(By.id("usernamereg-lastName"));
        if (LastNameTextLine.isEnabled()==true && LastNameTextLine.isDisplayed()==true) {
        	LastNameTextLine.sendKeys("Khalid");
        }else {
        	System.out.println("The last name text line is not working");
        }
        WebElement NewYahooMailTextLine=driver.findElement(By.name("userId"));
        if (NewYahooMailTextLine.isEnabled()==true && NewYahooMailTextLine.isDisplayed()==true) {
        	NewYahooMailTextLine.sendKeys("farhankhalid");
        }else {
        	System.out.println("The email text line is not working");
        }
        WebElement CreatePasswordTextLine=driver.findElement(By.id("usernamereg-password"));
        if (CreatePasswordTextLine.isEnabled()==true && CreatePasswordTextLine.isDisplayed()==true) {
        	CreatePasswordTextLine.sendKeys("Subhan");
        }else {
        	System.out.println("The password text line is not working");
        }
        WebElement BirthYearTextLine=driver.findElement(By.name("birthYear"));
        if (BirthYearTextLine.isEnabled()==true && BirthYearTextLine.isDisplayed()==true) {
        	BirthYearTextLine.sendKeys("1983");
        }else {
        	System.out.println("The Birth Year text line is not working");
        }
	}

}
