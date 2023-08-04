package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestData_Excel {

	private static final String URL = null;

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Test_data_Excel.java"); //to read the data
		Workbook wb=WorkbookFactory.create(fis); //created method to hold fis
		wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);
		String tittle = driver.getTitle();
		
		
		wb.getSheet("sheet1").createRow(5).createCell(0).setCellValue(tittle);
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Test_data_Excel.java"); //to write data
		wb.write(fos);

	}

}
