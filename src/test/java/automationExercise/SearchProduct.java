package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class SearchProduct extends Callings{
	
WebDriver driver;
		public SearchProduct (WebDriver Ldriver)
		{
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement products;
		@FindBy(name = "search") WebElement search;
		@FindBy(xpath = "//button[@id='submit_search']")WebElement searchButton;
		@FindBy(xpath = "//h2[@class='title text-center']")  WebElement visiblesearch;



	public void clickproducts() {
			products.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 String ActualUrl=driver.getCurrentUrl();
			 String expectedUrl="https://automationexercise.com/products";
			 Assert.assertEquals(ActualUrl,expectedUrl);
			 System.out.println(ActualUrl);
			 System.out.println("All Products page is displayed successfully");

		}

	public void enterSearch(String input) {
		search.sendKeys(input);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clicksearchButton() {
		searchButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String search=visiblesearch.getText();
		Assert.assertEquals(search,"SEARCHED PRODUCTS");
		System.out.println("SEARCHED PRODUCTS is displayed");
	}



	}












