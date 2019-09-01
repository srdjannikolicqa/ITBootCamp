package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu extends Base {

	static WebDriver driver;

	public NavigationMenu(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> hiddenMenuIcons() {
		return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left"));
	}

	private static WebElement logo() {
		return driver.findElement(By.cssSelector("span.iconochive-logo"));
	}

	private static WebElement signIn() {
		return driver.findElement(By.cssSelector("span.iconochive-person"));
	}

	private static WebElement loggedUsername() {
		return driver.findElement(By.cssSelector("#user-menu span.hidden-xs-span"));
	}

	private static WebElement upload() {
		return driver.findElement(By.cssSelector("span.iconochive-upload"));
	}

	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("#search-bar-2"));
	}

	private static List<WebElement> searchBarSubOptions() {
		return driver.findElements(By.cssSelector("#navbar_search_options input"));
	}

	private static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}

	// Actions

	public String getSearchBarValue() {
		return searchBar().getAttribute("value");
	}

	public boolean isAdvancedSearch() {
		return advancedSearch().isDisplayed();
	}

	public void clickHiddenMenuIcons(Integer i) {
		if (driver.findElement(By.cssSelector("li.dropdown.dropdown-ia.pull-left.hatted"))
				.equals(hiddenMenuIcons().get(i))) {
		} else
			hiddenMenuIcons().get(i).findElement(By.cssSelector("a")).click();
	}

	public void clickLogo() {
		logo().click();
	}

	public void clickSignIn() {
		signIn().click();
	}

	public void autoSignIn() throws Exception {
		this.clickSignIn();
		Thread.sleep(1000);
		new LoginPage(driver).sendTextToEmail(PageURLs.EMAIL);
		new LoginPage(driver).sendTextToPassword(PageURLs.PASSWORD);
		new LoginPage(driver).clickLoginButton();
		Thread.sleep(3000);
	}

	public void clickLoggedUsername() throws Exception {
		if (signIn().isDisplayed())
			autoSignIn();
		loggedUsername().click();
	}

	public void clickUpload() {
		upload().click();
	}

	public void clickSearchBar() throws Exception {
		if (driver.getCurrentUrl().equals(PageURLs.ARCHIVE_MAIN_PAGE))
			new PageLinks(driver).clickPageLinks(0);
		this.elementToBeClickable(searchBar());
//		Thread.sleep(1000);
		searchBar().click();
	}

	public void sendTextToSearchBar(String searchTerm) throws Exception {
		this.clickSearchBar();
		searchBar().sendKeys(searchTerm, Keys.ENTER);
	}

	public void selectSearchBarSubOptions(Integer i) throws Exception {
		this.clickSearchBar();
		searchBarSubOptions().get(i).click();
	}

	public void clickAdvancedSearch() throws Exception {
		this.clickSearchBar();
		advancedSearch().click();
	}
}
