package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin {
	WebDriver driver;
	public Signin(WebDriver driver) {
		this.driver=driver;
	}
	/*By log=By.xpath("//*[@id=\"signup-module\"]/div[3]/a");
	By username=By.xpath("//*[@id=\"spree_user_email\"]");
	By password=By.xpath("//*[@id=\"spree_user_password\"]");
	By sign=By.id("ul_site_login");

	public WebElement login() {
		return driver.findElement(log);
	}
	
	public WebElement name() {
		return driver.findElement(username);
	}
	public WebElement  psw() {
		return driver.findElement(password);
	}
	public WebElement signin() {
		return driver.findElement(sign);
	}
	*/
	
	By log=By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]");
	By sign=By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a");
	By user=By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input");
	By ps=By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input");
	By signin=By.xpath("//*[@id=\"ul_site_login\"]");
	public WebElement Log() {
		return driver.findElement(log);
	}
	public WebElement Sign() {
		return driver.findElement(sign);
	}
	public WebElement User() {
		return driver.findElement(user);
	}
	public WebElement Pwd() {
		return driver.findElement(ps);
	}
	public WebElement Signin() {
		return driver.findElement(signin);
	}





}
