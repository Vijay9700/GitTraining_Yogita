package pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnepageCheckout {
	public OnepageCheckout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "billing-address-select")
	private WebElement billingAddressSelect;
	public WebElement getBillingAddressSelect() {
		return billingAddressSelect;
	}
	public void setBillingAddressSelect(WebElement billingAddressSelect) {
		this.billingAddressSelect = billingAddressSelect;
	}
	public void enterBillingAdress(String billingAddress)
	{
		billingAddressSelect.sendKeys(billingAddress);
	}
	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement billingContinueButton;
	public WebElement getBillingContinueButton() {
		return billingContinueButton;
	}
	public void setBillingContinueButton(WebElement billingContinueButton) {
		this.billingContinueButton = billingContinueButton;
	}
	public void clickBillingContinueButton() {
		billingContinueButton.click();
	}
	@FindBy(id = "PickUpInStore")
	private WebElement pickUpInStoreCheckbox;
	public WebElement getPickUpInStoreCheckbox() {
		return pickUpInStoreCheckbox;
	}
	public void setPickUpInStoreCheckbox(WebElement pickUpInStoreCheckbox) {
		this.pickUpInStoreCheckbox = pickUpInStoreCheckbox;
	}
	public void clickPickUpInStoreCheckbox() {
		pickUpInStoreCheckbox.click();
	}
	@FindBy(xpath = "(//input[@type='button'])[3]")
	private WebElement pickUpContinuebutton;
	public WebElement getPickUpContinuebutton() {
		return pickUpContinuebutton;
	}
	public void setPickUpContinuebutton(WebElement pickUpContinuebutton) {
		this.pickUpContinuebutton = pickUpContinuebutton;
	}
	public void clickPickUpContinuebutton() {
		pickUpContinuebutton.click();
	}
	@FindBy(id = "shippingoption_0")
	private WebElement groundCheckbox;
	public WebElement getGroundCheckbox() {
		return groundCheckbox;
	}
	public void setGroundCheckbox(WebElement groundCheckbox) {
		this.groundCheckbox = groundCheckbox;
	}
	public void clickGroundCheckbox() {
		groundCheckbox.click();
	}
	@FindBy(xpath  = "(//input[@type='button'])[4]")
	private WebElement shippingMethodContinueButton;
	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}
	public void setShippingMethodContinueButton(WebElement shippingMethodContinueButton) {
		this.shippingMethodContinueButton = shippingMethodContinueButton;
	}
	public void clickShippingMethodContinueButton() {
		shippingMethodContinueButton.click();
	}
	@FindBy(id = "paymentmethod_1")
	private WebElement cashOnDeliveryCheckbox;
	public WebElement getCashOnDeliveryCheckbox() {
		return cashOnDeliveryCheckbox;
	}
	public void setCashOnDeliveryCheckbox(WebElement cashOnDeliveryCheckbox) {
		this.cashOnDeliveryCheckbox = cashOnDeliveryCheckbox;
	}
	public void clickCashOnDeliveryCheckbox()
	{
		cashOnDeliveryCheckbox.click();
	}
	@FindBy(xpath = "(//input[@type='button'])[5]")
	private WebElement paymentmethodContinueButton;
	public WebElement getPaymentmethodContinueButton() {
		return paymentmethodContinueButton;
	}
	public void setPaymentmethodContinueButton(WebElement paymentmethodContinueButton) {
		this.paymentmethodContinueButton = paymentmethodContinueButton;
	}
	public void clickpaymentmethodContinueButton() {
		paymentmethodContinueButton.click();
	}
	@FindBy(xpath = "(//input[@type='button'])[6]")
	private WebElement paymentinformationContinueButton;
	public WebElement getPaymentinformationContinueButton() {
		return paymentinformationContinueButton;
	}
	public void setPaymentinformationContinueButton(WebElement paymentinformationContinueButton) {
		this.paymentinformationContinueButton = paymentinformationContinueButton;
	}
	public void clickPaymentinformationContinueButton() {
		paymentinformationContinueButton.click();
	}
	@FindBy(xpath = "(//input[@type='button'])[7]")
	private WebElement confirmorderContinueButton;
	public WebElement getConfirmorderContinueButton() {
		return confirmorderContinueButton;
	}
	public void setConfirmorderContinueButton(WebElement confirmorderContinueButton) {
		this.confirmorderContinueButton = confirmorderContinueButton;
	}
	public void clickConfirmorderContinueButton() {
		confirmorderContinueButton.click();
	}
	

}
