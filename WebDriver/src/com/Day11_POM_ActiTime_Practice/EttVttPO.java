package com.Day11_POM_ActiTime_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EttVttPO {
	WebDriverWait wait;
	public EttVttPO(WebDriver driver) {
	PageFactory.initElements(driver, this);
	wait=new WebDriverWait(driver, 20);
}

@FindBy(xpath="//td[text()='Enter Time-Track']")
private WebElement ett;
@FindBy(xpath="//a[text()='View Time-Track']")
private WebElement vtt;
@FindBy(xpath="//div[text()='Time-Track Details']")
private WebElement ttd;

public void enterTT() {
	String t = ett.getText();
	if (t.equalsIgnoreCase("Enter Time-Track")) {
		System.out.println("You are in Enter Time-Track Module; Test PASS");
	} else {
		System.out.println("You are not in Enter Time-Track Module; Test FAIL");
	}
	}
public void viewTT() {
	vtt.click();
	String s = ttd.getText();
	if (s.equalsIgnoreCase("Time-Track Details")) {
		System.out.println("You are in View Time-Track Module; Test PASS");
	} else {
		System.out.println("You are not in View Time-Track Module; Test FAIL");
	}
}
}
