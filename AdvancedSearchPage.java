package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchPage extends Base{

	static WebDriver driver;
	
	public AdvancedSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector("#searchForm"));
	}
	
	private static WebElement dateYear() {
		return driver.findElement(By.cssSelector("div.col-sm-7 [name='date_year']"));
	}
	
	private static WebElement dateMonth() {
		return driver.findElement(By.cssSelector("div.col-sm-7 [name='date_month']"));
	}
	
	private static WebElement dateDay() {
		return driver.findElement(By.cssSelector("div.col-sm-7 [name='date_day']"));
	}
	
	private static WebElement advancedSearchReturning() {
		return driver.findElement(By.cssSelector("#rawform"));
	}
	
	private static List<WebElement> dateYearValue() {
		return driver.findElements(By.cssSelector("div.col-sm-7 [name='date_year'] option"));
	}
	
	private static List<WebElement> dateMonthValue() {
		return driver.findElements(By.cssSelector("div.col-sm-7 [name='date_month'] option"));
	}
	
	private static List<WebElement> dateDayValue() {
		return driver.findElements(By.cssSelector("div.col-sm-7 [name='date_day'] option"));
	}
	
	private static WebElement advancedSearchButton() {
		return driver.findElement(By.cssSelector("center input.btn.btn-primary"));
	}
	
	// Actions
	
	public void clickDateYear() {
		dateYear().click();
	}
	
	public void clickDateMonth() {
		dateMonth().click();
	}
	
	public void clickDateDay() {
		dateDay().click();
	}
	
	public List<WebElement> getDateYearOption() {
		return dateYearValue();
	}
	
	public List<WebElement> getDateMonthOption() {
		return dateMonthValue();
	}
	
	public List<WebElement> getDateDayOption() {
		return dateDayValue();
	}
	
	public void clickAdvancedSearchButton() {
		advancedSearchButton().click();
	}
}
