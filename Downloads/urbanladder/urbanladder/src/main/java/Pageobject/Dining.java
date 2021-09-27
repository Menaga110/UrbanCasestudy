package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dining {
	WebDriver driver;
	public Dining(WebDriver driver) {
		this.driver=driver;
	}
	
	By d=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[4]/span");
	By d1=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[4]/div/div/ul/li[1]/ul/li[3]/a/span");
	By d2=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div/a[1]");
	By d3=By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/div/ul/li[1]/div/div[5]/a/div[1]/span");
	By d4=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[5]/div[2]/a[2]");
	public WebElement clickdin() {
		return driver.findElement(d);
	}
	public WebElement Choosedin() {
		return driver.findElement(d1);
	}
	public WebElement tick() {
		return driver.findElement(d2);
	}
	public WebElement view() {
		return driver.findElement(d3);
	}
	public WebElement viewproduct() {
		return driver.findElement(d4);
	}

}
