package swaglabs.actions;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class AddToCartActions extends UIInteractions{
	//
	@Step("Adding Item to Cart")
	public void addItemtoCart() {
		$(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	}
	
	@Step("Switch to View Cart")
	public void switchToCart() {
		$(".shopping_cart_link").click();
	}
}
