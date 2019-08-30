package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NavigationMenuHidden extends Base {

	static WebDriver driver;

	public NavigationMenuHidden(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> hiddenMenuIcons() {
		return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left"));
	}

	private static WebElement search() {
		return driver.findElement(By.cssSelector("#nav-wb-url"));
	}

	private static List<WebElement> hiddenMenuRoundIcons() {
		return driver.findElements(By.cssSelector("div.widgets"));
	}

	private static List<WebElement> hiddenMenuElementsList() {
		return driver.findElements(By.cssSelector("div.linx a"));
	}

	// Actions

	public void clickHiddenMenuIcons(Integer i) {
		if (driver.findElement(By.cssSelector("li.dropdown.dropdown-ia.pull-left.hatted"))
				.equals(hiddenMenuIcons().get(i))) {
		} else
			hiddenMenuIcons().get(i).findElement(By.cssSelector("a")).click();
	}

	// menu = [Texts, Video, Audio, Software, Image] not case sensitive
	public void clickHiddenMenuIcons(String menu) {
		if (driver.findElement(By.cssSelector("li.dropdown.dropdown-ia.pull-left.hatted a")).getAttribute("data-original-title").toLowerCase()
				.contains(menu.toLowerCase())) {
		} else 
			for (WebElement i : hiddenMenuIcons())
				if (i.findElement(By.cssSelector("a")).getAttribute("data-original-title").toLowerCase().contains(menu.toLowerCase()))
					i.findElement(By.cssSelector("a")).click();
	}

	public void sendTextToSearch(String searchTerm) {
		search().sendKeys(searchTerm, Keys.ENTER);
	}

	public void sendTextToSearch_Action(String searchTerm) {
		Actions builder = new Actions(driver);
		Action enterTextToSearchField = builder
				.moveToElement(search())
				.click()
				.sendKeys(searchTerm)
				.sendKeys(Keys.ENTER)
				.build();
		enterTextToSearchField.perform();
	}

	public void clickHiddenMenuRoundIcons(Integer i) {
		hiddenMenuRoundIcons().get(i).findElement(By.cssSelector("div.items_list_img a")).click();
	}

	// menu = [Texts, Video, Audio, Software, Image] side = [left, right] / [l, r]
	// not case sensitive
	public void clickHiddenMenuRoundIcons(String menu, String side) {
		int index = 0;
		String menuItems[] = { "Texts", "Video", "Audio", "Software", "Image" };
		for (int i = 0; i < 5; i++)
			if (menuItems[i].toLowerCase().equals(menu.toLowerCase()))
				index = i * 2;
		if (side.toLowerCase() == "right" || side.toLowerCase() == "r")
			index++;
		hiddenMenuRoundIcons().get(index).findElement(By.cssSelector("div.items_list_img a")).click();
	}

	// name = icon name (ie. Books to borrow, TV news,...) not case sensitive
	public void clickHiddenMenuRoundIcons(String name) {
		for (WebElement i : hiddenMenuRoundIcons())
			if (i.getText().toLowerCase().equals(name.toLowerCase()))
				i.click();
	}

	// using index
	public void clickHiddenMenuElementsList(Integer i) {
//		for (WebElement tmp : hiddenMenuIcons()) {
//			tmp.findElement(By.cssSelector("a")).click();
//			if (hiddenMenuElementsList().get(i).isDisplayed())
				hiddenMenuElementsList().get(i).click();
//		}
	}

	// using name (ie. Genealogy, Movies, Cover Art, ...) not case sensitive
	public void clickHiddenMenuElementsList(String name) {
		WebElement tmpElement = hiddenMenuElementsList().get(0);
		for (WebElement tmp : hiddenMenuElementsList())
			if (tmp.getAttribute("title").toLowerCase().equals(name.toLowerCase()))
				tmpElement = tmp;
		for (WebElement tmp : hiddenMenuIcons()) {
			tmp.findElement(By.cssSelector("a")).click();
			if (tmpElement.isDisplayed())
				tmpElement.click();
		}
	}

}
