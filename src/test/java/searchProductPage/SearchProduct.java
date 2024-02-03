package searchProductPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;


public class SearchProduct  extends Callings{
	WebDriver driver;
	public SearchProduct (WebDriver Ldriver)
	{
		driver=Ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement products;
	@FindBy(name = "search") WebElement search;
	@FindBy(xpath = "//button[@id='submit_search']")WebElement searchButton;
	@FindBy(xpath = "//td[@class='cart_description']")  WebElement visibleproduct;



public void clickproducts() {
		products.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 String ActualUrl=driver.getCurrentUrl();
		 String expectedUrl="https://automationexercise.com/products";
		 if(expectedUrl.equalsIgnoreCase(ActualUrl))
			{
				System.out.println("Test case passs");
			}
			else
			{
				System.out.println("Test case fail");
			}
		 System.out.println( ActualUrl);

	}

public void enterSearch(String input) {
	search.sendKeys(input);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
public void clicksearchButton() {
	searchButton.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	if(search.isDisplayed()) {
		System.out.println(" Search Product  is visible Test case pass");
	}else {
		System.out.println(" Search Product is not visible Test case fail");

	}

}



}










