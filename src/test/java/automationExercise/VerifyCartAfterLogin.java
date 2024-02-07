package automationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import automationTestPage.Callings;




public class VerifyCartAfterLogin extends Callings {
	WebDriver driver;
		public VerifyCartAfterLogin (WebDriver Ldriver)
		{
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}
		public void clickproducts() {
			SearchProduct sp=new SearchProduct(driver);
			sp.clickproducts();    sp.enterSearch("Tops");
			sp.clicksearchButton();
		}
		public void clickcart() {
			AddProductsinCart ac=new AddProductsinCart(driver);
			ac.clickproduct();    ac.clickAddtocart(); ac.clickContinueshopping();  ac.clickcart();
			Logout lo=new Logout(driver);
			lo. clickLogin();
			SubscriptionCart sc=new SubscriptionCart(driver);
			sc.clickCart();
		}
	

}
