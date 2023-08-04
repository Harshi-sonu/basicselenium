package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage
     {
	
     @FindBy(xpath="//a[@id='course']")
     private WebElement coursetab;
     
     
     @FindBy(name="addresstype")
     private WebElement selectcategorydd;
     
     @FindBy(xpath="//a[.='Selenium Training']")
     private WebElement seleniumtraingbtn;
     
     //intialization
     
     public SkillraryDemoLoginPage(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
     }
     
     //utilization
     
     public WebElement getCoursetab() {
    	 return coursetab;
    	 
     }
     
     
     public WebElement getSelectCategorydd() {
    	 return selectcategorydd;
    	 
     }
     
     public void seleniumTraingbtn() {
    	 seleniumtraingbtn.click();
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     }
      

