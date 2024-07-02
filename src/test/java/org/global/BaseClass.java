package org.global;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void getDriver(String BrowserType) {
		switch (BrowserType) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			System.err.println("Invalid browserType");
			break;
			
			
		}
		}
	public void getUrl(String Url) {
		driver.get(Url);
		
		
	}
	
	
	public void winMax() {
		driver.manage().window().maximize();
	}
	
	public void sendKeys(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void login(WebElement element ) {
		element.click();
		
			
		}
	public String readExcel(int rownum,int cellnum) throws IOException {
		//To Locate Where the File Is there
		File file = new File("C:\\Users\\deepa\\eclipse-workspace\\DataDriven\\InputFolder\\ADA.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String value=null;
		switch(cellType) {
		case STRING:
			value=cell.getStringCellValue();
			break;
		
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
				value = simple.format(dateCellValue);
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf= BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();
			}
			break;
			
			default:
				break;
				
		}
		
		return value;
		
		
		
	}
	public void refresh(String commends) {
		switch(commends) {
		case "refresh":
			driver.navigate().refresh();
			break;
			
		case "back":
			driver.navigate().refresh();
			break;
		
		case "forward":
			driver.navigate().refresh();
			break;
			
		default:
			System.out.println("Invalid Navigation Commends");
			break;
		}
	}

	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}

	public void click(WebElement element) {
		element.click();
		
	}
	public void selectByValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	
	}
	
	public void selectByIndex(WebElement element,int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	
	}
	public void alert(String alertType) {
		
	
	Alert alert = driver.switchTo().alert();
	switch (alertType) {
	case "Accept":
		alert.accept();
		
		break;
	case "Dismiss":
		alert.dismiss();
		break;

	default:
		System.out.println("Invalid Alert Type");
		break;
	}
	}
	
	
	
	
	

	
	



		
	
	
	

}
