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
	private PeoplePage peoplePage;
	private PageLinks pageLinks;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dweomer\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(PageURLs.ARCHIVE_MAIN_PAGE);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		this.pageLinks = new PageLinks(driver);
		this.peoplePage = new PeoplePage(driver);
	}

	@Test
	public void Test1() throws Exception {
		File src = new File("C:\\Users\\dweomer\\Desktop\\poi\\ZavrsniFajl.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		this.pageLinks.clickPageLinks("people");
		List<String> peopleInfo = this.peoplePage.getPeopleNamesAndJobs();
		List<String> fromFile = getItemsFromFile(sheet);
		Assert.assertFalse(peopleInfo.equals(fromFile));
		writeDistinctEntriesFromListToFile(sheet, fromFile, peopleInfo);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		driver.close();
	}

	public List<String> getItemsFromFile(XSSFSheet sheet) {
		List<String> tmp = new ArrayList<String>();
		for (int i = 0; i <= sheet.getLastRowNum(); i++)
			tmp.add(sheet.getRow(i).getCell(0).getStringCellValue());
		return tmp;
	}

	public void writeDistinctEntriesFromListToFile(XSSFSheet sheet, List<String> fromFile, List<String> peopleInfo) {
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
	}
}