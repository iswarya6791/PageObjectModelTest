package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.baseclas;

public class OverviewPage extends baseclas {
	@FindBy(id="finish")
	WebElement Finishbtn;

	public OverviewPage() {
		PageFactory.initElements(driver, this);
	}

	public OrderPlacedPage Validateoverviewdetails() {
		Finishbtn.click();
		return new OrderPlacedPage();

	}

}
