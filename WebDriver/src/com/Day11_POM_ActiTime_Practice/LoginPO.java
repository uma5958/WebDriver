package com.Day11_POM_ActiTime_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {
	WebDriverWait wait;
	public LoginPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	@FindBy(id="username")
	private WebElement unTb;
	@FindBy(name="pwd")
	private WebElement pwTb;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement kliCb;
	@FindBy(xpath="//div[contains(text(), 'Login')]")
	private WebElement liBtn;
	//Login
	public void Login(String un, String pw) {
		unTb.sendKeys("umakvdu");
		pwTb.sendKeys("umakvdu");
		liBtn.click();
	}
	//Login with Remember Check Box
	public void LoginWithRemember(String un, String pw) {
		unTb.sendKeys("umakvdu");
		pwTb.sendKeys("umakvdu");
		kliCb.click();
		liBtn.click();
	}
}
