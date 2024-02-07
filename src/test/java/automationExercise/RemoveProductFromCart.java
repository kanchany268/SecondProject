package automationExercise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;


public class RemoveProductFromCart extends Callings {
WebDriver driver;

		public RemoveProductFromCart(WebDriver  ldriver) {
			driver=ldriver;
			PageFactory.initElements(driver, this);

		}
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement product;
		@FindBy(xpath = "//div[@class='col-sm-9 padding-right']/child::div/child::div/child::div/child::div/following::div[43]/child::div/child::div[1]/child::div/child::a")
		WebElement AddToCart;
		@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")  WebElement ContinueShopping;
		@FindBy(xpath = "//div[@class='col-sm-9 padding-right']/child::div/child::div/child::div/child::div/following::div[64]/child::div/child::div/child::div/child::a")
		WebElement Addtocart;
		@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']") WebElement Continueshopping;
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[3]/child::a") WebElement cart ;
		@FindBy(xpath = "//tr[@id='product-12']/child::td[6]/child::a/child::i")
	    WebElement XButton;



		public void clickproduct() {
			   product.click();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
		 public void clickAddtocart() {
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",AddToCart);
				System.out.println(AddToCart.getText());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}
	  public void clickContinueShopping() {
		    	ContinueShopping.click();
		    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    }
		 public void clickAddtoCart() {
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",Addtocart);
				System.out.println(AddToCart.getText());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}
		public void clickContinueshopping() {
		    	Continueshopping.click();
		    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    }
		public void clickcart() {
			cart.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Assert.assertTrue(cart.isDisplayed());
		}
		public void clicXButton() {
		  XButton.click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  Assert.assertTrue(XButton.isDisplayed());
		  System.out.println("Product is removed");
			}

	}


