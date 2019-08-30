package FinalProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FinalProject.PageURLs;

public class ArchiveTest8 extends Base {

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
	public void setup() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\DELL\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		this.nmh = new NavigationMenuHidden(driver);
		this.nm = new NavigationMenu(driver);
		this.bp = new BlogPage(driver);
		this.pl = new PageLinks(driver);
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
	public void Test1() throws Exception {

		File src = new File("C:\\Users\\DELL\\Desktop\\poi\\ZavrsniFajl.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		this.pl.clickPageLinks("people");
		Thread.sleep(5000);
		List<String> peopleInfo = this.peopleP.getPeopleNamesAndJobs();

		List<String> fromFile = new ArrayList<String>();
		for (int i = 0; i <= sheet.getLastRowNum(); i++)
			fromFile.add(sheet.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		Assert.assertFalse(peopleInfo.equals(fromFile));
		Thread.sleep(5000);
		int emptyRow = sheet.getLastRowNum();
		for (int i = 0; i < peopleInfo.size(); i++) {
			String tmpPeople = peopleInfo.get(i);
			boolean entryExists = false;
			for (int j = 0; j < fromFile.size(); j++)
				if (tmpPeople.equals(fromFile.get(j)))
					entryExists = true;
			if (!entryExists) {
				emptyRow++;
				sheet.createRow(emptyRow).createCell(0).setCellValue(tmpPeople);
			}

		}

		FileOutputStream fout = new FileOutputStream(src);

		wb.write(fout);
		wb.close();
	}

}