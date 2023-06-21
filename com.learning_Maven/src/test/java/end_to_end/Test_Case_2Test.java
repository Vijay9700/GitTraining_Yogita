package end_to_end;

import org.testng.annotations.Test;

import genericlibrary.Base_Test;
import pom_repository.Cart;
import pom_repository.Create_it_yourself_jewelry;
import pom_repository.Jewelry;
import pom_repository.LoginPage;
import pom_repository.OnepageCheckout;
import pom_repository.WelcomePage;

public class Test_Case_2Test extends Base_Test {
	@Test
	public void BuyJweleryTest() throws InterruptedException {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickLogin();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail("vijayganesan@gmail.com");
		loginPage.enterPassword("Vijay@123");
		loginPage.clickRemembermeCheckbox();
		loginPage.clickLoginButton();
		welcomePage.clickJewelryLink();
		Jewelry jewelry = new Jewelry(driver);
		jewelry.clickAddtocartButton();
		Create_it_yourself_jewelry Create_it_yourself_jewelry = new Create_it_yourself_jewelry(driver);
		Create_it_yourself_jewelry.enterLength("15");
		Create_it_yourself_jewelry.clickLadybugCheckbox();
		Create_it_yourself_jewelry.clickAddToCartbutton();
		welcomePage.clickShoppingCart();
		Cart cart = new Cart(driver);
		cart.clicktermsofserviceCheckbox();
		cart.clickcheckoutButton();
		OnepageCheckout onePageCheckout = new OnepageCheckout(driver);
		onePageCheckout.clickBillingContinueButton();
		Thread.sleep(2000);
		onePageCheckout.clickPickUpInStoreCheckbox();
		Thread.sleep(2000);
		onePageCheckout.clickPickUpContinuebutton();
		Thread.sleep(2000);
//		//onePageCheckout.clickGroundCheckbox();
//		onePageCheckout.clickShippingMethodContinueButton();
//		Thread.sleep(2000);
//		//onePageCheckout.clickCashOnDeliveryCheckbox();
//		Thread.sleep(2000);
		onePageCheckout.clickpaymentmethodContinueButton();
		Thread.sleep(2000);
		onePageCheckout.clickPaymentinformationContinueButton();
		Thread.sleep(2000);
		onePageCheckout.clickConfirmorderContinueButton();
		}


}
