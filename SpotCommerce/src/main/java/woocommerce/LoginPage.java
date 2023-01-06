package woocommerce;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.ReusbaleCode;

public class LoginPage extends ReusbaleCode{
	
	WebDriver Driver;
	
  public LoginPage(WebDriver Driver) {
		
		super(Driver);
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
  
  
  @FindBy(id="user_login")
  WebElement username;
	
  @FindBy(id="user_pass")
  WebElement userPassword;
  
  @FindBy(id="wp-submit")
  WebElement submit;
  
	public void LoginPageOf()
	{
		Driver.get("http://localhost/wordpress/WordpressDesign/wp-login.php");
	}
	public creationPage loginto(String loginid,String password)
	{
		username.sendKeys(loginid);
		userPassword.sendKeys(password);
		submit.click();
		creationPage page = new creationPage(Driver);
		return new creationPage(Driver);
	}

}
