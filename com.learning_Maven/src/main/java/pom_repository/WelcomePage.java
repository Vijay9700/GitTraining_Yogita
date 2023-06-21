package pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.Base_Test;

public class WelcomePage extends Base_Test {
	public WelcomePage(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);	
	}
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}
	public void clickRegister() {
		registerLink.click();
	}
	
	@FindBy(partialLinkText = "Log")
	private WebElement loginLink;
	public WebElement getLoginLink() {
		return loginLink;
	}
	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}
	public void clickLogin() {
		loginLink.click();
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	public void setShoppingCartLink(WebElement shoppingCartLink) {
		this.shoppingCartLink = shoppingCartLink;
	}
	public void clickShoppingCart() {
		shoppingCartLink.click();
	}
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	public void setWishlistLink(WebElement wishlistLink) {
		this.wishlistLink = wishlistLink;
	}
	public void clickWishlist() {
		wishlistLink.click();
	}
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	public WebElement getBooksLink() {
		return booksLink;
	}
	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}
	public void clickBooklink() {
		booksLink.click();
	}
	@FindBy(partialLinkText = "Computers")
	private WebElement computerLink;
	public WebElement getComputerLink() {
		return computerLink;
	}
	public void setComputerLink(WebElement computerLink) {
		this.computerLink = computerLink;
	}
	public void clickComputerLink() {
		computerLink.click();
	}
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicsLink;
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}
	public void clickElectronicsLink() {
		electronicsLink.click();
	}
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparealShoeLink;
	public WebElement getApparealShoeLink() {
		return apparealShoeLink;
	}
	public void setApparealShoeLink(WebElement apparealShoeLink) {
		this.apparealShoeLink = apparealShoeLink;
	}
	public void clickApparealShoeLink() {
		apparealShoeLink.click();
	}
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalDownloadsLink;
	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}
	public void setDigitalDownloadsLink(WebElement digitalDownloadsLink) {
		this.digitalDownloadsLink = digitalDownloadsLink;
	}
	public void clickDigitalDownloadsLink() {
		digitalDownloadsLink.click();
	}
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;
	public WebElement getJewelryLink() {
		return jewelryLink;
	}
	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}
	public void clickJewelryLink() {
		jewelryLink.click();
	}
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCardsLink;
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	public void setGiftCardsLink(WebElement giftCardsLink) {
		this.giftCardsLink = giftCardsLink;
	}
	public void clickGiftCardsLink() {
		giftCardsLink.click();
	}
	
	
}
