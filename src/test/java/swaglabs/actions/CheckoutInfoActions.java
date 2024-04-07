package swaglabs.actions;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class CheckoutInfoActions extends UIInteractions{
	//
	@Step("Fill out Address")
	public void fillAddressAndContinueCheckout() {
		$("#first-name").sendKeys("Sathish");
		$("#last-name").sendKeys("Johnson");
		$("#postal-code").sendKeys("123456");
		$(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
	}
}