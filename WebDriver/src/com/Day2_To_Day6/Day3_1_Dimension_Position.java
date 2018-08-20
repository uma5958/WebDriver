package com.Day2_To_Day6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_1_Dimension_Position {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		//Dimension
		Dimension d=new Dimension(200, 200);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		//set position
		Point p=new Point(400, 300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		
		//maximize the browser
		driver.manage().window().maximize();
	}

}
