package AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusbaleCode {
	
	WebDriver Driver;
	

	public   ReusbaleCode(WebDriver Driver)
	{
		
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(xpath="//div[normalize-space()='WooCommerce']")
	WebElement Goto;
	
	@FindBy(css="button[class='components-button is-primary']")
	WebElement VariableProduct;
	
	@FindBy(css="li:nth-child(1) div:nth-child(1) div:nth-child(2) span:nth-child(1)")
	WebElement pageofadd;
	
	@FindBy(xpath="//button[@aria-label='Close Tour']//*[name()='svg']")
	WebElement closeTour;
	
	@FindBy(id="title")
	WebElement word;
	
	@FindBy(css="#tinymce")
	WebElement free;
	
	@FindBy(id="publish")
	WebElement publish;
	
	 @FindBy(id="activity-panel-tab-setup")
	 WebElement setup;
	 
	 @FindBy(css="li[class='woocommerce-experimental-list__item has-action transitions-disabled woocommerce-task-list__item index-2 complete'] div[class='components-truncate components-text css-mfbqa6 e19lxcc00']")
	 WebElement bactoWoo;
	 
	 @FindBy(xpath="(//div[@role='menuitem'])[1]")
	 WebElement menuItem;
	
	public void GoToWocommerce() {
		
		Goto.click();
	}
	public void GotoCreationPage()
	{
		VariableProduct.click();
	}
	public void addProductPage()
	{
		pageofadd.click();
	}

	
	public void cancelGuide()
	{
		closeTour.click();
	}
	
	public void clearExistingWord()
	{
		word.clear();
	}
	
	public void SwitchToFrame(By Switch)
	{
		Driver.switchTo().frame(Driver.findElement(Switch));
	}
	
	public void ClearSecondFrame()
	{
		free.clear();
	}
	public  void SwicthToDefaulcontent()
	{
		Driver.switchTo().defaultContent();
	}
	
	public void publishProduct()
	{
		publish.click();
	}
	 public void  BackToProductCreationPage()
	 {
		    setup.click();
		    bactoWoo.click();
					
			WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
			WaitForElementToClickable(menuItem);
			menuItem.click();
	 }
	public void elemenetToBeappear(By FindBy)
	{
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
	}
	public void WaitForElementToClickable(WebElement Clickable)
	{
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(Clickable));
	}
	
	
	
	
	
	
	
	
	
	
}
