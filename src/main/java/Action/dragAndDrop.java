package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		 driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/ J ");
		 driver.findElement(By.xpath(""))
		
	}

}
