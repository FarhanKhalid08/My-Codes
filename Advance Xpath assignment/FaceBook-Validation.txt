package assignment_23oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Url_Title_Webelement {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String ActualCurrentUrl="https://www.facebook.com/";
		String ExpectedCurrentUrl=driver.getCurrentUrl();
		String ActualTitle="Facebook - log in or sign up";
		String ExpectedTitle=driver.getTitle();
		if (ActualCurrentUrl.equals(ExpectedCurrentUrl)&& ActualTitle.equals(ExpectedTitle)) {
			System.out.println("My URL and Title are valid");
		}else {
			System.out.println("My URL and Title are not valid.");
		}
		WebElement CreateNewAccount= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		if (CreateNewAccount.isEnabled()== true && CreateNewAccount.isDisplayed()==true) {
			CreateNewAccount.click();
		}else {
			System.out.println("The Create New Account Button is not working");
		}
		WebElement FirstNameTextbox=driver.findElement(By.name("firstname"));
		if (FirstNameTextbox.isEnabled()==true && FirstNameTextbox.isDisplayed()==true) {
			FirstNameTextbox.sendKeys("Farhan");
		}else {
			System.out.println("The text box is not working.");
		}
		WebElement LastNameTextbox=driver.findElement(By.name("lastname"));
		if (LastNameTextbox.isEnabled()==true && LastNameTextbox.isDisplayed()==true) {
			LastNameTextbox.sendKeys("Khalid");
		}else {
			System.out.println("The text box is not working.");
		}
		WebElement MobileandEmailTextBox=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		if (MobileandEmailTextBox.isEnabled()==true && MobileandEmailTextBox.isDisplayed()==true) {
			MobileandEmailTextBox.sendKeys("farhankhalid920@hotmail.com");
		}else {
			System.out.println("The text box is not working.");
		}
		WebElement ReEnterEmailTextBox=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		if (ReEnterEmailTextBox.isEnabled()==true && ReEnterEmailTextBox.isDisplayed()==true) {
			ReEnterEmailTextBox.sendKeys("farhankhalid920@hotmail.com");
		}else {
			System.out.println("The text box is not working.");
		}
		WebElement PasswordTextBox=driver.findElement(By.id("password_step_input"));
		if (PasswordTextBox.isEnabled()==true && PasswordTextBox.isDisplayed()==true) {
			PasswordTextBox.sendKeys("Subhan");
		}else {
			System.out.println("The text box is not working.");
		}

	}

}
