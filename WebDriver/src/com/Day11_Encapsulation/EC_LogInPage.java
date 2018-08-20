package com.Day11_Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EC_LogInPage {
		//Initializing the private members
		private WebElement  unTxtBx;
		private WebElement pwdTxtBx;
		private WebElement logInBtn;
		//Parameterized constructor
		public EC_LogInPage(WebDriver driver) {
			unTxtBx=driver.findElement(By.id("username"));
			pwdTxtBx=driver.findElement(By.name("pwd"));
			logInBtn=driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
		}	
		//Setting (setter methods)
		public void setUserName(String name) {
			unTxtBx.sendKeys(name);
		}
		public void setPassword(String name) {
			pwdTxtBx.sendKeys(name);
		}
		public void ClickLogInBtn() {
			logInBtn.click();
		}
}
