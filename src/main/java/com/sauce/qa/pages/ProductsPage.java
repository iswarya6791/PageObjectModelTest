package com.sauce.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sauce.qa.base.baseclas;

public class ProductsPage extends baseclas {

	@FindBy(xpath = "(//button[@class=\"btn btn_primary btn_small btn_inventory \"])[1]")
	WebElement addtocartbtn;
	@FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
	WebElement addtocarticon;



	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement ValidateFilterOption() {
		WebElement singledrop = driver.findElement(By.className("product_sort_container"));
		Select slct = new Select(singledrop);
		List<WebElement> options = slct.getOptions();
		for (WebElement op : options) {
			System.out.println(op.getText());
		}

		for (int num = 0; num < 2; num++) {
			slct.selectByIndex(num);
			List<WebElement> description = driver
					.findElements(By.xpath("//div[@data-test=\"inventory-item-description\"]"));

			for (WebElement nv : description) {
				System.out.println(nv.getText());
				System.out.println("###################");

			}

		}
		return singledrop;

	}

	public  AddCartPage ValidateAddtoCart()	{
		addtocartbtn.click();
		addtocarticon.click();
		return new AddCartPage();



}
/*
 * public AddCartPage ValidateAddtoCartIcon() { addtocarticon.click(); return
 * new AddCartPage(); }
 */
}
