package pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_it_yourself_jewelry {
	public Create_it_yourself_jewelry(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="product_attribute_71_10_16")
	private WebElement lengthInCmTextbox;
	public WebElement getLengthInCmTextbox() {
		return lengthInCmTextbox;
	}
	public void setLengthInCmTextbox(WebElement lengthInCmTextbox) {
		this.lengthInCmTextbox = lengthInCmTextbox;
	}
	public void enterLength(String length)
	{
		lengthInCmTextbox.sendKeys(length);
	}
	@FindBy(id = "add-to-cart-button-71")
	private WebElement addToCartbutton;
	public WebElement getAddToCartbutton() {
		return addToCartbutton;
	}
	public void setAddToCartbutton(WebElement addToCartbutton) {
		this.addToCartbutton = addToCartbutton;
	}
	public void clickAddToCartbutton() throws InterruptedException {
		addToCartbutton.click();
		Thread.sleep(7000);
	}
	@FindBy(id = "product_attribute_71_11_17_48")
	private WebElement ladybugCheckbox;
	public WebElement getLadybugCheckbox() {
		return ladybugCheckbox;
	}
	public void setLadybugCheckbox(WebElement ladybugCheckbox) {
		this.ladybugCheckbox = ladybugCheckbox;
	}
	public void clickLadybugCheckbox() {
		ladybugCheckbox.click();
	}

}
