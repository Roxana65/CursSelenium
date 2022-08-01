package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ContactTest extends BaseTest {

	@Test(priority=0)
	public void mesajCuSucces() throws InterruptedException {
		page.navMenu.contactsLink.click();
		page.contactPage.sendMessage("ro", "ro@yahoo.com", "aa", "great");
		Thread.sleep(3000);

		String mesajTrimis= driver.findElement(By.xpath("//div[@class='wpcf7-response-output']")).getText();
		assertEquals(mesajTrimis, "Thank you for your message. It has been sent.");
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void emailLipsa() throws InterruptedException {
		page.navMenu.contactsLink.click();
		page.contactPage.sendNoEmail("ro", "aa", "great");
		Thread.sleep(3000);

		String eroareMesaj=driver.findElement(By.xpath("//div[@class='wpcf7-response-output']")).getText();
		assertEquals(eroareMesaj, "One or more fields have an error. Please check and try again.");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void numeLipsa() throws InterruptedException {
		page.navMenu.contactsLink.click();
		page.contactPage.sendNoName("ro@yahoo.com", "aa", "great");
		Thread.sleep(3000);

		String eroareMsj=driver.findElement(By.xpath("//div[@class='wpcf7-response-output']")).getText();
		assertEquals(eroareMsj, "One or more fields have an error. Please check and try again.");
		Thread.sleep(3000);
	}
	
}
