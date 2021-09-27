package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Giftcard {
	
	WebDriver driver;
	public Giftcard(WebDriver driver) {
		this.driver=driver;
	}
	
	By card=By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[3]/a");

	By occ=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]");
	By amt=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[1]/button[1]");
	By mon=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[4]/select[1]");
	By date=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[4]/select[2]");
	By next=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button");
	
	By toname=By.xpath("//*[@id=\"ip_4036288348\"]");
	By tomail=By.xpath("//*[@id=\"ip_137656023\"]");
	By yname=By.xpath("//*[@id=\"ip_1082986083\"]");
	By ymail=By.xpath("//*[@id=\"ip_4081352456\"]");
	By yno=By.xpath("//*[@id=\"ip_2121573464\"]");
	By conf=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[3]/form/button");
	public WebElement Card() {
		return driver.findElement(card);
	}
	public WebElement Occason() {
		
	return driver.findElement(occ);
	}
	public WebElement Amt() {
		return driver.findElement(amt);
	}
	public WebElement Mon() {
		return driver.findElement(mon);
	}
	
	public WebElement Date() {
		return driver.findElement(date);
	}
	public WebElement Next() {
		return driver.findElement(next);
	}
	
	
	public WebElement Toname() {
		return driver.findElement(toname);
	}
	public WebElement  Tomail() {
		return driver.findElement(tomail);
	}
	public WebElement Yname() {
		return driver.findElement(yname);
	}
	public WebElement Ymail() {
		return driver.findElement(ymail);
	}
	public WebElement Yno() {
		return driver.findElement(yno);
	}
	public WebElement Conform() {
		return driver.findElement(conf);
	}
}
