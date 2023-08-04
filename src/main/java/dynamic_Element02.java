import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_Element02 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.nykaafashion.com/?ptype=homepage");
		driver.findElement(By.xpath("//div[@id='64956986ee511e2f3bd0f03f']")).click();
		List<WebElement> value = driver.findElements(By.xpath("//a[@aria-label='Stylum - Womens Self Woven Kantha Cotton Co-ords Set (set Of 2)']/..//span[@class='css-1ijk06y']"));
		for(WebElement w : value)
		{
			System.out.println(w.getText());
		}
		
		driver.close();
		

	}

}
