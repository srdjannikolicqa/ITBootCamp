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

public class ArchiveTest9 extends Base {

	WebDriver driver;
	private NavigationMenu navigationMenu;
	private AdvancedSearchPage advancedSearchPage;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		this.navigationMenu = new NavigationMenu(driver);
		this.advancedSearchPage = new AdvancedSearchPage(driver);
	}

	@Test
	public void Test1() throws Exception {
		this.navigationMenu.clickSearchBar();
		Assert.assertTrue(this.navigationMenu.isAdvancedSearch());
	}

	@Test
	public void Test2() throws Exception {
		this.navigationMenu.clickAdvancedSearch();
		this.advancedSearchPage.clickDateYear();
		setYear("2015");
		setMonth("09");
		setDay("09");
		this.advancedSearchPage.clickAdvancedSearchButton();
		this.waitPageLoaded();
		Assert.assertTrue(driver.getCurrentUrl().contains("?query=date%3A2015-09-09")
				&& this.navigationMenu.getSearchBarValue().contains("date:2015-09-09"));
		driver.close();
	}

	private void setYear(String year) {
		List<WebElement> dateYearValue = this.advancedSearchPage.getDateYearOption();
		for (int i = 0; i < dateYearValue.size(); i++)
			if (dateYearValue.get(i).getText().contains(year))
				dateYearValue.get(i).click();
	}

	private void setMonth(String month) {
		List<WebElement> dateMonthValue = this.advancedSearchPage.getDateMonthOption();
		for (int i = 0; i < dateMonthValue.size(); i++)
			if (dateMonthValue.get(i).getText().contains(month))
				dateMonthValue.get(i).click();
	}

	private void setDay(String day) {
		List<WebElement> dateDayValue = this.advancedSearchPage.getDateDayOption();
		for (int i = 0; i < dateDayValue.size(); i++)
			if (dateDayValue.get(i).getText().contains(day))
				dateDayValue.get(i).click();
	}
}
