package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Track {
	WebDriver driver;
	public Track(WebDriver driver) {
		this.driver=driver;
	}
	By track=By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[1]/a");
	
	By tno=By.xpath("//*[@id=\"ip_379403698\"]");
	By mn=By.xpath("//*[@id=\"ip_394711104\"]");
	By d=By.xpath("//*[@id=\"app-container\"]/div/main/section/form[1]/button");
	public WebElement track_order() {
		return driver.findElement(track);
	}
	public WebElement orderNo() {
		return driver.findElement(tno);
	}
	public WebElement mobile() {
		return driver.findElement(mn);
	}
	public WebElement track() {
		return driver.findElement(d);
	}

}
