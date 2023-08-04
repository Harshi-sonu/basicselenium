package Action;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Context_click {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		 driver.get("https://www.amazon.in/");
	WebElement	search = driver.findElement(By.id("twotabsearchtextbox"));
	Actions a = new Actions(driver);
	a.contextClick(search).perform();
	Thread.sleep(5000);
	driver.close();

	}

}
