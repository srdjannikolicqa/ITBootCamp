package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPageUnit extends Base{

	static WebDriver driver;
	
	public NewsPageUnit(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement content() {
		return driver.findElement(By.cssSelector("maincontent"));
	}
	
	
	// Actions
	
	
	
	
	
}
