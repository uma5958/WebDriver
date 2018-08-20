package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_5_xpathAccess_preceding_and_following_sibling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//xpath-Access with preceding-sibling & following-sibling On Tiffins Menu
		driver.get("file:///E:/WebDriver/jars/html/Preceeding%20&%20Following%20-%20siblings.html");
		
		String t1 = driver.findElement(By.xpath("//option[@value='a3']")).getText();
		System.out.println("Reference Item:"+t1); //Vada
		
		String t2 = driver.findElement(By.xpath("//option[@value='a3']/preceding-sibling::option[1]")).getText();
		System.out.println("1st Item Before Vada:"+t2); //Idly
		
		String t3 = driver.findElement(By.xpath("//option[@value='a3']/preceding-sibling::option[2]")).getText();
		System.out.println("2nd Item Before Vada"+t3); //
		
		String t4 = driver.findElement(By.xpath("//option[@value='a3']/following-sibling::option[1]")).getText();
		System.out.println("1st Item After Vada:"+t4); //Poori
		
		String t5 = driver.findElement(By.xpath("//option[@value='a3']/following-sibling::option[2]")).getText();
		System.out.println("2st Item After Vada:"+t5); //Poori
		driver.quit();
	}
	
}
