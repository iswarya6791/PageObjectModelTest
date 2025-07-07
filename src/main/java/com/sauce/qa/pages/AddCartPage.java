package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.baseclas;

public class AddCartPage extends baseclas {
	@FindBy(id="checkout")
	WebElement chkoutbtn;

	public AddCartPage() {
		PageFactory.initElements(driver, this);
	}

	public CheckOutPage checkout() {
		chkoutbtn.click();
		return new CheckOutPage();

	}

}
