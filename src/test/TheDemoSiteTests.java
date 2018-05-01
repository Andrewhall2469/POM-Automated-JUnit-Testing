package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import pages.TheDemoSiteAddUserPage;
import pages.TheDemoSiteHomepage;
import pages.TheDemoSiteLoginPage;

public class TheDemoSiteTests {
	
	WebDriver driver = null;

	
	@Before
	public void method() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") 
				+ "\\chromedriver.exe");
        driver = new ChromeDriver();
	}
	
	@Test
	public void testDemoSite() throws InterruptedException {
		driver.get("http://thedemosite.co.uk");
//		Thread.sleep(1000);
		TheDemoSiteHomepage homepage = PageFactory.initElements(driver, TheDemoSiteHomepage.class);
		homepage.clickAddLink();
//		Thread.sleep(1000);
		
		TheDemoSiteAddUserPage addPage = PageFactory.initElements(driver, TheDemoSiteAddUserPage.class);
		addPage.addUser("User");
//		Thread.sleep(1000);
		
		addPage.addPassword("Password");
//		Thread.sleep(1000);
		
		addPage.pressSave();
//		Thread.sleep(1000);
		
		TheDemoSiteLoginPage loginPage = PageFactory.initElements(driver, TheDemoSiteLoginPage.class);
		homepage.clickLoginLink();
//		Thread.sleep(1000);
		
		loginPage.loginUsername("User");
//		Thread.sleep(1000);
		
		loginPage.loginPassword("Password");
//		Thread.sleep(1000);
		
		loginPage.loginButton();
//		Thread.sleep(1000);	
	
		String actualText = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).toString();
		Assert.assertNotEquals(actualText, "**Failed Login**");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
