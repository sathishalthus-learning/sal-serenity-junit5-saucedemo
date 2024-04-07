package swaglabs.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageComponent;

public class OrderFinishPage extends PageComponent{
	//
	public String getOrderStatusMessage() {
		return $(By.tagName("h2")).getText();
	}
}
