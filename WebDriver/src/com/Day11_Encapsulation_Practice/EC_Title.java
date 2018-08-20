package com.Day11_Encapsulation_Practice;

import org.openqa.selenium.WebDriver;

public class EC_Title {
	private String  title;
public EC_Title(WebDriver driver) {
	title=driver.getTitle();
	}
public void getTitle() {
	if (title.contains("actiTIME")) {
		System.out.println("Title Matched; Test PASS");
	} else {
		System.out.println("Title Not Matched; Test FAIL");
	}
}
}
