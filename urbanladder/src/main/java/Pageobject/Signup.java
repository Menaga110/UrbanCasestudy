package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {

	WebDriver driver;
	public Signup(WebDriver driver) {
		this.driver=driver;
	}
	By username=By.xpath("//*[@id=\"spree_user_email\"]");
	By password=By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[2]/form/div/div/input[2]");
	By sign=By.xpath("//*[@id=\"signup_form\"]/input[4]");

	public WebElement Email() {
		return driver.findElement(username);
	}
	
	public WebElement ps() {
		return driver.findElement(password);
	}
	
	public WebElement signup() {
		return driver.findElement(sign);
	}
}
