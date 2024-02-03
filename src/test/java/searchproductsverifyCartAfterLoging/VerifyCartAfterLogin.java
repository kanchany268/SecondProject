package searchproductsverifyCartAfterLoging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import addProduct.AddProductsinCart;
import callingAutomationExercise.Callings;
import logoutPage.LogOut;
import searchProductPage.SearchProduct;
import subscriptionCartPage.SubscriptionCart;

public class VerifyCartAfterLogin extends Callings{
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
		LogOut lo=new LogOut(driver);
		lo. clickLogin();
		SubscriptionCart sc=new SubscriptionCart(driver);
		sc.clickCart();
	}
}
