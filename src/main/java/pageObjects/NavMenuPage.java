package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavMenuPage {
	
	public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//PageFactory
	//@FindBy este o prescurtare pt driver.findElement(By...)
	@FindBy(xpath="(//a[contains(@class, 'popup_login_link ')])[1]")public WebElement loginLink;
	
	//WebElement loginLink = driver.findElement(By.xpath("(//a[contains(@class, 'popup_login_link ')])[1]"));
	@FindBy(linkText="CONTACTS")public WebElement contactsLink;
	
	public void navigateTo(WebElement element) {
		element.click();
	}
	
}
