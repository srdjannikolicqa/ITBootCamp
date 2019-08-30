package FinalProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FinalProject.PageURLs;

public class ArchiveTest2 extends Base {

	WebDriver driver;
	private ArchiveMainPage mp;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();

		this.mp = new ArchiveMainPage(driver);
	}

	@Test
	public void Test1() throws Exception {

		Thread.sleep(2000);
		List<WebElement> tc = new ArrayList<WebElement>();
		tc = this.mp.getTopCollection();
		String itemsFirstElement = tc.get(0).findElement(By.cssSelector("div.num-items.topinblock")).getText();
		int index = 0;
		for (int i = 0; i < itemsFirstElement.length(); i++)
			if ((itemsFirstElement.charAt(i) == ',')
					|| ((itemsFirstElement.charAt(i) >= '0') && (itemsFirstElement.charAt(i) <= '9'))) {
			} else {
				index = i;
				break;
			}
		itemsFirstElement = itemsFirstElement.substring(0, index);
		this.mp.clickTopCollection(0);
		String itemsSecondElement = driver.findElement(By.cssSelector("div.results_count")).getText();
		index = 0;
		for (int i = 0; i < itemsSecondElement.length(); i++)
			if ((itemsSecondElement.charAt(i) == ',')
					|| ((itemsSecondElement.charAt(i) >= '0') && (itemsSecondElement.charAt(i) <= '9'))) {
			} else {
				index = i;
				break;
			}
		itemsSecondElement = itemsSecondElement.substring(0, index);
		int item1 = 0, item2 = 0;
		char letter;
		for (int i = 0; i < itemsFirstElement.length(); i++) {
			letter = itemsFirstElement.charAt(i);
			if (letter == ',')
				continue;
			item1 *= 10;
			item1 += (letter - 48);
		}
		for (int i = 0; i < itemsSecondElement.length(); i++) {
			letter = itemsSecondElement.charAt(i);
			if (letter == ',')
				continue;
			item2 *= 10;
			item2 += (letter - 48);
		}
		int difference = 0;
		if (item1 > item2)
			difference = item1 - item2;
		else
			difference = item2 - item1;
		System.out.println(difference);
		Assert.assertTrue(difference < 1000);
		driver.close();
	}
}
