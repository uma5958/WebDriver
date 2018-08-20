package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_2_xpathAccess_decendant {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//xpath-Access with descendant On Web Table
		driver.get("file:///E:/Oxygen/jars/html/Traversing,%20Independent&Dependent_Table.html");
		System.out.println(driver.findElement(By.xpath("/descendant::td[text()='Testing']")).getText()); //Testing
		System.out.println(driver.findElement(By.xpath("/descendant::td[contains(text(),'5000')]")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("/descendant::td[contains(text(),'Core Java')]")).getText()); //Core Java
		System.out.println(driver.findElement(By.xpath("/descendant::td[text()='1000']")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("/descendant::td[contains(text(),'Hadoop')]")).getText()); //Hadoop
		System.out.println(driver.findElement(By.xpath("/descendant::td[contains(text(),'10000')]")).getText()); //Fee

		driver.quit();
	}
	
}
