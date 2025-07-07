package com.sauce.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.baseclas;
import com.sauce.qa.pages.AddCartPage;
import com.sauce.qa.pages.CheckOutPage;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.ProductsPage;

public class AddCartPageTest extends baseclas {
	LoginPage loginpge;
	ProductsPage productpge;
	AddCartPage cartpage;
	CheckOutPage chkoutpge;


	public AddCartPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		Initilization();
		loginpge = new LoginPage();
		productpge = loginpge.login(prop.getProperty("username"), prop.getProperty("password"));
		cartpage=productpge.ValidateAddtoCart();

	}

@Test
public void checkoutTest() {
	chkoutpge=cartpage.checkout();

}
}
