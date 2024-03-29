package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FinalProject.PageURLs;

public class ArchiveTest4 extends Base {

	WebDriver driver;
	private MainPageFloater mainPageFloater;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		this.mainPageFloater = new MainPageFloater(driver);
	}

	@Test
	public void Test1() throws Exception {
		this.mainPageFloater.clickFloaterSearch();
		Assert.assertTrue(this.mainPageFloater.isFloaterSearchOptionsActive());
	}
	
	@Test
	public void Test2() throws Exception {
		this.mainPageFloater.sendTextToFloaterSearch("qa");
		this.mainPageFloater.clickFloaterGoButton();
		this.waitPageLoaded();
		Assert.assertTrue(driver.getCurrentUrl().contains("?query=qa"));
		driver.close();
	}
}