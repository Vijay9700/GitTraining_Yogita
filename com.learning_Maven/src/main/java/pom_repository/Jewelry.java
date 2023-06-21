package pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelry {
	public Jewelry(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addtocartButton;
	public WebElement getAddtocartButton() {
		return addtocartButton;
	}
	public void setAddtocartButton(WebElement addtocartButton) {
		this.addtocartButton = addtocartButton;
	}
	public void clickAddtocartButton() throws InterruptedException {
		addtocartButton.click();
		Thread.sleep(6000);
	}

}
