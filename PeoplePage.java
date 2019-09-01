package FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	// Actions

	public List<String> getPeopleNamesAndJobs() {
		String regex = ".+(?=\\n)";
		List<String> tmp = new ArrayList<String>();
		List<String> tmpTrimmed = new ArrayList<String>();
		List<WebElement> tmpWebElements = people();
		for (int i = 0; i < tmpWebElements.size(); i++)
			tmp.add(tmpWebElements.get(i).getText());
		for (int i = 0; i < tmp.size(); i++) {
			Matcher m = Pattern.compile(regex).matcher(tmp.get(i));
			if (m.find())
				tmpTrimmed.add(m.group(0));
		}
		return tmpTrimmed;
	}
}
