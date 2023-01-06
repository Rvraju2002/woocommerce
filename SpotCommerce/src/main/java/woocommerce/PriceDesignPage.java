package woocommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.ReusbaleCode;

public class PriceDesignPage extends ReusbaleCode{

	
	
	WebDriver Driver;
	 public PriceDesignPage(WebDriver Driver) {
			
			super(Driver);
			this.Driver = Driver;
			PageFactory.initElements(Driver, this);
		}
	 @FindBy(css="input[id='_regular_price']")
	 WebElement clearall;
	 
	 @FindBy(css="input[id='_regular_price']")
	 WebElement regular;
	 
	 @FindBy(css="input[id='_sale_price']")
	 WebElement sale;
	 public PorductDescription productPrice()
	 {
		    clearall.clear();
		    regular.sendKeys("4000");
		    sale.sendKeys("2000");
		    PorductDescription ShotDesc = new PorductDescription(Driver);
		    return new PorductDescription(Driver);
	 }
	 
}
