package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HelpPage extends Base{

	static WebDriver driver;
	
	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("#query"));
	}
	
	private static List<WebElement> buttons() {
		return driver.findElements(By.cssSelector("li.blocks-item"));
	}
	
	private static WebElement signIn() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	
	
	
	// Actions
	
	public void sendTextToSearchBar (String searchTerm) {
		searchBar().sendKeys(searchTerm, Keys.ENTER);
	}
	
	public void sendTextToSearchBar_Action (String searchTerm) {
		Actions builder = new Actions(driver);
		Action enterTextToSearchField = builder
				.moveToElement(searchBar())
				.click()
				.sendKeys(searchTerm)
				.sendKeys(Keys.ENTER)
				.build();
		enterTextToSearchField.perform();
	}
	
	public void clickButtons (Integer i) {
		buttons().get(i).click();
	}
	
	public void clickButtons (String buttonName) {
		for(WebElement i:buttons())
			if (i.findElement(By.cssSelector("a h4")).getText().toLowerCase().equals(buttonName.toLowerCase()))
				i.click();
	}
	
	public void clickSignIn () {
		signIn().click();
	}
	
}
