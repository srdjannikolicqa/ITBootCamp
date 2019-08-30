package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage extends Base{

	static WebDriver driver;
	
	public BlogPage (WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> navigationMenu(){
		return driver.findElements(By.cssSelector("li.menu-item"));
	}
	
	private static List<WebElement> socialNetwork(){
		return driver.findElements(By.cssSelector("a.shareitem"));
	}
	
	private static WebElement archivesDropdown(){
		return driver.findElement(By.cssSelector("#archives-dropdown-2"));
	}
	
	private static List<WebElement> archivesDropdownValues(){
		return driver.findElements(By.cssSelector("#archives-dropdown-2 option"));
	}
	
	private static WebElement search(){
		return driver.findElement(By.cssSelector("#s"));
	}
	
	private static WebElement searchButton(){
		return driver.findElement(By.cssSelector("#searchsubmit"));
	}
	
	private static List<WebElement> posts(){
		return driver.findElements(By.cssSelector("[id^='post-']"));
	}
	
	
	// Actions
	
	public void clickNavigationMenu(Integer i) {
		navigationMenu().get(i).click();
	}
	
	public void clickSocialNetwork(Integer i) {
		socialNetwork().get(i).click();
	}
	
	public void clickArchivesDropdown() {
		archivesDropdown().click();
	}
	
	// 0 - select month ; counts 1 - topmost item / 162 - bottom one
	public void clickArchivesDropdownValues(Integer i) {
		archivesDropdownValues().get(i).click();
	}
	
	public void clickArchivesDropdownValues_Select(Integer i) {
		Select dropdown = new Select(archivesDropdown());
		dropdown.selectByIndex(i);
	}
	
	public void clickArchivesDropdownValues_Select(String visibleText) {
		Select dropdown = new Select(archivesDropdown());
		dropdown.selectByVisibleText(visibleText);
	}
	
		
	public void sendTextToSearch(String searchTerm) {
		search().sendKeys(searchTerm);
	}
	
	public void clickSearchButton() {
		searchButton().click();
	}
	
	public void clickPosts(Integer i) {
		posts().get(i).click();
	}
	
	
	
}
