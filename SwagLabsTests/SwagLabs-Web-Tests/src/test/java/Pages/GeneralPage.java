package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Core.DriverFactory;

public class GeneralPage {

	WebDriver driver = DriverFactory.getDriver();

	private By btnAddOnesieToCart = By.id("add-to-cart-sauce-labs-onesie");

	private By btnCart = By.id("shopping_cart_container");

	private By txtInventoryItem = By.className("inventory_item_name");

	
	public void clickAddOnesieToCart() {
		driver.findElement(btnAddOnesieToCart).click();
	}
	
	public void clickBtnCart() {
		driver.findElement(btnCart).click();
	}
	public String validateInventoryItem() {
		return driver.findElement(txtInventoryItem).getText();
		
	}

}
