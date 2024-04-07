package swaglabs.uatests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import swaglabs.actions.AddToCartActions;
import swaglabs.actions.LoginActions;
import swaglabs.actions.NavigateActions;
import swaglabs.pages.CartPage;
import swaglabs.pages.CheckOutPage;
import swaglabs.pages.OrderPage;
import swaglabs.pages.ProductsPage;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenMakingPurchase {
	//
	NavigateActions naviagte;
	LoginActions login;
	
	ProductsPage product;
	CartPage cart;
	OrderPage order;
	CheckOutPage checkout;
	
	
	
	
	@Test
	@ParameterizedTest
	@CsvSource(value= {"Sauce Labs Backpack"})
	public void aSingleItem(String item) {
		//
		naviagte.toLoginPage();
		login.intoSauceDemo();
		
	}

}
