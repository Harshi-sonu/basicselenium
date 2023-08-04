import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_element01 {

	public static void main(String[] args) 
	{
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	 driver.get("https://www.amazon.in/");
	 List<WebElement> value = driver.findElements(By.xpath("//h2[text()='Up to 70% off | Styles for men']/../..//div[@class='a-section a-spacing-none quadrant-container quadrant-container-0']"));
	 for(WebElement w : value)
		{
			System.out.println(w.getText());
		}
		
	 driver.close();	 
	 

	}

}
