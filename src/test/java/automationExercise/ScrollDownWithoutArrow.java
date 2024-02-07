package automationExercise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class ScrollDownWithoutArrow extends Callings {
	
		WebDriver driver;
		public ScrollDownWithoutArrow(WebDriver ldriver) {
			driver=ldriver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//div[@class='single-widget']/child::h2")  WebElement visible;
		@FindBy(xpath = "//div[@class='item active']/child::div/child::h2")  WebElement fullmessage;


	public void subscription() {
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
		
		  Assert.assertTrue(visible.isDisplayed());
	      System.out.println(visible.getText()+"  "+"is displayed");
	      
		JavascriptExecutor JS1=(JavascriptExecutor)driver;
		JS1.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String Message=fullmessage.getText();
		Assert.assertEquals(Message,"Full-Fledged practice website for Automation Engineers");
		System.out.println(Message+" "+"is displayed");
		
	}
	}


