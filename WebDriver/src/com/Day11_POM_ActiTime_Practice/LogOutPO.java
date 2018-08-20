package com.Day11_POM_ActiTime_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutPO {
	WebDriverWait wait;
	public LogOutPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement loBtn;
	public void Logout() {
		loBtn.click();
	}
}
