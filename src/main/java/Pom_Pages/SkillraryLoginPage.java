package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
         //declarartion
	     
	    //gears
		@FindBy(xpath="//a[.=' GEARS ']")
		private WebElement gearsbtn;
		
		//skillrarydemoapp
		@FindBy(xpath="//a[.=' SkillRary Demo APP'][2]")
		private WebElement skillrarydemoapp;
		
		//searchtextfeild
		@FindBy(xpath="//input[@name ='q']")
		private WebElement searchtf;
		
		//searchbutton
		@FindBy(xpath="//input[@value='go']")
		private WebElement searchbtn;
		
		
		//intialization
		public SkillraryLoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		
		public void gearsbottton() {
			gearsbtn.click();
		}
		
		public void skillrarydemoapp() {
			skillrarydemoapp.click();
		}
		
		public void searchTextFeild(String name) {
			searchbtn.sendKeys(name);
		}
		
		public void searchbutton() {
			searchbtn.click();
		}
		
		
		
		

	

}
