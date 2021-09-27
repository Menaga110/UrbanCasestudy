package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class placeOrder {
	WebDriver driver;
	public placeOrder(WebDriver driver) {
		this.driver=driver;
	}

	By add=By.xpath("//*[@id=\"add-to-cart-button\"]");
	By check=By.xpath("//*[@id=\"checkout-link\"]");
	By ele=By.xpath("//*[@id=\"order_email\"]");
	By pin=By.xpath("//*[@id=\"order_ship_address_attributes_zipcode\"]");
	By ad=By.xpath("//*[@id=\"order_ship_address_attributes_address1\"]");
	By name=By.xpath("//*[@id=\"order_ship_address_attributes_firstname\"]");
	By lname=By.xpath("//*[@id=\"order_ship_address_attributes_lastname\"]");
	By no=By.xpath("//*[@id=\"order_ship_address_attributes_phone\"]");
	By save=By.xpath("//*[@id=\"address-form-submit\"]");
	public WebElement Add() {
		
		return driver.findElement(add);
	}
	public WebElement checkout() {
		return driver.findElement(check);
	}
	public WebElement Email() {
		return driver.findElement(ele);
	}
	public WebElement pincode() {
		return driver.findElement(pin);
	}
	public WebElement Addres() {
		return driver.findElement(ad);
	}
	public WebElement Fname() {
		return driver.findElement(name);
	}
	public WebElement Lname() {
		return driver.findElement(lname);
	}
	public WebElement mobileNo() {
		return driver.findElement(no);
	}
	public WebElement Continue() {
		return driver.findElement(save);
	}

}
