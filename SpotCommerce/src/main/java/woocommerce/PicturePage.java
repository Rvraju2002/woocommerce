package woocommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.ReusbaleCode;

public class PicturePage extends ReusbaleCode {
	
	
	WebDriver Driver;
	 public PicturePage(WebDriver Driver) {
			
			super(Driver);
			this.Driver = Driver;
			PageFactory.initElements(Driver, this);
		}
	 
	 @FindBy(css=".thickbox")
	 WebElement goToPic;
	 
	 @FindBy(id="attachment-details-description")
	 WebElement minidesc;
	 
	 @FindBy(css=".media-toolbar button")
	 WebElement ok;
	 
	 
	 public void goToPicturePage()
	 {
		 JavascriptExecutor js = (JavascriptExecutor) Driver;
			js.executeScript("window.scrollBy(0,500)");
			goToPic.click();
		 
	 }
	 
	
		
		public PriceDesignPage miniProductDescription()
		{
		 JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("document.querySelector('.attachment-info').scrollTop=5000");
		minidesc.sendKeys("A watch is a portable timepiece intended to be carried or worn by a person. ");
		WaitForElementToClickable(ok);
		ok.click();
		PriceDesignPage price = new PriceDesignPage(Driver);
		return new PriceDesignPage(Driver);
	 
		}
		
}
