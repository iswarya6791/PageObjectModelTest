package com.sauce.qa.TestCases;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.baseclas;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.ProductsPage;

public class LoginPageTest extends baseclas {
	LoginPage loginpge;
	ProductsPage productpge;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		Initilization();
		loginpge = new LoginPage();

	}

	@Test(priority = 1)
	public void loginpageTitleTest() {
		String title = loginpge.ValidateLoginpageTitle();
		Assert.assertEquals(title, "Swag Labs");

	}
	@Test (priority = 2)
	public void LoginMethod() {
		productpge = loginpge.login(prop.getProperty("username"), prop.getProperty("password"));
		@Nullable
		String title2 = driver.getTitle();
		Assert.assertEquals(title2, "Swag Labs");

	}

	/*
	 * @AfterMethod public void teardown() { driver.quit();
	 *
	 * }
	 */
}
