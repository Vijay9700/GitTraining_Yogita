package pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public void setMaleRadioButton(WebElement maleRadioButton) {
		this.maleRadioButton = maleRadioButton;
	}
	public void clickMaleRadioButton()
	{
		maleRadioButton.click();
	}
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public void setFemaleRadioButton(WebElement femaleRadioButton) {
		this.femaleRadioButton = femaleRadioButton;
	}
	public void clickFemaleRadioButton() {
		femaleRadioButton.click();
	}
	@FindBy(id = "FirstName")
	private WebElement firstnameTextfield;
	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}
	public void setFirstnameTextfield(WebElement firstnameTextfield) {
		this.firstnameTextfield = firstnameTextfield;
	}
	public void enterFirstname(String firstname)
	{
		firstnameTextfield.sendKeys(firstname);
	}
	@FindBy(id = "LastName")
	private WebElement lastnameTextfield;
	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}
	public void setLastnameTextfield(WebElement lastnameTextfield) {
		this.lastnameTextfield = lastnameTextfield;
	}
	public void enterLastname(String lastname)
	{
		lastnameTextfield.sendKeys(lastname);
	}
	@FindBy(id = "Email")
	private WebElement emailTextfield;
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public void setEmailTextfield(WebElement emailTextfield) {
		this.emailTextfield = emailTextfield;
	}
	public void enterEmail(String email) {
		emailTextfield.sendKeys(email);
	}
	@FindBy(id = "Password")
	private WebElement passwordTextfield;
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public void setPasswordTextfield(WebElement passwordTextfield) {
		this.passwordTextfield = passwordTextfield;
	}
	public void enterPassword(String password) {
		passwordTextfield.sendKeys(password);
	}
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextfield;
	public WebElement getConfirmPasswordTextfield() {
		return confirmPasswordTextfield;
	}
	public void setConfirmPasswordTextfield(WebElement confirmPasswordTextfield) {
		this.confirmPasswordTextfield = confirmPasswordTextfield;
	}
	public void enterConfirmPassword(String confirmPassword)
	{
		confirmPasswordTextfield.sendKeys(confirmPassword);
	}
	@FindBy(id = "register-button")
	private WebElement registerButton;
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
	public void clickRegisterButton() {
		registerButton.click();
	}
	
	
	

}
