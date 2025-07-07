package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.baseclas;

public class CheckOutPage extends baseclas {
	@FindBy(id = "first-name")
	WebElement firstnamefield;

	@FindBy(id = "last-name")
	WebElement lastnamefield;

	@FindBy(id = "postal-code")
	WebElement postcodefield;

	@FindBy(id = "continue")
	WebElement contnubtn;

	@FindBy(id = "cancel")
	WebElement canclbtn;

	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}

	public OverviewPage ValidateInformation() {
		firstnamefield.sendKeys("Iswarya");
		lastnamefield.sendKeys("Aathvika");
		postcodefield.sendKeys("636008");
		contnubtn.click();
		return new OverviewPage();

	}

	public CheckOutPage ValidateMultipleInformation(String fn, String ln, String zip) {
		firstnamefield.sendKeys(fn);
		lastnamefield.sendKeys(ln);
		postcodefield.sendKeys(zip);
		//contnubtn.click();

		//canclbtn.click();
		return new CheckOutPage();

	}

}
