package homework11;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JSA {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://keybooks.ro/");
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=0)
	public void checkCart() throws InterruptedException {
		driver.get("https://keybooks.ro/shop/life-in-the-garden/");
		

		driver.findElement(By.xpath("//button[contains(text(), 'Add to cart')]")).click();
		Thread.sleep(3000);
		
		String mesaj= driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText();
		assertTrue(mesaj.contains("“Life in the garden” has been added to your cart."));
		Thread.sleep(4000);
				
	}
	@Test(priority=1)
	public void jSAlert() throws InterruptedException {
		//driver.get("https://keybooks.ro/shop/life-in-the-garden/");
		driver.findElement(By.id("tab-title-reviews")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(4000);
		
		Alert pop = driver.switchTo().alert();
		pop.accept();
		Thread.sleep(4000);


	}
	
}
