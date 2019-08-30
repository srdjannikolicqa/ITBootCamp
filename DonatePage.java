package FinalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage extends Base{

	static WebDriver driver;
	
	public DonatePage (WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> amount(){
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel li"));
	}
	
	private static WebElement customAmount() {
		return driver.findElement(By.cssSelector("#amount_custom"));
	}
		
	// Actions
	
	public void clickAmount (Integer i) {
		amount().get(i).click();
	}
	
	public void clickAmount (String amount) {
		for(WebElement i:amount())
			if(i.findElement(By.cssSelector("label span")).getText().toLowerCase().equals(amount.toLowerCase()))
				i.click();
	}
		
	public void enterCustomAmount(Integer i) {
		clickAmount(7);
		amount().get(7).findElement(By.cssSelector("#amount_custom")).sendKeys(i.toString());
	}
	
	
}
