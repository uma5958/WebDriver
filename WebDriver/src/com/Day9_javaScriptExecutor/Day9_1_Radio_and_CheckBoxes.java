package com.Day9_javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Day9_1_Radio_and_CheckBoxes {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/Oxygen/jars/html/CheckBox.html");
		
		RemoteWebDriver r= (RemoteWebDriver) driver; // down casting
		
		String c="document.getElementById('a1').click()";
		Thread.sleep(2000);
		r.executeScript(c);
		Thread.sleep(2000);
		String c1="document.getElementById('a2').click()";
		Thread.sleep(2000);
		r.executeScript(c1);
		Thread.sleep(2000);
		driver.quit();
	}
}
