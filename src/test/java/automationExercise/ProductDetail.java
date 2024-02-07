package automationExercise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class ProductDetail extends Callings{
	WebDriver driver;
		public ProductDetail(WebDriver Ldriver) {
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement product;
		@FindBy(xpath = "//div[@class='features_items']")  WebElement productlist;
	    @FindBy(xpath = "//div[@class='col-sm-4']/child::div/child::div[1]/following::ul[1]/child::li/child::a[1]")
	    WebElement ViewProduct;
	    @FindBy(xpath = "//div[@class='product-information']") WebElement productDetail;


	public void clickproduct() {
		product.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 String ActualUrl=driver.getCurrentUrl();
		 String expectedUrl="https://automationexercise.com/products";
		 Assert.assertEquals(ActualUrl,expectedUrl);
		 System.out.println(ActualUrl);
		 System.out.println("All Products page is displayed successfully");
		 System.out.println( ActualUrl);
		 System.out.println("products list:-"+productlist.getText());

	}


	public void clickviewproduct() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",ViewProduct);

	System.out.println("All product detail:-"+productDetail.getText());
	}
	}


