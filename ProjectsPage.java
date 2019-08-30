package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage extends Base{

	static WebDriver driver;
	
	public ProjectsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> projects(){
		return driver.findElements(By.cssSelector("div.col-sm-3"));
	}
		
	// Actions
	
	public void clickProjects (Integer i) {
		projects().get(i).click();
	}
	
	public Integer countProjects () {
		return projects().size();
	}
	
}
