package swaglabs.uatests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import swaglabs.actions.LoginActions;
import swaglabs.actions.NavigateActions;
import swaglabs.pages.ProductsPage;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLogOn {
	
//	@Steps
	NavigateActions naviagte;
//	@Steps
	ProductsPage catalog;
//	@Steps
	LoginActions login;
	
	
	@Test
	public void withValidCredentials() {
		//
		naviagte.toLoginPage();
		login.intoSauceDemo();
		assertThat(catalog.getHeadingText()).isEqualTo("ProductsPage");
	}

}
