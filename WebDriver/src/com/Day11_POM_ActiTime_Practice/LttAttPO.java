package com.Day11_POM_ActiTime_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LttAttPO {
WebDriverWait wait;
public LttAttPO(WebDriver driver) {
	PageFactory.initElements(driver, this);
	wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleContains("Login"));
}
@FindBy(xpath="//a[text()='Lock Time-Track']")
private WebElement lt;
@FindBy(xpath="//span[text()='Lock Time-Track']")
private WebElement ltt;
@FindBy(xpath="//a[text()='Approve Time-Track']")
private WebElement at;
@FindBy(xpath="//td[text()='Approve Time-Track']")
private WebElement att;

public void Ltt() {
	lt.click();
	String s = ltt.getText();
	if (s.equalsIgnoreCase("Lock Time-Track")) {
	System.out.println("You are in Lock Time-Track Module; Test PASS");
	} else {
	System.out.println("You are not in Lock Time-Track Module; Test FAIL");
	}
}
public void Att() {
	at.click();
	String s = att.getText();
	if (s.contains("Approve")) {
		System.out.println("You are in Approve Time-Track Module; Test PASS");
	} else {
		System.out.println("You are not in Approve Time-Track Module; Test FAIL");
		}
	}
}
