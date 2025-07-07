package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.baseclas;

public class OrderPlacedPage extends baseclas{

	@FindBy(xpath="//div[contains(text(),'Your order has been dispatched, and will arrive just as fast as the pony can get there!')]")
	WebElement OrderconfirmedMessage;

	public OrderPlacedPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean ValidateMessage() {
		return  OrderconfirmedMessage.isDisplayed();

	}

}
