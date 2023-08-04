import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_data_Excel {

	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Test_data_Excel.java"); //to read the data
		Workbook wb=WorkbookFactory.create(fis); //created method to hold fis
		wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);
		
		
		wb.getSheet("sheet1").createRow(5).createCell(0).setCellvalue();
		FileOutputStream fos=new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\Test_data_Excel.java"); //to write data
		wb.write(fos);
		
		
		
		
        
	}

}
