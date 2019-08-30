package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	static WebDriver driver;
	
	public WebDriverWait waiter() {
		WebDriverWait wait = new WebDriverWait(driver, 30, 500);
		//WebDriverWait wait = new WebDriverWait(getWebDriver(), 30, 500);
		return wait;
	}

	public void elementToAppear(By locator) {
		waiter().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void elementToAppear(WebElement element) {
		waiter().until(ExpectedConditions.visibilityOf(element));
	}

	public void elementToAppear(By locator, By locator2) {
		waiter().until(ExpectedConditions.and(ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2)));
	}

	public void elementToAppear(WebElement element, WebElement element2) {
		waiter().until(ExpectedConditions.and(ExpectedConditions.visibilityOf(element),
				ExpectedConditions.visibilityOf(element2)));
	}

	public void elementToAppear(By locator, By locator2, By locator3) {
		waiter().until(ExpectedConditions.and(ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2),
				ExpectedConditions.visibilityOfElementLocated(locator3)));
	}

	public void elementToBeClickable(By locator) {
		waiter().until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void urlToContain(String url) {
		waiter().until(ExpectedConditions.urlContains(url));
	}

	public void urlMatches(String url) {
		waiter().until(ExpectedConditions.urlMatches(url));
	}
	
	public void urlToBe(String url) {
		waiter().until(ExpectedConditions.urlToBe(url));
	}
	
	public void attributeContains(By locator, String attribute, String value) {
		waiter().until(ExpectedConditions.attributeContains(locator, attribute, value));
	}
	
	public void attributeContains(WebElement element, String attribute, String value) {
		waiter().until(ExpectedConditions.attributeContains(element, attribute, value));
	}
	
	public void alertIsPresent() {
		waiter().until(ExpectedConditions.alertIsPresent());
	}
	
	public void attributeToBe(By locator, String attribute, String value) {
		waiter().until(ExpectedConditions.attributeToBe(locator, attribute, value));
	}
	
	public void attributeToBe(WebElement element, String attribute, String value) {
		waiter().until(ExpectedConditions.attributeToBe(element, attribute, value));
	}
	
	
	
	
}
