package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bedroom {
	WebDriver driver;
	public Bedroom(WebDriver driver) {
		this.driver=driver;
	}
	
	By p=By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	By p1=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[3]/span");
	By p2=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[3]/div/div/ul/li[1]/ul/li[5]/a/span");
	By p3=By.xpath("//*[@id=\"content\"]/div[1]/div/h1");
	By p4=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[5]/a/div[1]/span");
	By p5=By.className("product-title");
	public WebElement popup() {
		return driver.findElement(p);
	}
	public WebElement move() {
		return driver.findElement(p1);
	}
	public WebElement queen() {
		return driver.findElement(p2);
	}
	public WebElement queencheck() {
		return driver.findElement(p3);
	}
	
	public WebElement Clickcate() {
		return driver.findElement(p4);
	}
	public WebElement name() {
		return driver.findElement(p5);
	}

}
