package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TheDemoSiteHomepage {

	@FindBy(partialLinkText = ("3. Add a User"))
	private WebElement addUserLink;
	
	@FindBy(partialLinkText = ("4. Login"))
	private WebElement loginLink;
	
	public void clickAddLink() {
		addUserLink.click();
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	
}
