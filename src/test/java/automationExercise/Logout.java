package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class Logout extends Callings {
	
	
		WebDriver driver;
		public Logout(WebDriver Ldriver)
		{
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[4]/child::a") WebElement logout;
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[10]") WebElement logged;
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[4]/child::a")
		WebElement Login;

		public void clickLogin() {
			 ValidLogin  vl=new  ValidLogin (driver);
			 vl.clickLogin();  vl.enterEmail("Shitall@yahoo.com");
			 vl.enterpassword("SHITAL1234");
			 vl.clickLoginbutton();
			 Assert.assertTrue(logged.isDisplayed());
			 System.out.println(logged.getText());
			
		}

		public void clickLogout() {
			logout.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Assert.assertTrue(Login.isDisplayed());
			 System.out.println(Login.getText());
			
			
			
			
	}

}
