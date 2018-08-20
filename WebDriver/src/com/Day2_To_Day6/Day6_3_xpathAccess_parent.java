package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_3_xpathAccess_parent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//xpath-Access with parent On Web Table
		driver.get("file:///E:/WebDriver/jars/html/Traversing,%20Independent&Dependent_Table.html");
		System.out.println(driver.findElement(By.xpath("//td[text()='Testing']")).getText()); //Testing
		System.out.println(driver.findElement(By.xpath("//td[text()='Testing']/parent::tr/child::td[3]")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("//td[text()='1000']/parent::tr/child::td[2]")).getText()); //Core Java
		System.out.println(driver.findElement(By.xpath("//td[text()='Core Java']/parent::tr/child::td[3]")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("//td[text()='10000']/parent::tr/child::td[2]")).getText()); //Hadoop
		System.out.println(driver.findElement(By.xpath("//td[text()='Hadoop']/parent::tr/child::td[3]")).getText()); //Fee

		driver.quit();
	}
	
}
