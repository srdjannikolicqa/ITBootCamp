package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage extends Base{

	static WebDriver driver;
	
	public JobsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement search() {
		return driver.findElement(By.cssSelector("#q"));
	}
	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("#btn_search_jobs"));
	}
	
	private static WebElement advanced() {
		return driver.findElement(By.cssSelector("#link_show_advanced_search"));
	}
	
	private static List<WebElement> jobs(){
		return driver.findElements(By.cssSelector("[id^='row_job_']"));
	}
	
	// Actions
	
	public void sendTextToSearch(String searchTerm) throws Exception{
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.resumator-advanced-widget")));
		search().sendKeys(searchTerm);
		driver.switchTo().parentFrame();
	}
	
	public void clickSearchButton() {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.resumator-advanced-widget")));
		searchButton().click();
		driver.switchTo().parentFrame();
	}
	
	public void clickAdvanced() {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.resumator-advanced-widget")));
		advanced().click();
		driver.switchTo().parentFrame();
	}
	
	public void clickJobs(Integer i) {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.resumator-advanced-widget")));
		jobs().get(i).findElement(By.cssSelector("td a")).click();
		driver.switchTo().parentFrame();
	}
	
	public Integer numberOfJobsFound() {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.resumator-advanced-widget")));
		Integer tmpSize = jobs().size();
		driver.switchTo().parentFrame();
		return tmpSize;
	}
	
}
