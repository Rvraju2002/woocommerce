package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import woocommerce.LoginPage;



public class parentClass {

	public WebDriver Driver;
   public LoginPage loginpage;
	public WebDriver  initailizeDriver() throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("D:\\learn selenium\\code selenium\\SpotCommerce\\src\\main\\java\\world\\Golbal.properties");
	prop.load(fis);
	
	 String browserName = System.getProperty("browser")!=null ? System.getProperty("browser"):prop.getProperty("browser");
     prop.getProperty("browser");
     
     
	
     if(browserName.contains("chrome"))
     {
		ChromeOptions options = new  ChromeOptions();
		if(browserName.contains("headless")) {
		 
		 options.addArguments("headless");
		}
		
		 Driver = new ChromeDriver(options);
		 Driver.manage().window().setSize(new Dimension(1449,900));
     }
	else if(browserName.contains("firefox"))
     
	{
	     Driver = new FirefoxDriver();
		
	}
	else if(browserName.contains("edge"))
	{
	    Driver = new EdgeDriver();
		
	}
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Driver.manage().deleteAllCookies();
	return Driver;
	
	}
	@BeforeMethod(alwaysRun = true )
	public LoginPage LaunchApplication() throws IOException {
		Driver = initailizeDriver();
	    loginpage = new LoginPage(Driver);
	    loginpage.LoginPageOf();
		return loginpage;
	}
	
	
}
