package woocommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.ReusbaleCode;

public class designPage extends ReusbaleCode{

	
	
	WebDriver Driver;
	 public designPage(WebDriver Driver) {
			
			super(Driver);
			this.Driver = Driver;
			PageFactory.initElements(Driver, this);
		}
	 @FindBy(css="input[id=\"title\"]")
	 WebElement headingOfProduct;
	 
	 @FindBy(css="#tinymce")
     WebElement Description;	 
	 public void productTitle(String nameOfProduct)
	 {
		 headingOfProduct.sendKeys(nameOfProduct);
	 }
	 
	 public PicturePage ProductDescription()
	 {
		SwitchToFrame(By.id("content_ifr"));
		ClearSecondFrame();
		 Description.sendKeys("Sapphire crystalSapphire crystal is not actually a type of glass"
		 		+ " – it's pure aluminium oxide that has been through a process of crystallisation.");
		 SwicthToDefaulcontent();
		 PicturePage picture = new PicturePage(Driver);
					return new PicturePage(Driver);
	 }
	 
	 
}
