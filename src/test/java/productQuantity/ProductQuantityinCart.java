package productQuantity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import addProduct.AddProductsinCart;
import callingAutomationExercise.Callings;

public class ProductQuantityinCart extends Callings {
	WebDriver driver;
public 	ProductQuantityinCart(WebDriver Ldriver) {
	driver=Ldriver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement product;
@FindBy(xpath = "//div[@class='col-sm-9 padding-right']/child::div/child::div/child::div/following::div[80]/child::div/child::a/following::ul/child::li/child::a")
WebElement ViewProduct;
@FindBy(id="quantity") WebElement Quantity;
@FindBy(xpath = "//button[@type='button']") WebElement addtocarts;
@FindBy(xpath = "//table[@class='table table-condensed']")  WebElement productd;
public void clickproduct() {
	product.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


}
public void clickView() {
	ViewProduct.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
public void clickQuantity() {

	Quantity.clear();
	Quantity.sendKeys("4");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


}
public void clickcart() {
	addtocarts.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	AddProductsinCart ac=new AddProductsinCart(driver);
	ac. clickContinueShopping();   ac. clickcart() ;
	System.out.println(productd.getText());



}



}
