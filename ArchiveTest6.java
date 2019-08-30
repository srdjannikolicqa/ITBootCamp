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

public class ArchiveTest6 extends Base{

	WebDriver driver;
	private LoginPage lp;
	private NavigationMenu nm;
	
	@BeforeTest
	public void setup() throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		this.nm = new NavigationMenu(driver);
		this.lp = new LoginPage(driver);
	}
	
	@Test
	public void Test1() {
		this.nm.clickSignIn();
		Assert.assertTrue(this.lp.isLoginButtonVisible());
	}
	
	@Test
	public void Test2() throws Exception{
		this.lp.sendTextToEmail(PageURLs.EMAIL);
		this.lp.sendTextToPassword(PageURLs.PASSWORD);
		this.lp.clickLoginButton();
		Thread.sleep(2000);
		Assert.assertTrue(this.lp.getLoginErrorText().contains("Email address and/or Password incorrect."));
		driver.close();
	}
}
