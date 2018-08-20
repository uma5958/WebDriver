package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_9_getSize_width_height {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/WebDriver/jars/html/TextBox1.html");
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		Dimension d1 = ele1.getSize();
		System.out.println("Box1 Height:"+d1.height);
		System.out.println("Box1 Width:"+d1.width);
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='a2']"));
		Dimension d2 = ele2.getSize();
		System.out.println("Box2 Height:"+d2.height);
		System.out.println("Box2 Width:"+d2.width);
		
		if (d1.width==d2.width) {
			System.out.println("Both Boxes - Width Same");
		} else {
			System.out.println("Both Boxes - Width Not Same");
		}
		if (d1.height==d2.height) {
			System.out.println("Both Boxes - Height Same");
		} else {
			System.out.println("Both Boxes - Height Not Same");
		}
		
		driver.quit();
	}

}
