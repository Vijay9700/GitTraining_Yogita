package pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	public Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "termsofservice")
		private WebElement termsofserviceCheckbox;
	public WebElement getTermsofserviceCheckbox() {
		return termsofserviceCheckbox;
	}
	public void setTermsofserviceCheckbox(WebElement termsofserviceCheckbox) {
		this.termsofserviceCheckbox = termsofserviceCheckbox;
	}
	public void clicktermsofserviceCheckbox()
	{
		termsofserviceCheckbox.click();
	}
	public void clickTermsofserviceCheckbox() {
		termsofserviceCheckbox.click();
	}
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	public void setCheckoutButton(WebElement checkoutButton) {
		this.checkoutButton = checkoutButton;
	}
	public void clickcheckoutButton() {
		checkoutButton.click();
	}

}
