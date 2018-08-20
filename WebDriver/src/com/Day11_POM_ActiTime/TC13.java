package com.Day11_POM_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC13 {
	public static void main(String[] args) {
		//View Time Track
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		ActiTimePO at=new ActiTimePO(driver);
		at.Login("umakvdu", "umakvdu");
		at.ViewTimeTrack();
		RemoteWebDriver r=(RemoteWebDriver) driver; //down Casting
		String c="window.scrollTo(0, document.body.scrollHeight)";
		r.executeScript(c);
		at.ShowTasksRadio();
		//driver.quit();
	}

}
