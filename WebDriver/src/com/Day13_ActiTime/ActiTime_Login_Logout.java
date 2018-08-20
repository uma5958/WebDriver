package com.Day13_ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime_Login_Logout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("umakvdu");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("umakvdu");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		try {
			wait.until(ExpectedConditions.titleContains(title)); 
			System.out.println("Title Matched");
		} catch (TimeoutException e) {
			System.out.println("Title not Matched");
		}
		driver.findElement(By.xpath("//a[@id='logoutLink'] | //a[text()='Logout']")).click();
		driver.quit();
	}

}
