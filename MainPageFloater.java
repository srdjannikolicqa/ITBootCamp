package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageFloater extends Base{
	
	static WebDriver driver;
	
	public MainPageFloater(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static WebElement floaterSearch(){
		return driver.findElement(By.cssSelector("input.js-search-bar"));
	}
	
	private static WebElement floaterGoButton(){
		return driver.findElement(By.cssSelector("button.input-sm"));
	}
	
	private static List<WebElement> floaterIcons(){
		return driver.findElements(By.cssSelector("div.mt-big"));
	}
	
	private static WebElement floaterAdvancedSearch(){
		return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}
	
	private static WebElement floaterSeeMore(){
		return driver.findElement(By.cssSelector("div.pull-right a"));
	}
		
	private static WebElement floaterSearchOptions(){
		return driver.findElement(By.cssSelector("#search_options"));
	}
	
	// Actions
	
	public boolean isFloaterSearchOptionsActive() {
		return floaterSearchOptions().getAttribute("aria-expanded").contentEquals("true");
	}
	
	public void sendTextToFloaterSearch(String searchTerm) {
		floaterSearch().sendKeys(searchTerm);
	}
	
	public void clickFloaterGoButton() {
		floaterGoButton().click();
	}
	
	public void clickFloaterSearch() {
		floaterSearch().click();
	}
	
	public void clickFloaterIcons(Integer i) {
		floaterIcons().get(i).click();
	}
	
	public void clickFloaterAdvancedSearch() {
		floaterAdvancedSearch().click();
	}
	
	public void clickFloaterSeeMore() {
		floaterSeeMore().click();
	}
}
