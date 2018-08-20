package com.Day11_POM_ActiTime_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Title_UrlPO {
	WebDriverWait wait;
	public Title_UrlPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	public void titleUrl(WebDriver driver) {
		String t = driver.getTitle();
		String u = driver.getCurrentUrl();
		System.out.println("Title :"+t);
		System.out.println("Url :"+u);
	} 
}
