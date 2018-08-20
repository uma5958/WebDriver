package com.Day7_To_Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_8_getLocation_XY_coordinates_Vertical {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/WebDriver/jars/html/TextBox1.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		Point lp = ele1.getLocation();
		System.out.println("X - Co-ordinate:"+lp.getX());
		System.out.println("Y - Co-ordinate:"+lp.getY());
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='a2']"));
		Point lp1 = ele2.getLocation();
		System.out.println("X - Co-ordinate:"+lp1.getX());
		System.out.println("Y - Co-ordinate:"+lp1.getY());
		
		if (lp.getX()==lp1.getX()) {
			System.out.println("Both Text Boxes Are Aligned Vertically");
		} else {
			System.out.println("Both Text Boxes are Not Aligned Vertically");
		}

		driver.quit();
	}

}
