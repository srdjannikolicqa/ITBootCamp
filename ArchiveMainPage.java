package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArchiveMainPage extends Base{

	static WebDriver driver;
	
	public ArchiveMainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> topCollection(){
		return driver.findElements(By.cssSelector("div.collection-title.C.C2"));
	}
	
	// Actions
	
	public List<WebElement> getTopCollection(){
		return topCollection();
	}
	
	public void clickTopCollection(Integer i) {
		topCollection().get(i).click();
	}
}
