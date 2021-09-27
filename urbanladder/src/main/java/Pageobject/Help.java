package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Help {

	WebDriver driver;
	public Help(WebDriver driver) {
		this.driver=driver;
	}
	By h=By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a");
	By ask=By.xpath("//*[@id=\"help-center-search-input\"]");
	By view=By.xpath("//*[@id=\"3581\"]/div[2]/span");
	public WebElement help() {
		return driver.findElement(h);
	}
	public WebElement askhelp() {
		return driver.findElement(ask);
	}
	public WebElement View() {
		return driver.findElement(view);
	}

	
}
