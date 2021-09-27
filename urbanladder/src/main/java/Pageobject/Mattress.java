package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mattress {
	WebDriver driver;
	public Mattress(WebDriver driver) {
		this.driver=driver;
	}
	By m=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[8]/span");
	By m1=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[8]/div/div/ul/li/ul/li[3]/a/span");
	By m2=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div[1]/a[2]/div[1]/span[1]");
	By m3=By.xpath("//*[@id=\"buy_details_75531\"]/div[1]/div[1]/div[1]/div[2]");
	By m4=By.xpath("//*[@id=\"nproduct-show\"]/div[1]/h1");
	public WebElement clickMat() {
		return driver.findElement(m);
	}
	public WebElement chooseMat() {
		return driver.findElement(m1);
	}
	public WebElement Mat() {
		return driver.findElement(m2);
	}
	public WebElement price() {
		return driver.findElement(m3);
	}
	public WebElement matName() {
		return driver.findElement(m4);
	}



}
