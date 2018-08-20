package com.Day11_Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EC_LogOut {
	private WebElement logoutLink;
	public EC_LogOut(WebDriver driver) {
		logoutLink=driver.findElement(By.xpath("//a[text()='Logout']"));
	}
	public void Logout(){
		logoutLink.click();
	}	
}
