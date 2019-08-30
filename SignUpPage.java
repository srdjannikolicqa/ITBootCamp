package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends Base{
	
	static WebDriver driver;
	
	public SignUpPage (WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static WebElement email() {
		return driver.findElement(By.cssSelector("input.input-email"));
	}
	
	private static WebElement password() {
		return driver.findElement(By.cssSelector("input.input-password"));
	}
	
	private static WebElement screenName() {
		return driver.findElement(By.cssSelector("input.input-text"));
	}
	
	private static WebElement termsOfService() {
		return driver.findElement(By.cssSelector("div.terms a"));
	}
	
	// Actions
	
	public void clickTermsOfService() {
		termsOfService().click();
	}
}
