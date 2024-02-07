package automationExercise;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class CategoryProduct extends Callings {
WebDriver driver;
		public CategoryProduct (WebDriver ldriver) {
			driver=ldriver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//div[@class='panel-group category-products']") WebElement verifycategory;
		@FindBy(xpath = "//div[@class='left-sidebar']/child::div/child::div[1]/child::div/child::h4/child::a/child::span/child::i") WebElement women;
		@FindBy(xpath = "//div[@id='Women']/child::div/child::ul/child::li[1]/child::a") WebElement dress;
		@FindBy(xpath = "//h2[@class='title text-center']") WebElement verifydress;
		@FindBy(xpath = "//div[@class='left-sidebar']/child::div/child::div[2]/child::div/child::h4/child::a/child::span/child::i") WebElement men;

	public void clickproduct() {
		RemoveProductFromCart rpc=new RemoveProductFromCart(driver);
		rpc.clickproduct();
		Assert.assertTrue( verifycategory.isDisplayed());
		System.out.println(verifycategory.getText());
	}
		public void clickWomen() {
		women.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void clickDress() {
		dress.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Assert.assertTrue(verifydress.isDisplayed());
		System.out.println(verifydress.getText());
			
	}
	public void clickMen() {
		men.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(men.isDisplayed());
		}
	}



