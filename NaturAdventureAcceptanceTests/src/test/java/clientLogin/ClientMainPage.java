package clientLogin;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ClientMainPage extends PageObject {

	@FindBy(id="usernameInfo")
	WebElement usernameInfo;
	
	public String getUsernameNavbarInfo() {
		return usernameInfo.getText();
	}
	
}
