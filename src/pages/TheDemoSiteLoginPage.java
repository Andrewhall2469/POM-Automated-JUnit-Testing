package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheDemoSiteLoginPage {

	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]"
			+ "/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"))
	private WebElement usernameBox;
	
	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]"
			+ "/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"))
	private WebElement passwordBox;
	
	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]"
			+ "/table/tbody/tr[3]/td[2]/p/input"))
	private WebElement loginButton;
	
	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"))
	private WebElement failedText;
	
	public void loginUsername(String text) {
		usernameBox.sendKeys(text);
	}
	
	public void loginPassword(String text) {
		passwordBox.sendKeys(text);
	}
	
	public void loginButton() {
		loginButton.click();
	}
}

