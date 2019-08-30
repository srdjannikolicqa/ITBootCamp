package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenMenuSearchResultsPage extends Base{

	static WebDriver driver;
	
	public HiddenMenuSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> searchResults(){
		return driver.findElements(By.cssSelector("li.result-item"));
	}
	
	
	// Actions
	
	public void clickSearchResults(Integer i) {
		searchResults().get(i).findElement(By.cssSelector("div a.screenshot-container")).click();
	}
	
	
}
