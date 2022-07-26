package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FileUploadTest extends BaseTest {

	@Test
	public void fileUpload() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Roxana Giurgiu\\eclipse-workspace\\CursSelenium\\testFile");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		
		String actualText= driver.findElement(By.id("uploaded-files")).getText();
		assertEquals(actualText, "test0File");
		Thread.sleep(3000);
	}
}
