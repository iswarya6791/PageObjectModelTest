package com.sauce.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.baseclas;
import com.sauce.qa.pages.AddCartPage;
import com.sauce.qa.pages.CheckOutPage;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.OrderPlacedPage;
import com.sauce.qa.pages.OverviewPage;
import com.sauce.qa.pages.ProductsPage;

public class OrderPlacedPageTest extends baseclas {

	LoginPage loginpge;
	ProductsPage productpge;
	AddCartPage cartpage;
	CheckOutPage chkoutpge;
	OverviewPage overviwpge;
	OrderPlacedPage orderplacedpge;

	public OrderPlacedPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		Initilization();
		loginpge = new LoginPage();
		productpge = loginpge.login(prop.getProperty("username"), prop.getProperty("password"));
		cartpage=productpge.ValidateAddtoCart();
		chkoutpge=cartpage.checkout();
		overviwpge=chkoutpge.ValidateInformation();
		orderplacedpge=overviwpge.Validateoverviewdetails();


	}

@Test
public void ValidateMessageTest() {
	boolean Message = orderplacedpge.ValidateMessage();
	Assert.assertTrue(Message);



}

}
