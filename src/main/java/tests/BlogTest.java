package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class BlogTest extends BaseTest {

	
	@Test
	public void testAudioSlider() throws InterruptedException {
		page.navMenu.hoverMenu(page.navMenu.blogLink);
		page.navMenu.navigateTo(page.navMenu.postFormatsLink);
		page.blogPage.playb(page.blogPage.melodie);
		Thread.sleep(5000);
		page.blogPage.playSonor(page.blogPage.sonor);
	}
}
