import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zomato_Screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/india");
		TakesScreenshot ts = (TakesScreenshot) driver; //Typecasting
		File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screen-shots/zomato.png");
        FileUtils.copyFile(src, dest);
        driver.close();
	}

}
