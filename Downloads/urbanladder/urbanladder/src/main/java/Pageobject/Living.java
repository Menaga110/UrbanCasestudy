package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Living {
	WebDriver driver;
	public Living(WebDriver driver) {
		this.driver=driver;
	}
	By l=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/span");
	By l1=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[4]/ul/li[2]/a/span");
	By l2=By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]");
	By l3=By.xpath("//*[@id=\"price_limit_7209-14087\"]");
	By l4=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/ul");
	public WebElement clickLiv() {

		return  driver.findElement(l);
	}
	public WebElement ChooseLiv() {
		return  driver.findElement(l1);
	}
	
	public WebElement PriceRange() {
		return  driver.findElement(l2);
	}
	public WebElement Price() {
		return  driver.findElement(l3);
	}
	public WebElement PriceCheck() {
		return  driver.findElement(l4);
	}


}
