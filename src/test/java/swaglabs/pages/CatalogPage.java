package swaglabs.pages;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageComponent;

public class CatalogPage extends PageComponent{
	//
	@Step("Getting Catalog Page Heading")
	public String getHeadingText() {
		return $(By.tagName("h6")).getText();
	}
}
