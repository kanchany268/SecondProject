package addtocartRecommendedItems;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import addProduct.AddProductsinCart;
import callingAutomationExercise.Callings;
import registeruserwithexisting.ExistingEmail;

public class RecommendedItems extends Callings {
	WebDriver driver;
	public RecommendedItems(WebDriver Ldriver) {
		driver=Ldriver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//div[@class='col-sm-9 padding-right']/child::div[2]/child::h2")	WebElement items;
@FindBy(xpath = "//div[@class='item active']/child::div[2]/child::div/child::div/child::div/child::a/child::i")
WebElement addtocart;

	public void clickrecommended() {
	 ExistingEmail ee=new ExistingEmail(driver);
	 ee.clickHome();
	 if(items.isDisplayed()) {
		 System.out.println(items.getText());
		 System.out.println("RECOMMENDED ITEMS is visible");
	 }else {
		 System.out.println("RECOMMENDED ITEMS is not visible");
	 }
	}
	public void cilckAddtoCart() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",addtocart);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		AddProductsinCart ac=new AddProductsinCart(driver);
		 ac.clickContinueshopping();   ac.clickcart();

	}
}

