package swaglabs.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import swaglabs.navigations.LoginActions;
import swaglabs.navigations.NavigateActions;
import swaglabs.pages.CatalogPage;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest {
	
//	@Steps
	NavigateActions naviagte;
//	@Steps
	CatalogPage catalog;
//	@Steps
	LoginActions login;
	
	
	@Test
	public void loginWithValidCredentials() {
		//
		naviagte.toLoginPage();
		login.intoSauceDemo();
		assertThat(catalog.getHeadingText()).isEqualTo("Products");
	}

}
