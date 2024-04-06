package swaglabs.navigations;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions{
	//
	@Step("Navigating to SauceDemo Login Page")
	public void toLoginPage() {
		openUrl("https://www.saucedemo.com/v1/index.html");
	}
}
