package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionPage extends Base{

	static WebDriver driver;
	
	public CollectionPage (WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> sortBy(){
		return driver.findElements(By.cssSelector("a.ikind.stealth"));
	}
	
	private static List<WebElement> blockResults(){
		return driver.findElements(By.cssSelector("div.results [class='item-ia hov']"));
	}
	
	private static List<WebElement> criteriaRadio(){
		return driver.findElements(By.cssSelector("div.facets_collapser.collapse > div"));
	}
	
	private static WebElement searchThisCollectionBar(){
		return driver.findElement(By.cssSelector("input.form-control.input-sm.searchlist"));
	}
	
	private static List<WebElement> playOptions(){
		return driver.findElements(By.cssSelector("div.col-xs-1.col-sm-2.welcome-right a.stealth"));
	}
	
	//About, Collection, Forum
	private static List<WebElement> tabs(){
		return driver.findElements(By.cssSelector("div.tabby"));
	}
	
	private static WebElement about(){
		return driver.findElement(By.cssSelector("#tabby-about-finder"));
	}
	
	// Actions
	
	public void clickSortBy(Integer i) {
		sortBy().get(i).click();
	}
	
	public void clickBlockResults(Integer i) {
		blockResults().get(i).click();
	}
	
	public void clickCriteriaRadio(Integer i) {
		criteriaRadio().get(i).click();
	}
	
	public void sendTextToSearchThisCollectionBar(String searchTerm) {
		searchThisCollectionBar().sendKeys(searchTerm);
		searchThisCollectionBar().sendKeys(Keys.ENTER.toString());
	}
	
	public void clickPlayOptions(Integer i) {
		playOptions().get(i).click();
	}
	
	public void clickTabs(Integer i) {
		tabs().get(i).click();
	}
	
	public void clickAbout() {
		about().click();
	}
}
