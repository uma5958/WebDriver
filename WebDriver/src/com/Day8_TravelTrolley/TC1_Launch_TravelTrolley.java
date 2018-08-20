package com.Day8_TravelTrolley;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Launch_TravelTrolley {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.traveltrolley.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		if (url.contains("traveltrolley")) {
			System.out.println("Url Matched; Test PASS");
		}else {
			System.out.println("Url not Matched; Test FAIL");
			}
		driver.quit();
		}
}
