package com.Day11_Encapsulation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EC_Logout {
	private WebElement loBt;
	public EC_Logout(WebDriver driver) {
		loBt=driver.findElement(By.xpath("//a[@id='logoutLink'] | //a[text()='Logout']"));
	}
	public void logout() {
		loBt.click();
	}
}
