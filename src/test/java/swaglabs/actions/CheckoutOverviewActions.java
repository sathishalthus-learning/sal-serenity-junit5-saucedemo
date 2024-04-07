	package swaglabs.actions;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class CheckoutOverviewActions extends UIInteractions{
	//
	@Step("Fill out Address")
	public void calculateOrderAndFinish() {
		$(By.linkText("FINISH")).click();
	}
}