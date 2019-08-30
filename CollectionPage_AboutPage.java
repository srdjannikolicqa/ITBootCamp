package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionPage_AboutPage extends Base{

	static WebDriver driver;
	
	public CollectionPage_AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> contributors() {
		return driver.findElements(By.cssSelector("div.items_list.person"));
	}
	
	private static List<WebElement> graphs() {
		return driver.findElements(By.cssSelector("div.grafs.about-box"));
	}
	
	private static List<WebElement> relatedCollections() {
		return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-5 > div:nth-child(7) > div:not(.micro-label)"));
	}
	
	private static WebElement topRegions() {
		return driver.findElement(By.cssSelector("table.stats-table"));
	}
	
	
	// Actions
	
	public void clickContributors(Integer i) {
		contributors().get(i).click();
	}
	
}
