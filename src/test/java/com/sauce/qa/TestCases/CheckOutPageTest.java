package com.sauce.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sauce.qa.Util.TestUtil;
import com.sauce.qa.base.baseclas;
import com.sauce.qa.pages.AddCartPage;
import com.sauce.qa.pages.CheckOutPage;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.OverviewPage;
import com.sauce.qa.pages.ProductsPage;

public class CheckOutPageTest extends baseclas{
	LoginPage loginpge;
	ProductsPage productpge;
	AddCartPage cartpage;
	CheckOutPage chkoutpge;
	OverviewPage overviwpge;
	String SheetName="Testdataz";

	public CheckOutPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		Initilization();
		loginpge = new LoginPage();
		productpge = loginpge.login(prop.getProperty("username"), prop.getProperty("password"));
		cartpage=productpge.ValidateAddtoCart();
		chkoutpge=cartpage.checkout();

	}

	/*
	 * @Test public void ValidateInformationTest() {
	 * overviwpge=chkoutpge.ValidateInformation();
	 *
	 * }
	 */
	@DataProvider
	public Object[][] gettestdatafromexcel() throws IOException {

			Object[][] gettestdata = TestUtil.gettestdata(SheetName);
			return gettestdata;

	}

@Test(dataProvider="gettestdatafromexcel")
public void ValidateMultipleInformation(String FirstName, String LastName, String ZipCode) {
	chkoutpge=chkoutpge.ValidateMultipleInformation(FirstName, LastName, ZipCode);

}
}