package com.Day11_Encapsulation_Practice;

import org.openqa.selenium.WebDriver;

public class EC_url {
	private String url;
	public EC_url(WebDriver driver) {
		url=driver.getCurrentUrl();
	}
	public void url() {
		if (url.contains("https://online.actitime.com")) {
			System.out.println("Url Matched; Test PASS");
		} else {
			System.out.println("Url Not Matched; Test FAIL");
		}
	}
}
