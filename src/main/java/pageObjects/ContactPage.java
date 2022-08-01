package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(tagName="iframe") public WebElement iframe;
	@FindBy(xpath="//button[@title='Zoom in']") public WebElement zoomIn;
	@FindBy(xpath="//button[@title='Zoom out']") public WebElement zoomOut;
	@FindBy(partialLinkText="map") public WebElement clickOutSideMap;
	
	@FindBy(xpath="//input[@name='your-name']")public WebElement nameField;
	@FindBy(xpath="//input[@name='your-email']")public WebElement emailField;
	@FindBy(xpath="//input[@name='your-s']")public WebElement subjectField;
	@FindBy(xpath="//textarea[@name='your-message']")public WebElement messageField;
	@FindBy(xpath="//input[@value='Send Message']")public WebElement sMButton;

	
	
	public void zoomMap (WebElement element) {
		driver.switchTo().frame(iframe);
		element.click();
	}
	public void OpenMapInNewTab() {
		clickOutSideMap.click();
	}
	
	public void sendMessage(String name, String email, String subject, String message) throws InterruptedException {
		nameField.sendKeys(name);
		emailField.sendKeys(email);
		subjectField.sendKeys(subject);
		messageField.sendKeys(message);
		Thread.sleep(2000);
		sMButton.click();
		Thread.sleep(3000);
	}
	public void sendNoEmail(String name,String subject, String message) throws InterruptedException {
		nameField.sendKeys(name);
		subjectField.sendKeys(subject);
		messageField.sendKeys(message);
		Thread.sleep(2000);
		sMButton.click();
		Thread.sleep(3000);
	}
	public void sendNoName(String email, String subject, String message) throws InterruptedException {
		emailField.sendKeys(email);
		subjectField.sendKeys(subject);
		messageField.sendKeys(message);
		Thread.sleep(2000);
		sMButton.click();
		Thread.sleep(3000);
	}
}
