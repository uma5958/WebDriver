package com.Day11_Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EC_LogInPage2 {
		//Initializing the private members
		private WebElement  unTxtBx;
		private WebElement pwdTxtBx;
		private WebElement logInBtn;
		//Parameterized constructor
		public EC_LogInPage2(WebDriver driver) {
			unTxtBx=driver.findElement(By.id("username"));
			pwdTxtBx=driver.findElement(By.name("pwd"));
			logInBtn=driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
		}	
		//Setting (setter methods)
		public void login(String un, String pw) {
			unTxtBx.sendKeys(un);
			pwdTxtBx.sendKeys(un);
			logInBtn.click();		
		}
}
