package homework10;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Autor {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://keybooks.ro/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void autor() {
		driver.get("https://keybooks.ro/team/margaret-robins/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[@class='sc_skills_total']")), "95%"));
		
		boolean drama=	driver.findElement(By.xpath("//div[contains(text(),'95%')]")).isDisplayed();		
		boolean bio= driver.findElement(By.xpath("//div[contains(text(), '75%')]")).isDisplayed();
		boolean cook= driver.findElement(By.xpath("//div[contains(text(), '82%')]")).isDisplayed();

		assertTrue(drama);
		assertTrue(bio);
		assertTrue(cook);


		
		
		
	}
	
}
