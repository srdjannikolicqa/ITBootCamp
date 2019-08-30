package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{

	static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement loginError() {
		return driver.findElement(By.cssSelector("span.login-error.password-error"));
	}
	
	private static WebElement email() {
		return driver.findElement(By.cssSelector("input.form-element.input-email"));
	}
	
	private static WebElement password() {
		return driver.findElement(By.cssSelector("input.form-element.input-password"));
	}
	
	private static WebElement loginButton() {
		return driver.findElement(By.cssSelector("input.btn.btn-primary.btn-submit.input-submit"));
	}
	
	private static WebElement keepLogged() {
		return driver.findElement(By.cssSelector("input.input-checkbox"));
	}
	
	private static WebElement resetPassword() {
		return driver.findElement(By.cssSelector("span.reset-password"));
	}
	
	private static WebElement signUp() {
		return driver.findElement(By.cssSelector("section.login-header.text-center p a"));
	}
	
	private static WebElement passwordIcon() {
		return driver.findElement(By.cssSelector("img.password_icon"));
	}
	
	// Actions
	
	public String getLoginErrorText() {
		return loginError().getText();
	}
	
	public boolean isResetPassword() {
		return resetPassword().isDisplayed();
	}
	
	public void sendTextToEmail(String email) {
		email().sendKeys(email);
	}
	
	public void sendTextToPassword(String password) {
		password().sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton().click();
	}
	
	public boolean isLoginButtonVisible() {
		return loginButton().isDisplayed();
	}
	
	public void clickKeepLogged() {
		keepLogged().click();
	}
	
	public void clickResetPassword() {
		resetPassword().click();
	}
	
	public void clickSignUp() {
		signUp().click();
	}
	
	public void clickPasswordIcon() {
		passwordIcon().click();
	}
}
