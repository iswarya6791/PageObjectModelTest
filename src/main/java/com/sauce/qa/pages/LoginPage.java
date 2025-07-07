package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.baseclas;

public class LoginPage extends baseclas {

	@FindBy(name="user-name")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="login-button")
	WebElement loginbtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateLoginpageTitle() {
		 return driver.getTitle();

	}

	public ProductsPage login(String un, String pswd) {
		username.sendKeys(un);
		password.sendKeys(pswd);
		loginbtn.click();

		return new ProductsPage();
	}

}

