package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TheDemoSiteAddUserPage {
	
	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]"
			+ "/div/center/table/tbody/tr[1]/td[2]/p/input"))
	private WebElement addUserBox;
	
	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]"
			+ "/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"))
	private WebElement addPasswordBox;
	
	@FindBy(xpath = ("/html/body/table/tbody/tr/td[1]"
			+ "/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"))
	private WebElement saveButton;
	
	
	public void addUser(String text) {
		addUserBox.sendKeys(text);
	}
	
	public void addPassword(String text) {
		addPasswordBox.sendKeys(text);
	}
	
	public void pressSave() {
		saveButton.click();
	}

}
