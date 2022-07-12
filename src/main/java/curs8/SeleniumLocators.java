package curs8;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocators {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://keybooks.ro/");
	}
	
	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.className("menu_user_login")).click();
		driver.findElement(By.id("log")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys("12345@67890");
		Thread.sleep(2000);
        driver.findElement(By.className("submit_button")).click();
		Thread.sleep(4000);	
		
		WebElement userName = driver.findElement(By.className("user_name"));
		assertTrue(userName.isDisplayed());
						
	    //<span class="user_name">Test User</span>  <> text </>
		
		String userLogat = userName.getText();
		System.out.println(userLogat);
		
		assertEquals(userName.getText(), "Test User");

		//assertTrue(driver.findElement(By.className("user_name")).isDisplayed());
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
