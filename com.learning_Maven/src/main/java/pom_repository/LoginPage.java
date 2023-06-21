package pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
	@FindBy(id = "RememberMe")
	private WebElement remembermeCheckbox;
	public WebElement getRemembermeCheckbox() {
		return remembermeCheckbox;
	}
	public void setRemembermeCheckbox(WebElement remembermeCheckbox) {
		this.remembermeCheckbox = remembermeCheckbox;
	}
	public void clickRemembermeCheckbox()
	{
		remembermeCheckbox.click();
	}
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	
	
	
	

}
