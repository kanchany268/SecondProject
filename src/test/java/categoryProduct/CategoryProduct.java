package categoryProduct;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;
import removeProduct.RemoveProductFromCart;

public class CategoryProduct extends Callings {
	WebDriver driver;
	public CategoryProduct (WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='left-sidebar']/child::div/child::div[1]/child::div/child::h4/child::a/child::span/child::i") WebElement women;
	@FindBy(xpath = "//div[@id='Women']/child::div/child::ul/child::li/child::a") WebElement dress;
	@FindBy(xpath = "//h2[@class='title text-center']") WebElement verifydress;
	@FindBy(xpath = "//div[@class='left-sidebar']/child::div/child::div[2]/child::div/child::h4/child::a/child::span/child::i") WebElement men;

public void clickWomen() {
	RemoveProductFromCart rpc=new RemoveProductFromCart(driver);
	rpc.clickproduct();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",women);

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void clickDress() {
	dress.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	if(verifydress.isDisplayed()) {
		System.out.println(verifydress.getText());
		System.out.println(" Test case pass");
	}else {
		System.out.println(" Test case Fails");
	}
}
public void clickMen() {
	men.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	if(men.isEnabled() ) {
		System.out.println(" Test case pass");
	}else {
		System.out.println(" Test case Fails");
	}

	}
}

