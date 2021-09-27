package StepDefination;


	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Pageobject.Bedroom;
import Pageobject.Dining;
import Pageobject.Giftcard;
import Pageobject.Help;
import Pageobject.Living;
import Pageobject.Mattress;
import Pageobject.Searching;
import Pageobject.Signin;
import Pageobject.Signup;
import Pageobject.Track;
import Pageobject.placeOrder;
import Resources.Reusable;

	@RunWith(Cucumber.class)
	public class StepDeination extends Reusable {
		public static final Logger log=LogManager.getLogger(StepDeination.class.getName());

		//Sign up testcase
	    @Given("^initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	       driver=initialize();
	       log.info("Successfully intialize the driver");
	      
	    }

	    @When("^enter the user credentials$")
	    public void enter_the_user_credentials() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Signup s=new Signup(driver);
			s.Email().sendKeys("abc@gmail.com");
			s.ps().sendKeys("ac@34df");
			
			
	    }

	    @Then("^verify the application$")
	    public void verify_the_application() throws Throwable {
	    	Signup s=new Signup(driver);
	    	s.signup().click();
			log.info("Successfully sign up the application");
	    }

	    @And("^go to th given url$")
	    public void go_to_th_given_url() throws Throwable {
	    	 driver.get(url);
	    }
	    
	    ///Sign in testcase
	    @And("^Go to signin page$")
	    public void go_to_signin_page() throws Throwable {
	    	Signin l=new Signin(driver);
			Actions s=new Actions(driver);
			s.moveToElement(l.Log()).build().perform();
			l.Sign().click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    @When("^enter the user credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void enter_the_user_credentials_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	Signin l=new Signin(driver);
	    	l.User().click();
			l.User().sendKeys("abc@gmail.com");
			l.Pwd().sendKeys("abc123");
			
	    }
	    @Then("^verify signin testcase$")
	    public void verify_signin_testcase() throws Throwable {
	    	Signin l=new Signin(driver);
	    	l.Signin().click();
	    	log.info("sapplicationucessfully Sign in  ");
	    } 
	    
	    //Searching product testcase
	    @And("^Go to searh the product$")
	    public void go_to_searh_the_product() throws Throwable {
	    	Searching s1=new Searching(driver);
	    	s1.sclick().click();
	    	s1.sclick().sendKeys("sofa");
	    	s1.searchoption().click();
	    	//log.info("Searched item has  displayed");
	    	 System.out.println(s1.productname().isDisplayed());
	    	 Assert.assertTrue(s1.productname().isDisplayed());
	    }
	   
	    @Then("^verify u get the product$")
	    public void verify_u_get_the_product() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	Searching s1=new Searching(driver);
	    	System.out.println(s1.productname().isDisplayed());
	    	 Assert.assertTrue(s1.productname().isDisplayed());
	    	 log.info("searched product displayed");
	    	 
	    }
	  
	    //Bedroom testcase
	    @And("^Go to bedroom in testcase$")
	    public void go_to_bedroom_in_testcase() throws Throwable {
	    	Bedroom b=new Bedroom(driver);
	    	Actions s=new Actions(driver);
	    	s.moveToElement((b.move())).build().perform();
	    }

	    @And("^choose a your preferable bedroom$")
	    public void choose_a_your_preferable_bedroom() throws Throwable {
	    	Bedroom b=new Bedroom(driver);
	    	b.queen().click();
	    }
	    @Then("^verify u get your choice$")
	    public void verify_u_get_your_choice() throws Throwable {
	    	Bedroom b=new Bedroom(driver);
	    	System.out.println(b.queencheck().isDisplayed());
	    	Assert.assertTrue(b.queencheck().isDisplayed());
	    	//log.info(b.queencheck().getText()+"has displayed");
	    	b.Clickcate().click();
	    	System.out.println("Current page url:"+ driver.getCurrentUrl());
	    	System.out.println("Title of the page: "+ driver.getTitle());
	    	System.out.println("bed name: "+ b.name().getText());
	    	log.info("bedroom testcase validated");
	    }
	    
	    //Matress Test
	    @Then("^verify th Matress$")
	    public void verify_th_matress() throws Throwable {
	    	Mattress m=new Mattress(driver);
	    	System.out.println("Mattress name:"+m.matName().getText());
	    	System.out.println("Price:"+m.price().getText());
	    	log.info("Matress testcase validated");
	    }

	   

	    @And("^Go to Mattress in testcase$")
	    public void go_to_mattress_in_testcase() throws Throwable {
	    	
	    	Mattress m=new Mattress(driver);
	    	Actions s=new Actions(driver);
	    	Bedroom b=new Bedroom(driver);
	    	s.moveToElement(m.clickMat()).build().perform();
	    }

	    @And("^choose a your preferable Mattress$")
	    public void choose_a_your_preferable_mattress() throws Throwable {
	    	Mattress m=new Mattress(driver);
	    	m.chooseMat().click();
	    	m.Mat().click();
	    }

	    //Place order test
	    @Then("^add to cart$")
	    public void add_to_cart() throws Throwable {
	    	placeOrder c=new placeOrder(driver);
	    	c.Add().click();
	    	c.checkout().click();
	    	
	        
	    }

	    @And("^Give address and place order$")
	    public void give_address_and_place_order() throws Throwable {
	    	placeOrder c=new placeOrder(driver);
	    	c.Email().sendKeys("abc@gmail.com");
	    	c.pincode().sendKeys("636305");
	    	c.Addres().sendKeys("4/13,Dasasamuthiram,salem");
	    	c.Fname().sendKeys("MEnaga");
	    	c.Lname().sendKeys("K");
	    	c.mobileNo().sendKeys("9698723473");
	    }
	   //Verify Living test
	    @And("^Go to Living$")
	    public void go_to_living() throws Throwable {
	    	Living l=new Living(driver);
	    	Actions s=new Actions(driver);
	    	s.moveToElement(l.clickLiv()).build().perform();

	    }

	    @And("^choose Tables$")
	    public void choose_tables() throws Throwable {
	    	Living l=new Living(driver);
	    	l.ChooseLiv().click();
	    	
	    	
	    }

	    @When("^change price range$")
	    public void change_price_range() throws Throwable {
	    	Living l=new Living(driver);
    	Actions s=new Actions(driver);
	    	s.moveToElement(l.PriceRange()).build().perform();
	    	l.Price().click();
	    }

	    @Then("^verify price$")
	    public void verify_price() throws Throwable {
	    	Living l=new Living(driver);
	    	
	    	System.out.println(l.PriceCheck().getText());
	    	Assert.assertTrue(l.PriceCheck().isDisplayed());
	    	log.info(" product ordered ");
	    }

	   //Diningtest
	    @And("^Go to Dining$")
	    public void go_to_dining() throws Throwable {
	    	Dining d=new Dining(driver);
	    	Actions s=new Actions(driver);
	    	s.moveToElement(d.clickdin()).build().perform();
	    }

	    @And("^choose by your choice$")
	    public void choose_by_your_choice() throws Throwable {
	    	Dining d=new Dining(driver);
	    	d.Choosedin().click();
	    	d.tick().click();	
	    	
	    }

	  
	    @Then("^verify details$")
	    public void verify_details() throws Throwable {
	    	
	    	System.out.println(driver.getCurrentUrl());
	    	System.out.println( driver.getTitle());
	    	log.info("Diningtest testcase validated");
	    }
	    //Get help testcase
	    @And("^Go to help section$")
	    public void go_to_help_section() throws Throwable {
	    	Help h=new Help(driver);
	    	h.help().click();
	    }

	    @And("^ask help$")
	    public void ask_help() throws Throwable {
	    	Help h=new Help(driver);
	    	h.askhelp().click();
	    	h.askhelp().sendKeys("How can I place a bulk order?");
	    	h.askhelp().click();
	    }

	    @Then("^verify got help$")
	    public void verify_got_help() throws Throwable {
	    	Help h=new Help(driver);
	    	h.View().click();
	    	System.out.println("Got help");
	    	
	    }

	   //Track order
	    @And("^Go to track order$")
	    public void go_to_track_order() throws Throwable {
	    	Track t=new Track(driver);
	    	t.track_order().click();
	    	
	    	
	    	//log.info("Your order is tracked");
	    }

	    @And("^give your details$")
	    public void give_your_details() throws Throwable {
	    	Track t=new Track(driver);
	    	t.orderNo().sendKeys("123456");
	    	t.mobile().sendKeys("87659023445");
	    	t.track().click();
	    }
	    @Then("^verify status$")
	    public void verify_status() throws Throwable {
	        System.out.println("Order tracked succesfully");
	    }
	    
	    //Gift card testcase
	    @And("^Go to gift card section$")
	    public void go_to_gift_card_section() throws Throwable {
	    	Giftcard g=new Giftcard(driver);
	    	g.Card().click();
	    	
	    	
	    	
	    	
	    }

	    @And("^choose occasion and give details$")
	    public void choose_occasion_and_give_details() throws Throwable {
	    	Giftcard g=new Giftcard(driver);
	    	g.Occason().click();
	    	g.Amt().click();
	    	g.Mon().click();
	    	g.Mon().click();
	    	g.Date().click();
	    	g.Date().click();
	    	g.Next().click();
	    }

	    @When("^conform the gift$")
	    public void conform_the_gift() throws Throwable {
	    	Giftcard g=new Giftcard(driver);
	    	g.Toname().sendKeys("tom");
	    	g.Tomail().sendKeys("abs@gmail.com");
	    	g.Yname().sendKeys("cherry");
	    	g.Ymail().sendKeys("xyz@gmail.com");
	    	g.Yno().sendKeys("345778");
	    	g.Conform().click();
	    }

	    @Then("^verify  gift$")
	    public void verify_gift() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    System.out.println("Conform to proceed gifts");
	    }

	   

	    

	    

	   

	   
	    

	
	   
	   
	   

	    @And("^close browser$")
	    public void close_browser() throws Throwable {
	    	driver.close();
	    }

	}