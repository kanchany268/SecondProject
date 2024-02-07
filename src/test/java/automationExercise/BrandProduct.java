package automationExercise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class BrandProduct extends Callings{
	WebDriver driver;
		public BrandProduct(WebDriver ldriver) {
			driver=ldriver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//div[@class='brands_products']") WebElement verifybrand;
		@FindBy(xpath = "//div[@class='brands-name']/child::ul/child::li[3]/child::a") WebElement madame;
		@FindBy(xpath = "//h2[@class='title text-center']") WebElement verifymadame;
		@FindBy(xpath = "//div[@class='brands-name']/child::ul/child::li[5]/child::a") WebElement babyhug;
		@FindBy(xpath = "//h2[@class='title text-center']") WebElement verifyhug;
		public void clickBrand() {
		AddProductsinCart ac=new AddProductsinCart(driver);
		ac.clickproduct();
		Assert.assertTrue( verifybrand.isDisplayed());
		System.out.println(verifybrand.getText());
		
		}
		public void clickMadame() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",madame);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Assert.assertTrue( verifymadame.isDisplayed());
		System.out.println(verifymadame.getText());

	}
		public void clickBabyhug() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",babyhug);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			Assert.assertTrue( verifyhug.isDisplayed());
			System.out.println(verifyhug.getText());
		}
}

