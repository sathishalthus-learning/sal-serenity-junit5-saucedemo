package swaglabs.uatests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import swaglabs.actions.LoginActions;
import swaglabs.actions.NavigateActions;
import swaglabs.actions.ProductActions;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenMakingPurchase {
	//
	NavigateActions naviagte;
	LoginActions login;
	ProductActions product;
//	CartActions cart;
//	OrderActions order;
//	
//	FinishPage finish;
//	
	
	
	
	@Test
	@ParameterizedTest
	@CsvSource(value= {"Sauce Labs Backpack"})
	public void aSingleItem(String item) {
		//
		naviagte.toLoginPage();
		login.intoSauceDemo();
		product.addOneItem();
		System.out.println(item);
//		cart.verifyItems(;
//		cart.con
	}

}
