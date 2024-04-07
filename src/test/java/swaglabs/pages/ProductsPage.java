package swaglabs.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageComponent;

public class ProductsPage extends PageComponent {
	//
	@Step("Getting Catalog Page Heading")
	public String getHeadingText() {
		return $(".product_label").getText();
	}
}
