package woocommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.ReusbaleCode;

public class creationPage extends ReusbaleCode{

	WebDriver Driver;
	 public creationPage(WebDriver Driver) {
			
			super(Driver);
			this.Driver = Driver;
			PageFactory.initElements(Driver, this);
		}
	
	 public  void createProductName()
	 {
	
		 String[] createProductName = {"ShapphireWatch","Swagger sent","Addidas Shoe","Sunglass"};
		
	 }
	 public designPage waitCancelguide()
	 {
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'])[3]")));
		 designPage Design = new designPage(Driver);
		 return new designPage(Driver);
	 }
	 
	 

	
	 
	 
	 
	 
}
