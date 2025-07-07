package com.sauce.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.baseclas;
import com.sauce.qa.pages.AddCartPage;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.ProductsPage;

public class ProductsPageTest extends baseclas {
	LoginPage loginpge;
	ProductsPage productpge;
	AddCartPage cartpage;

	public ProductsPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		Initilization();
		loginpge = new LoginPage();
		productpge = loginpge.login(prop.getProperty("username"), prop.getProperty("password"));

}
	@Test(priority = 1)
	public void ValidateFilterOptionTest() {
		productpge.ValidateFilterOption();

	}

	@Test(priority = 2)
	public void ValidateAddtoCartTest() {
		cartpage=productpge.ValidateAddtoCart();


	}

}
