package homework11;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SAutor {


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
	
	public void selectAutor() {

		WebElement dropdown = driver.findElement(By.xpath(""));
		Select lista = new Select(dropdown);
		lista.selectByVisibleText("");
		boolean procent=	driver.findElement(By.xpath("//div[contains(text(),'95%')]")).isDisplayed();
		assertTrue(procent);

	}

}
