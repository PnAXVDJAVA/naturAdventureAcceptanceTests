package clientLogin;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

public class ClientLoginSteps {

	LoginPage loginPage;
	ClientMainPage clientMainPage;
	
	@Step
	public void opens_naturadventure_login_page() {
		loginPage.open();
	}

	@Step
	public void logs_as_client_with_credentials(String username, String password) {
		loginPage.loginWithCredentials( username, password );
	}

	@Step
	public void should_see_at_the_navbar_his_username(String username) {
		Assert.assertEquals( username , clientMainPage.getUsernameNavbarInfo() );
	}

}
