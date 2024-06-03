package hashmap;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excel_fileread {

	ChromeDriver driver;
    @BeforeMethod
    public void prestep() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
        driver.switchTo().frame("iframeResult");
    }

//    @AfterMethod
//    public void poststep() {
//        driver.quit();
//    }
	
	public  static String[][] xlsheet() throws IOException{
		
		//C:\Users\RavishankarN\eclips_respace\Java_takehome
		
		String filePath = "C:/Users/RavishankarN/eclips_respace/Java_takehome/Book1.xlsx";
		XSSFWorkbook wb= new XSSFWorkbook(filePath);
		
		int numberOfSheets = wb.getNumberOfSheets();
        System.out.println("Number of sheets: " + numberOfSheets);
		
		XSSFSheet sheetAt = wb.getSheetAt(0);
		int rowcount = sheetAt.getLastRowNum();
		int cellcount = sheetAt.getRow(1).getLastCellNum();
		
		System.out.println(cellcount);
		
		String[][] data= new String[rowcount][cellcount];
				
		for (int i = 1; i <= rowcount; i++) {
			
			for (int j = 0; j < cellcount; j++) {
				
				String stringCellValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(stringCellValue);
				
				data[i-1][j]=stringCellValue;
			}
			
		}
		wb.close();
		return data;
	}
	
	@DataProvider(name="getdata")
	public String[][] dataprovider() throws IOException{
		return xlsheet();
	}
	
	@Test(dataProvider ="getdata")
	public void createlead(String email){
	driver.findElement(By.id("email")).sendKeys(email);
		
	}
}
