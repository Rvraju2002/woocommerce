package woocommerce;



import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class SumbitOrder {

	@Test
	public void EndToEnd() throws InterruptedException {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] productName = { "ShapphireWatch", "Sunglass" };
		Driver.get("http://localhost/wordpress/WordpressDesign/shop/");
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,200)");
		List<WebElement> add = Driver.findElements(By.tagName("h2"));

		int k = 0;
		for (int i = 0; i < add.size(); i++) {

			String vicky = add.get(i).getText();

			List<String> b = Arrays.asList(productName);

			if (b.contains(vicky)) {
				k++;
				Thread.sleep(2000);

				Driver.findElements(By.linkText("Add to cart")).get(i).click();
				if (k == productName.length)
					break;

			}

		}
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		Driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,600)");

		Driver.findElement(By.cssSelector(".wc-proceed-to-checkout a")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(1000);
		Driver.findElement(By.id("billing_first_name")).sendKeys("vicky");
		Driver.findElement(By.id("billing_last_name")).sendKeys("raju");
		Driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("no 2 east street virudhunagar");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Driver.findElement(By.id("billing_city")).sendKeys("Virudhunagar");
		Driver.findElement(By.id("billing_postcode")).sendKeys("626002");
		Driver.findElement(By.id("place_order")).click();
		Driver.close();

	}

}
