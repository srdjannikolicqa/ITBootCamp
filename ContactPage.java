package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends Base{

	static WebDriver driver;
	
	public ContactPage (WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Elements
	
	private static List<WebElement> maps (){
		return driver.findElements(By.cssSelector("#maincontent img"));
	}
	
	
	
	
	// Actions
	
	public void clickMaps (Integer i) {
		maps().get(i).click();
	}
	
	
	
}
