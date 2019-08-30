package FinalProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage extends Base {

	static WebDriver driver;
	private List<String> tmp;

	public PeoplePage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> people() {
		return driver.findElements(By.cssSelector("div.bio div:not(.bio)"));
	}

	private static List<WebElement> peopleNames() {
		return driver.findElements(By.cssSelector("div.bio div:not(.bio) b"));
	}

	private static List<WebElement> peopleJobs() {
		return driver.findElements(By.cssSelector("div.bio div:not(.bio) i"));
	}

	// Actions

	public List<String> getPeopleNamesAndJobs() {
		List<String> tmp = new ArrayList<String>();
		List<WebElement> names = peopleNames();
		List<WebElement> jobs = peopleJobs();
		String delimiter;
		for (int i = 0; i < names.size(); i++) {
			if (jobs.get(i).getText().startsWith(","))
				delimiter = "";
			else
				delimiter = " ";
			tmp.add(names.get(i).getText() + delimiter + jobs.get(i).getText());
		}
		return tmp;
	}
}
