package com.Day11_Encapsulation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EC_Login {
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBT;
	public EC_Login(WebDriver driver) {
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBT=driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
	}
	public void Login(String un, String pw) {
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
		loginBT.click();	
	}
}
