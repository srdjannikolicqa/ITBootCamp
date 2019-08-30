package FinalProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FinalProject.PageURLs;
import FinalProject.NavigationMenuHidden;

public class ArchiveTest extends Base{

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	
	@Test
	public void Test1() throws Exception{
		
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		
		NavigationMenuHidden nmh = new NavigationMenuHidden(driver);
		NavigationMenu nm = new NavigationMenu(driver);
		BlogPage bp = new BlogPage(driver);
		PageLinks pl = new PageLinks (driver);
		UploadPage up = new UploadPage(driver);
		LoginPage lp = new LoginPage(driver);
		AboutPage ap = new AboutPage(driver);
		ContactPage cp = new ContactPage(driver);
		ProjectsPage pp = new ProjectsPage(driver);
		HelpPage hp = new HelpPage(driver);
		DonatePage dp = new DonatePage(driver);
		JobsPage jp = new JobsPage(driver);
		PeoplePage peopleP = new PeoplePage(driver);
		
//		nmh.clickHiddenMenuIcons(2);
//		Thread.sleep(1000);
//		nmh.clickHiddenMenuIcons(1);
//		Thread.sleep(1000);
//		nmh.clickHiddenMenuIcons(0);
//		Thread.sleep(1000);
		
		
		Thread.sleep(2000);
//		pl.clickPageLinks(2);
//		Thread.sleep(3000);
//		bp.clickArchivesDropdown();
//		Thread.sleep(1000);
//		bp.clickArchivesDropdownValues(162);
//		Thread.sleep(1000);
		
//		bp.sendTextToSearch("logic");
//		Thread.sleep(1000);
//		bp.clickSearchButton();
//		Thread.sleep(3000);
//		bp.clickPosts(2);
//		Thread.sleep(3000);
		
		
		// Here all begin...
		// Method to send Search term in hidden Search field
			// Action method to simulate Enter
		
//		nm.clickHiddenMenuIcons(1);
//		nm.clickHiddenMenuIcons(0);
//		Thread.sleep(1000);
//		nmh.sendTextToSearch_Action(PageURLs.SEARCH_TERM);
//		Thread.sleep(1000);
		
			// ...without Action method
		
//		nm.clickHiddenMenuIcons(1);
//		nm.clickHiddenMenuIcons(0);
//		Thread.sleep(1000);
//		nmh.sendTextToSearch(PageURLs.SEARCH_TERM);
//		Thread.sleep(4000);
		
		
		// Action to click on 2 round icons
			// Click using item index
		
//		nm.clickHiddenMenuIcons(1);
//		nmh.clickHiddenMenuRoundIcons(2);
//		Thread.sleep(1000);
		
			// ...using (menu, side)
		
//		nm.clickHiddenMenuIcons(2);
//		nmh.clickHiddenMenuRoundIcons("Video", "right");
//		Thread.sleep(1000);
		
			// ...using (name of the round icon )
		
//		nm.clickLogo();
//		Thread.sleep(3000);
//		nm.clickHiddenMenuIcons(2);
//		nmh.clickHiddenMenuRoundIcons("TV News");
//		Thread.sleep(1000);
		
		// Click elements in list using index
		
//		nm.clickLogo();
//		Thread.sleep(3000);
//		nmh.clickHiddenMenuElementsList(77);
//		Thread.sleep(1000);
		
			// ...using names
		
//		nm.clickLogo();
//		Thread.sleep(3000);
//		nmh.clickHiddenMenuElementsList("cover art");
//		Thread.sleep(1000);
		
		// Click any element from navigation menu using index
		
//		nmh.clickHiddenMenuIcons(2);
//		Thread.sleep(3000);
		
			// ...using names
		
//		nmh.clickHiddenMenuIcons(2);
//		nmh.clickHiddenMenuIcons("Video");
//		Thread.sleep(3000);
		
		// Click on Logo
		
//		nm.clickLogo();
//		Thread.sleep(3000);
		
		// Click on Upload
		
//		nm.clickUpload();
//		Thread.sleep(3000);
		
		// Click on Sign Up[user not logged in]
		
//		nm.clickSignIn();
//		Thread.sleep(1000);
//		lp.clickSignUp();
//		Thread.sleep(3000);
		
		// Click on Logged Username[user logged in]
		
//		nm.clickLoggedUsername();
//		Thread.sleep(3000);
		
		// Click on Search Bar [at Upload button - hidden on Home Page]
		
//		nm.clickSearchBar();
//		Thread.sleep(3000);
		
		// Send SEARCH_TERM u Search Bar [at Upload button - hidden on Home Page]
				
//		nm.sendTextToSearchBar(PageURLs.SEARCH_TERM);
//		Thread.sleep(3000);
		
		// Signing in
		
//		nm.autoSignIn();
		
		// Count number of News elements on About page
			// ...using index to call About link
		
//		pl.clickPageLinks(0);
//		Thread.sleep(1000);
//		Integer numberOfNewsElements = ap.numberOfElementsInNews();
		
			// ...using name to call About link - not case sensitive
		
//		pl.clickPageLinks("about");
//		Thread.sleep(1000);
//		Integer numberOfNewsElements = ap.numberOfElementsInNews();
//		System.out.println(numberOfNewsElements);
		
		// Click More on About Page right of News Header
		
//		pl.clickPageLinks("about");
//		Thread.sleep(1000);
//		ap.clickMore();
		
		// Click on Map picture on Contact Page using index
		
//		pl.clickPageLinks("contact");
//		Thread.sleep(1000);
//		cp.clickMaps(0);
		
		// Click on FB icon - using index
		
//		pl.clickPageLinks("blog");
//		Thread.sleep(1000);
//		bp.clickSocialNetwork(0);
		
		// Click on Tweeter icon - using index
		
//		pl.clickPageLinks("blog");
//		Thread.sleep(1000);
//		bp.clickSocialNetwork(1);
		
		// Send keys to Search Bar on Blog page
		
//		pl.clickPageLinks("blog");
//		Thread.sleep(1000);
//		bp.sendTextToSearch(PageURLs.SEARCH_TERM);
//		bp.clickSearchButton();
		
		// Manipulate with Archives dropdown menu - plain
		
//		pl.clickPageLinks("blog");
//		Thread.sleep(1000);
//		bp.clickArchivesDropdown();
//		bp.clickArchivesDropdownValues(2);
		
			// ...using Select - by index
		
//		pl.clickPageLinks("blog");
//		Thread.sleep(1000);
//		bp.clickArchivesDropdown();
//		bp.clickArchivesDropdownValues_Select(7);

			// ...using Select - by visible text - !!Case sensitive!!
		
//		pl.clickPageLinks("blog");
//		Thread.sleep(1000);
//		bp.clickArchivesDropdown();
//		bp.clickArchivesDropdownValues_Select("October 2018");
		
		// Count the number of Project elements on Projects page
		
//		pl.clickPageLinks("projects");
//		Thread.sleep(1000);
//		pp.countProjects();
		
		// Click on Buttons on Help Page - using index
		
//		pl.clickPageLinks("help");
//		Thread.sleep(1000);
//		hp.clickButtons(2);
		
			// ...using button name - not case sensitive
		
//		pl.clickPageLinks("help");
//		Thread.sleep(1000);
//		hp.clickButtons("donations");
		
		// Send keys to search bar on Help page - without using Actions for simulating Enter key
		
//		pl.clickPageLinks("help");
//		Thread.sleep(1000);
//		hp.sendTextToSearchBar(PageURLs.SEARCH_TERM);
		
			// ...using Actions to simulate Enter key
		
//		pl.clickPageLinks("help");
//		Thread.sleep(1000);
//		hp.sendTextToSearchBar_Action(PageURLs.SEARCH_TERM);
		
		// Click on Sign in on Help page
		
//		pl.clickPageLinks("help");
//		Thread.sleep(1000);
//		hp.clickSignIn();
		
		// Click on Amount on Donate page - using index
		
//		pl.clickPageLinks("donate");
//		Thread.sleep(1000);
//		dp.clickAmount(3);
		
			// ...using value text [ie. $5, $10, $50, ...]
		
//		pl.clickPageLinks("donate");
//		Thread.sleep(1000);
//		dp.clickAmount("$500");
		
		// Enter custom amount on Donate Page
		
//		pl.clickPageLinks("donate");
//		Thread.sleep(1000);
//		dp.enterCustomAmount(777);
		
		// Count the number of jobs found on Jobs page - using iFrames
		
//		pl.clickPageLinks("jobs");
//		Thread.sleep(1000);
//		jp.sendTextToSearch("administration");
//		jp.clickSearchButton();
//		Integer numberOfJobsFound = jp.numberOfJobsFound();
//		System.out.println(numberOfJobsFound);
		
		// Send text to Search bar on Jobs page - using iFrames
			// ...click on Search Button
		
//		pl.clickPageLinks("jobs");
//		Thread.sleep(1000);
//		jp.sendTextToSearch("QA");
//		jp.clickSearchButton();
		
		// Extract List containing "Name, Surname, Position" as a single String from jobs Search results on Jobs Page
		
		pl.clickPageLinks("people");
		Thread.sleep(6000);
		List<String> peopleBasicInfo = peopleP.getPeopleNamesAndJobs();
		
		
	}
	
}
