package callingAutomationExercise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import addProduct.AddProductsinCart;
import addReviewProduct.AddReview;
import addtocartRecommendedItems.RecommendedItems;
import allProducts.ProductDetail;
import cartBandProduct.BrandProduct;
import categoryProduct.CategoryProduct;
import contact.ContactUs;
import downloadInvoice.DownloadInvoice;
import invalidlogin.InvalidLogin;
import io.github.bonigarcia.wdm.WebDriverManager;
import loginBeforeCheckout.LoginBefore;
import logoutPage.LogOut;
import productQuantity.ProductQuantityinCart;
import registerBeforeCheckout.RegisterCheckoutB;
import registerPage.RegisterUser;
import registerWhileCheckout.RegisterCheckout;
import registeruserwithexisting.ExistingEmail;
import removeProduct.RemoveProductFromCart;
import searchProductPage.SearchProduct;
import searchproductsverifyCartAfterLoging.VerifyCartAfterLogin;
import subscriptionCartPage.SubscriptionCart;
import subscriptionHomePage.SubscriptionInHomepage;
import testCasePage.TestCase;
import validLogin.ValidLogin;
import verifyAddress.VerifyAddressDetails;
import verifyScrollUpUsingArrow.UsingArrowButton;
import verifyScrollUpWthoutArrow.ScrollDownWithoutArrow;

public class Callings {

		WebDriver driver;
		@BeforeMethod
		public void LaunchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://automationexercise.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
		@Test
		public void test() {
			String actualTittle=driver.getTitle();
			String expectedTittle="Automation Exercise";
			Assert.assertEquals(actualTittle,expectedTittle);

			RegisterUser ru=new RegisterUser(driver); //Testcase1
			ru.clickSignup();    ru.entername("kanchan");
			ru.enteremailAddress("kanchan2009@gamil.com");  ru.clicksignup();
			ru.clickmrs();       ru.enterPassword("9822456323");
			ru.Days();           ru.Months();             ru.Years();
			ru.clicknews();      ru.clickoptin();         ru.enterFirstname("kanchan");
			ru.enterLastname("yadav");                    ru.enterCompany("Infosys");
			ru.enterAddress1("Mahakali kapil chowk chandrapur");
			ru.enterAddress2("M.K.C"); ru.clickCountry(); ru.enterState("maharashtra");
			ru.enterCity("Chandrapur");ru.enterCode("442401");
			ru.enterMobileNo("8551879822");               ru.clickCreateAccount();
			ru.clickContinue();        ru.clickDeleteAccount();
			ru.clickContinues();
			ValidLogin  vl=new ValidLogin (driver);//Test case 2
			vl.clickLogin();  vl.enterEmail("Neelam@yahoo.com.com");
		    vl.enterpassword("neelam12");  vl.clickLoginbutton(); vl. checklog();
			InvalidLogin il=new InvalidLogin(driver); //Test case 3
			il.clicklogin(); il.clickLoginbutton2();
			LogOut lo=new LogOut(driver); ////Test case 4
			lo. clickLogin();  lo.clickLogout();
			ExistingEmail ee=new ExistingEmail(driver); ////Test case 5
		    ee.clickemail();  ee.clickHome();
			ContactUs c=new ContactUs(driver); //Test case 6
			c.clickContactus();                 c.enterName("kanchan yadav");
			c.enterEmail("kanchan18@gmail");    c.entersubject("Selenium");
			c.enterMessage("Demo QA");     c.clickuplodFile("D:\\DataDriverTesting.xlsx");   c.clickSubmit();
		 	c.clickHome();
			TestCase tc=new TestCase(driver); //Test case 7
		 	tc.clickTestcase();
		 	ProductDetail p=new ProductDetail(driver);//Test case 8
		 	p.clickproduct();    p.clickviewproduct();
		 	SearchProduct sp=new SearchProduct(driver); ////Test case 9
			sp.clickproducts();    sp.enterSearch("Tops");
			sp.clicksearchButton();
			SubscriptionInHomepage sh=new SubscriptionInHomepage(driver); //Test case 10
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			sh.enterSubcribeEmail("kanchan18@gmail.com");
			sh.clickSubscribeButton();
			SubscriptionCart sc=new SubscriptionCart(driver); //Test case 11
			sc.clickCart();
			JavascriptExecutor JS=(JavascriptExecutor)driver;
			JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			sc.clicksub();
			AddProductsinCart ac=new AddProductsinCart(driver); //Test case 12
			ac.clickproduct();    ac.clickAddtocart(); ac.clickContinueshopping();  ac.clickAddtoCart();
		    ac.clickContinueshopping();   ac.clickcart(); ac.bothproducts();
			ProductQuantityinCart pc=new ProductQuantityinCart(driver); ////Test case 13
			pc.clickproduct();     pc.clickView();     pc.clickQuantity(); pc.clickcart();
			RegisterCheckout RC=new  RegisterCheckout(driver);//Test case 14
			RC.addproduct();     RC.clickCheckout();   RC.clickRegister();
			RC.singupss();     RC.clickcarts();    RC.clickProceedcheckout();
			RC.enterMessage("I like the products");   RC. clickPlaceorder();
			RC.entername("KANCHAN YADAV");    RC. enterCard("34567");
			RC.enterCVC("411");   RC.enterMonts("10");   RC.enterYears("2026");
			RC.clickconfirm();    RC.clickdelete();    RC.clickContinue();
			RegisterCheckoutB Rb=new  RegisterCheckoutB(driver); //Test case 15
			Rb.clickbeforetest();
			LoginBefore lb=new LoginBefore(driver); //Test case 16
			lb.loginBefore();
			RemoveProductFromCart rpc=new RemoveProductFromCart(driver); //Test case 17
			rpc.clickproduct(); rpc.clickAddtocart(); rpc. clickContinueShopping();
			rpc.clickAddtoCart(); rpc.clickContinueshopping(); rpc.clickcart(); rpc.clicXButton();
			CategoryProduct cp=new CategoryProduct (driver); //Test case 18
			cp.clickWomen(); cp.clickDress(); cp.clickMen();
			BrandProduct bp=new BrandProduct(driver); //Test case 19
			bp.clickBrand(); bp.clickBabyhug();
			VerifyCartAfterLogin v=new VerifyCartAfterLogin (driver); //Test case 20
			v.clickproducts();    v.clickcart();
			AddReview rv=new AddReview(driver); //Test case 21
			rv.clickproduct();  rv.enterName("kanchan"); rv.enterEmail("kanchan18@gmail.com");
			rv.enterReview("Product quality is best");    rv.clickSubmit();
			RecommendedItems ri=new RecommendedItems(driver); //Test case 22
			ri.clickrecommended();
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			ri.cilckAddtoCart();
			VerifyAddressDetails va=new VerifyAddressDetails(driver); //Test case 23
			va.clickaddress();
			DownloadInvoice di=new DownloadInvoice(driver); //Test case 24
			di.clickcarts();   di.clickDowlond();  di.clickContinue();
			ScrollDownWithoutArrow sd=new ScrollDownWithoutArrow(driver); //Test case 25
			sd.subscription();
			UsingArrowButton ub=new UsingArrowButton(driver);//Test case 26
			ub.scroll();  ub.clickArrow();

		}}
