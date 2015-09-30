package clientLogin;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/ProyectoNaturAdventureWeb/login.html") 
public class LoginPage extends PageObject {

	@FindBy(id="username")
	WebElement usernameTextInput;
	
	@FindBy(id="password")
	WebElement passwordTextInput;
	
	@FindBy(id="loginSubmit")
	WebElement loginSubmit;

	public void loginWithCredentials(String username, String password) {
		usernameTextInput.sendKeys( username );
		passwordTextInput.sendKeys( password );
		loginSubmit.click();
	}
		
}
