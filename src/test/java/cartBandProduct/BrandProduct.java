package cartBandProduct;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import addProduct.AddProductsinCart;
import callingAutomationExercise.Callings;

public class BrandProduct extends Callings {
	WebDriver driver;
	public BrandProduct(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='brands_products']") WebElement verifyb;
	@FindBy(xpath = "//div[@class='brands-name']/child::ul/child::li[3]/child::a") WebElement madame;
	@FindBy(xpath = "//h2[@class='title text-center']") WebElement verifymadame;
	@FindBy(xpath = "//div[@class='brands-name']/child::ul/child::li[5]/child::a") WebElement babyhug;
	@FindBy(xpath = "//h2[@class='title text-center']") WebElement verifyhug;
	public void clickBrand() {
	AddProductsinCart ac=new AddProductsinCart(driver);
	ac.clickproduct();
	if(verifyb.isDisplayed()) {
		System.out.println("Brand is display Test case pass");
	}else {
		System.out.println("Brand is display Test case fail");
	}

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",madame);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	if(verifymadame.isDisplayed()) {
		System.out.println(verifymadame.getText());
		System.out.println("Brand is display Test case pass");
	}else {
		System.out.println("Brand is display Test case fail");
	}
}
	public void clickBabyhug() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",babyhug);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(verifyhug.isDisplayed()) {
			System.out.println(verifyhug.getText());
			System.out.println("Brand is display Test case pass");
		}else {
			System.out.println("Brand is display Test case fail");
		}
	}
	}
