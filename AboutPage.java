package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;



public class AboutPage extends Base{
	
	static WebDriver driver;
	
	public AboutPage (WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> news(){
		return driver.findElements(By.cssSelector("tr.forumRow"));
	}
	
	private static WebElement more(){
		return driver.findElement(By.cssSelector("h1 a"));
	}
	
	
	
	// Actions
	
	public void clickNews (Integer i) {
		news().get(i).click();
	}
	
	public void clickMore () {
		more().click();
	}
	
	public Integer numberOfElementsInNews() {
		return news().size();
	}
	
}
