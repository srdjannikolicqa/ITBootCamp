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
import FinalProject.NavigationMenuHidden;

public class ArchiveTest3 extends Base {

	WebDriver driver;
	private NavigationMenu nm;
	private NavigationMenuHidden nmh;
	private MainPageFloater mpf;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		this.mpf = new MainPageFloater(driver);
		this.nmh = new NavigationMenuHidden(driver);
		this.nm = new NavigationMenu(driver);
	}

	@Test
	public void Test1() throws Exception {
		this.nmh.clickHiddenMenuIcons(1);
		this.nmh.clickHiddenMenuElementsList(0);
		Thread.sleep(4000);
		String url1 = driver.getCurrentUrl();
		this.nm.clickLogo();
		Thread.sleep(2000);
		this.mpf.clickFloaterIcons(1);
		Thread.sleep(2000);
		String url2 = driver.getCurrentUrl();
		Assert.assertEquals(url1, url2);
		driver.close();
	}
}
