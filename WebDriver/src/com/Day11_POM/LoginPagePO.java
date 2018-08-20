package com.Day11_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePO {
	WebDriverWait wait;
	public LoginPagePO(WebDriver driver) {
		PageFactory.initElements(driver, this); //'this' contains the Address Of Current Object(page)
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	@FindBy(id="username")
	private WebElement unTxtBx;
	@FindBy(name="pwd")
	private WebElement pwTxtBx;
	@FindBy(xpath="//div[contains(text(), 'Login')]")
	private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInChkBx;
	
	public void LoginwithRememberMe(String un, String pw) {
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		keepLoggedInChkBx.click();
		loginBtn.click();
	}
	public void Login(String un, String pw) {
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		loginBtn.click();
	}
}
