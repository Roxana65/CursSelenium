package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class LoginTest extends BaseTest {

	@Test(priority=0)
	public void validLogin() throws InterruptedException {
		
		page.navMenu.navigateTo(page.navMenu.loginLink);
		page.loginPage.loginInApp("TestUser", "12345@67890");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.loginPage.succesLoginMessage));
		
		assertTrue(page.loginPage.errorLoginMessage.isDisplayed());
		page.loginPage.logoutFromApp();

	}
	@Test(priority=1)
	public void invalidTest() {
		page.navMenu.navigateTo(page.navMenu.loginLink);
		page.loginPage.loginInApp("Test12U", "1281298799");
		assertTrue(page.loginPage.errorLoginMessage.isDisplayed());
		
        //BaseTest -> creaza obiectul de tip base page --< page
		//	BasePage -> iti creaza obiectele de tip pageObject --> naveMenu, loginPage etc
		//	NavMenuPage, LoginPage--> creaza WebElement si metode specifice acelei pagini
			
		//	@Test --mosteneste BaseTest --> deci are acces la obiectul page --> BasePage
			
			//page.loginPage.loginInApp(null, null);
	}
}
