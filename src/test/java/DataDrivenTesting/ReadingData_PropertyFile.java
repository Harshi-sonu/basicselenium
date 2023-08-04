package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_PropertyFile
{
	public static void main(String[] args) throws Throwable
	{
		//an object for properties class
		Properties p=new Properties();
		//an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Properties.data");
		//loading this file
		p.load(fis);
		//reading from the property.data
		String URL = p.getProperty("url"); //url is ready then we need browser
		String userName=p.getProperty("username"); //from property data
		String passWord=p.getProperty("password"); //from property data
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);
		
		
		
		
	}

	

}
