package logoutPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;
import validLogin.ValidLogin;

public class LogOut extends Callings{
	WebDriver driver;
	public LogOut(WebDriver Ldriver)
	{
		driver=Ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[4]/child::a") WebElement logout;

	public void clickLogin() {
		 ValidLogin  vl=new  ValidLogin (driver);
		 vl.clickLogin();  vl.enterEmail("Shitall@yahoo.com");
		 vl.enterpassword("SHITAL1234");
		 vl.clickLoginbutton();
	}

	public void clickLogout() {
		logout.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 String ActualUrl=driver.getCurrentUrl();
		 String expectedUrl="https://automationexercise.com/login";
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
}
