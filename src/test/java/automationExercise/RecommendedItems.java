package automationExercise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



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
		 String itemsshow=items.getText();
		 Assert.assertEquals(itemsshow ,"RECOMMENDED ITEMS");
		 System.out.println(itemsshow+ " "+"is displayed");	
			
		
		}
		public void cilckAddtoCart() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",addtocart);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			AddProductsinCart ac=new AddProductsinCart(driver);
			 ac.clickContinueshopping();   ac.clickcart();

		}
	}



