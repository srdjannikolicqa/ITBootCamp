package FinalProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FinalProject.PageURLs;

public class ArchiveTest6 extends Base {

	WebDriver driver;
	private LoginPage loginPage;
	private NavigationMenu navigationMenu;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		this.waitPageLoaded();
		this.navigationMenu = new NavigationMenu(driver);
		this.loginPage = new LoginPage(driver);
	}

	@Test
	public void Test1() {
		this.navigationMenu.clickSignIn();
		Assert.assertTrue(this.loginPage.isLoginButtonVisible());
	}

	@Test
	public void Test2() throws Exception {
		this.loginPage.sendTextToEmail("foo@gmail.com");
		this.loginPage.sendTextToPassword("bar");
		this.loginPage.clickLoginButton();
		Assert.assertTrue(this.loginPage.getLoginErrorText().contains("Email address and/or Password incorrect."));
		driver.close();
	}
}
