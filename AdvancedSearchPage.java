package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchPage extends Base{

	static WebDriver driver;
	
	public AdvancedSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector("#searchForm"));
	}
	
	private static WebElement advancedSearchReturning() {
		return driver.findElement(By.cssSelector("#rawform"));
	}
	
	// Actions
	
	
	
	
	
}
