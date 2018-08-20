package com.Day11_Encapsulation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EC_timeTrack {
	private WebElement txt;
	private String s;
	public EC_timeTrack(WebDriver driver) {
		txt=driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
	}
	public void tt() {
		s=txt.getText();
		if (s.equalsIgnoreCase("Enter Time-Track")) {
			System.out.println("You are in Enter Time-Track Module; Test PASS");
		} else {
			System.out.println("You are not in Enter Time-Track Module; Test FAIL");
		}
	}
}
