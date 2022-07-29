package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {

	public WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(), 'Audio post')]")public WebElement audio;
	@FindBy(xpath="//div[@class='mejs-button mejs-playpause-button mejs-play']")public WebElement play;
	@FindBy(xpath="//span[@class='mejs-time-current']")public WebElement melodie;



	
	
	public void playb(WebElement element) throws InterruptedException {
		play.click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 200, 0).perform();
		
	}
}


