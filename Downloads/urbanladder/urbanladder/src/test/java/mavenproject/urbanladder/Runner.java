package mavenproject.urbanladder;

	import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


	import Pageobject.Signin;
	import Pageobject.Signup;
	import Pageobject.Track;
	import Pageobject.Bedroom;
	import Pageobject.Dining;
	import Pageobject.Giftcard;
	import Pageobject.Help;
	import Pageobject.Living;
	import Pageobject.placeOrder;
	import Pageobject.Mattress;
	import Pageobject.Searching;
import Resources.Exceldata;
import Resources.Reusable;

	public class Runner  extends Reusable{

		public static final Logger log=LogManager.getLogger(Runner.class.getName());
		//@BeforeTest
		public void start() throws IOException {
			driver=initialize();
			driver.get(url);
		}
			@Test(priority=1)
			public void signinapp() throws IOException {
				driver=initialize();
				driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Signin l=new Signin(driver);
			Actions s=new Actions(driver);
			s.moveToElement(l.Log()).build().perform();
			l.Sign().click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			l.User().click();
			l.User().sendKeys("xyz@gmail.com");
			l.Pwd().sendKeys("abc123");
			l.Signin().click();
			log.info("Successfully login into the application");
			
			driver.close();
		}
	  @Test(priority =0)
			public void signup() throws IOException {
		  driver=initialize();
			driver.get(url);
				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Signup s=new Signup(driver);
			s.Email().sendKeys("abc@gmail.com");
			s.ps().sendKeys("ac@34df");
			s.signup().click();
			log.info("Successfully sign up the application");
			driver.close();
			
			}
	@Test(priority=2, dataProvider="getSearchData")
	public void searching(String name) throws IOException {
		driver=initialize();
		driver.get(url);
	Searching s1=new Searching(driver);
	s1.sclick().click();
	s1.sclick().sendKeys(name);
	s1.searchoption().click();
	log.info("Searched item has  displayed");
	 System.out.println(s1.productname().isDisplayed());
	 Assert.assertTrue(s1.productname().isDisplayed());
	 driver.close();
	}


	@Test(priority=3)
	public void Bedroomtest() throws IOException {
		driver=initialize();
		driver.get(url);
	Bedroom b=new Bedroom(driver);
		Actions s=new Actions(driver);
		s.moveToElement((b.move())).build().perform();
		b.queen().click();
		System.out.println(b.queencheck().isDisplayed());
		Assert.assertTrue(b.queencheck().isDisplayed());
		log.info(b.queencheck().getText()+"has displayed");
		b.Clickcate().click();
		System.out.println("Current page url:"+ driver.getCurrentUrl());
		System.out.println("Title of the page: "+ driver.getTitle());
		System.out.println("bed name: "+ b.name().getText());
		driver.close();

	}
	@Test(priority=6)
	public void MatressTest() throws IOException {
		driver=initialize();
		driver.get(url);
		Mattress m=new Mattress(driver);
		Actions s=new Actions(driver);
		Bedroom b=new Bedroom(driver);
		s.moveToElement(m.clickMat()).build().perform();
		m.chooseMat().click();
		m.Mat().click();
		log.info("Mattress name:"+m.matName().getText());
		log.info("Price:"+m.price().getText());
		System.out.println("Mattress name:"+m.matName().getText());
		System.out.println("Price:"+m.price().getText());
		
		placeOrder c=new placeOrder(driver);
		c.Add().click();
		c.checkout().click();
		c.Email().sendKeys("abc@gmail.com");
		c.pincode().sendKeys("636305");
		c.Addres().sendKeys("4/13,Dasasamuthiram,salem");
		c.Fname().sendKeys("MEnaga");
		c.Lname().sendKeys("K");
		c.mobileNo().sendKeys("9698723473");
		//c.Continue().click();
		driver.close();
	}

	@SuppressWarnings("deprecation")
	@Test(priority=4)
	public void LivingTest() throws IOException {
		driver=initialize();
		driver.get(url);
		Living l=new Living(driver);
		Actions s=new Actions(driver);
		s.moveToElement(l.clickLiv()).build().perform();
		l.ChooseLiv().click();
		s.moveToElement(l.PriceRange()).build().perform();
		l.Price().click();
		System.out.println(l.PriceCheck().getText());
		Assert.assertTrue(l.PriceCheck().isDisplayed());
		log.info(l.PriceCheck().getText()+"Price");
		driver.close();
	}

	@Test(priority=5)
	public void DiningTest() throws IOException {
		driver=initialize();
		driver.get(url);
		Dining d=new Dining(driver);
		Actions s=new Actions(driver);
		s.moveToElement(d.clickdin()).build().perform();
		d.Choosedin().click();
		d.tick().click();
		
		//s.moveToElement(d.view()).build().perform();
		//d.viewproduct().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println( driver.getTitle());
		driver.close();
	}

	@Test(priority=7)
	public void getHelp() throws IOException {
		
		driver=initialize();
		driver.get(url);
		Help h=new Help(driver);
		h.help().click();
		h.askhelp().click();
		h.askhelp().sendKeys("How can I place a bulk order?");
		h.askhelp().click();
		h.View().click();
		log.info("doubt cleared");
		driver.close();
	}
	@Test(priority=8)
	public void Trackorder() throws IOException {
		driver=initialize();
		driver.get(url);
		Track t=new Track(driver);
		t.track_order().click();
		t.orderNo().sendKeys("123456");
		t.mobile().sendKeys("87659023445");
		t.track().click();
		driver.close();
		log.info("Your order is tracked");
	}

	@Test(priority=9)
	public void gift() throws IOException {
		driver=initialize();
		driver.get(url);
		Giftcard g=new Giftcard(driver);
		g.Card().click();
		g.Occason().click();
		g.Amt().click();
		g.Mon().click();
		g.Mon().click();
		g.Date().click();
		g.Date().click();
		g.Next().click();
		
		g.Toname().sendKeys("tom");
		g.Tomail().sendKeys("abs@gmail.com");
		g.Yname().sendKeys("cherry");
		g.Ymail().sendKeys("xyz@gmail.com");
		g.Yno().sendKeys("345778");
		g.Conform().click();
		log.info("Conform to proceed gifts");
		driver.close();

	}
	@DataProvider
	public Object[][] getSearchData() throws IOException {
		Exceldata data=new Exceldata();
		ArrayList<String> h = data.getData("TestData","Search");
		int ct = h.size();
		Object[][] data1 = new Object[ct-1][1];
		
		for(int i = 1; i < ct ; i++) {
			
			data1[i-1][0] = h.get(i);
		}
		return data1;
		
	}

	}



