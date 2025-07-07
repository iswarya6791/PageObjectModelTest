package com.sauce.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.baseclas;
import com.sauce.qa.pages.AddCartPage;
import com.sauce.qa.pages.CheckOutPage;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.OrderPlacedPage;
import com.sauce.qa.pages.OverviewPage;
import com.sauce.qa.pages.ProductsPage;

public class OverviewPageTest extends baseclas{


	LoginPage loginpge;
	ProductsPage productpge;
	AddCartPage cartpage;
	CheckOutPage chkoutpge;
	OverviewPage overviwpge;
	OrderPlacedPage orderplacedpge;

	public OverviewPageTest() {
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


	}

@Test
public void ValidateoverviewdetailsTest() {

	orderplacedpge=overviwpge.Validateoverviewdetails();
}



}
