package swaglabs.navigations;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions{
	//
	@Step("Logging into SauceDemo Application")
	public void intoSauceDemo() {
		$("#user-name").sendKeys("standard_user");
		$("#password").sendKeys("secret_sauce");
		$("#login-button").click();
	}
}
