package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FinalProject.PageURLs;

public class ArchiveTest5 extends Base {

	WebDriver driver;
	private NavigationMenu nm;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		this.nm = new NavigationMenu(driver);
	}

	@Test
	public void Test1() throws Exception {
		Thread.sleep(2000);
		this.nm.clickUpload();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector("#maincontent > div > p > b:nth-child(5)")).getText(),
				"Log in or Sign up");
		driver.close();
	}
}