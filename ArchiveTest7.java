package FinalProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FinalProject.PageURLs;

public class ArchiveTest7 extends Base {

	WebDriver driver;
	private LoginPage loginPage;
	private NavigationMenu navigationMenu;
	private SignUpPage signUpPage;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		this.waitPageLoaded();
		this.navigationMenu = new NavigationMenu(driver);
		this.loginPage = new LoginPage(driver);
		this.signUpPage = new SignUpPage(driver);
	}

	@Test
	public void Test1() throws Exception {
		this.navigationMenu.clickSignIn();
		Assert.assertTrue(this.loginPage.isResetPassword());
	}

	@Test
	public void Test2() throws Exception {
		this.loginPage.clickSignUp();
		this.signUpPage.clickTermsOfService();
		this.waitPageLoaded();
		Assert.assertTrue(getChildWindow().contains("terms"));
		driver.quit();
	}

	public String getChildWindow() {
		Set<String> window = driver.getWindowHandles();
		Iterator iterator = window.iterator();
		String currentWindowId = null;
		String mainPage = driver.getWindowHandle();
		while (iterator.hasNext()) {
			currentWindowId = iterator.next().toString();
			// Takes the url from child window
			if (!currentWindowId.equals(mainPage)) {
				driver.switchTo().window(currentWindowId);
			}
		}
		return driver.getCurrentUrl();
	}
}