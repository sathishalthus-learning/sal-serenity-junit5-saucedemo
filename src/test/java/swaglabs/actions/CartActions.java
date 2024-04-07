package swaglabs.actions;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class CartActions extends UIInteractions{
	//
	@Step("Continue Shopping")
	public void continueShopping() {
		$(By.linkText("CONTINUE SHOPPING")).click();
	}
	
	@Step("Checkout Shopping")
	public void checkoutWithCart() {
		$(By.linkText("CHECKOUT")).click();
	}
}
