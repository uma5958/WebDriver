package com.Day11_Encapsulation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EC_ViewTT {
	private WebElement vtt;
	public EC_ViewTT(WebDriver driver) {
		vtt=driver.findElement(By.xpath("//a[text()='View Time-Track']"));
	}
	public void ViewTimeTrack(){
		vtt.click();
		}
}

