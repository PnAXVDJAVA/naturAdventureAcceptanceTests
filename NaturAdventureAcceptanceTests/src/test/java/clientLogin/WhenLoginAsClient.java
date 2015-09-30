package clientLogin;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenLoginAsClient {
	
	private static String username;
	private static String password;
	
	@Managed(driver="chrome", uniqueSession=true)
	WebDriver webDriver;
	
	@Steps
	ClientLoginSteps client;
	
	@BeforeClass
	public static void setUp() {
		setUpWebDriver();
		setUpUsernameCredentials();
	}
	
	public static void setUpWebDriver() {
		System.setProperty( "webdriver.chrome.driver" , "/home/david/Programacion/Web/chromedriver/chromedriver" );
	}
	
	private static void setUpUsernameCredentials() {
		username = "david";
		password = "12345";
	}

	
	@Test
	public void should_see_my_username_at_the_navbar() {
		//GIVEN
		client.opens_naturadventure_login_page();
		//WHEN
		client.logs_as_client_with_credentials( username, password );
		//THEN
		client.should_see_at_the_navbar_his_username( username );
	}
	

}
