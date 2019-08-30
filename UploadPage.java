package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage extends Base{

	static WebDriver driver;
	
	public UploadPage (WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement signUp() {
		return driver.findElement(By.cssSelector("div.container.container-ia p b a:nth-child(2)"));
	}
	
	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("a.buttonG.btn.btn-success"));
	}
	
	private static WebElement liveMusicArchiveUploadButton() {
		return driver.findElement(By.cssSelector("a.btn.btn-primary"));
	}
	
	private static WebElement questionMark() {
		return driver.findElement(By.cssSelector("span.iconochive-question-dark"));
	}
	
	// Actions
	
	public void clickSignUp() {
		signUp().click();
	}
		
	public void clickUploadButton() {
		uploadButton().click();
	}
	
	public void clickLiveMusicArchiveUploadButton() {
		liveMusicArchiveUploadButton().click();
	}
	
	public void clickQuestionMark() {
		questionMark().click();
	}
}
