package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLinks extends Base {

	static WebDriver driver;

	public PageLinks(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> pageLinks() {
		return driver.findElements(By.cssSelector("#nav-abouts li"));
	}

	// Actions

	public void clickPageLinks(Integer i) {
		pageLinks().get(i).click();
	}

	// name = [About, Contact, Blog, ...} not case sensitive
	public void clickPageLinks(String name) {
		for (WebElement i : pageLinks())
			if (i.findElement(By.cssSelector("a")).getText().toLowerCase().equals(name.toLowerCase())) {
				i.click();
				break;
			}
	}
}
