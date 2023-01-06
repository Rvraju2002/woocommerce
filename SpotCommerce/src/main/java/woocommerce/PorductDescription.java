package woocommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.ReusbaleCode;

public class PorductDescription extends ReusbaleCode{
	
	WebDriver Driver;
	 public PorductDescription(WebDriver Driver) {
			
			super(Driver);
			this.Driver = Driver;
			PageFactory.initElements(Driver, this);
		}
	 @FindBy(css=".excerpt")
	 WebElement miniclear;
	 public void ShortDescriptionOfProduct() throws InterruptedException
	 {
		    SwitchToFrame(By.cssSelector("iframe[id='excerpt_ifr']"));
		    miniclear.clear();
		    miniclear.sendKeys(
					"Sapphire is a transparent gemstone known for its deep-blue variety. Sapphire belongs to the corundum family of minerals. Sapphires come in a variety of colors (including completely clear), but if a color is not specified, the word sapphire usually refers to the blue kind.");
		    SwicthToDefaulcontent();
			JavascriptExecutor js = (JavascriptExecutor) Driver;
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(3000);
	 }

}
