package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage extends Base{

	static WebDriver driver;
	
	public NewsPage() {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> news(){
		return driver.findElements(By.cssSelector("tr.eve.forumRow"));
	}
	
	private static WebElement mail(){
		return driver.findElement(By.cssSelector("span.iconochive-email"));
	}
	
	
	// Actions
	
	public void clickNews(Integer i) {
		news().get(i).findElement(By.cssSelector("a")).click();
	}
	
	public void clickMail() {
		mail().click();
	}
	
	
	
	
}
