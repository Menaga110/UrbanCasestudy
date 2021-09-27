package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searching {
	WebDriver driver;
	public Searching(WebDriver driver) {
		this.driver=driver;
	}
	By s=By.xpath("//*[@id=\"search\"]");
	By search=By.xpath("//*[@id=\"search_button\"]/span");
	By name=By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a[2]/div[1]/span[1]");
	public WebElement sclick() {
		return driver.findElement(s);
	}
	public WebElement searchoption() {
		return driver.findElement(search);
	}
	public WebElement productname() {
		return driver.findElement(name);
	}
	
}

