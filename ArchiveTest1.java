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
import FinalProject.NavigationMenuHidden;

public class ArchiveTest1 extends Base{

	WebDriver driver;
	private ArchiveMainPage mp;
	private PeoplePage peopleP;
	private JobsPage jp;
	private DonatePage dp;
	private HelpPage hp;
	private ProjectsPage pp;
	private ContactPage cp;
	private AboutPage ap;
	private LoginPage lp;
	private UploadPage up;
	private PageLinks pl;
	private BlogPage bp;
	private NavigationMenu nm;
	private NavigationMenuHidden nmh;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		
		this.nmh = new NavigationMenuHidden(driver);
		this.nm = new NavigationMenu(driver);
		this.bp = new BlogPage(driver);
		this.pl = new PageLinks (driver);
		this.up = new UploadPage(driver);
		this.lp = new LoginPage(driver);
		this.ap = new AboutPage(driver);
		this.cp = new ContactPage(driver);
		this.pp = new ProjectsPage(driver);
		this.hp = new HelpPage(driver);
		this.dp = new DonatePage(driver);
		this.jp = new JobsPage(driver);
		this.peopleP = new PeoplePage(driver);
		this.mp = new ArchiveMainPage(driver);
	}
	
	@Test
	public void Test1() throws Exception{
				
		Thread.sleep(2000);
		List<WebElement> tc = new ArrayList<WebElement>();
		tc = this.mp.getTopCollection();
		Assert.assertTrue(tc.size()>=19);
		driver.close();
	}
		
	@Test
	public void Test2() throws Exception{		
		
		Thread.sleep(2000);
		List<WebElement> tc = new ArrayList<WebElement>();
		tc = this.mp.getTopCollection();
		boolean condition = true;
		for(WebElement i:tc)
			condition = condition && (i.getText().contains(PageURLs.SEARCH_TERM));
		Assert.assertTrue(condition);
		driver.close();
	}
}
