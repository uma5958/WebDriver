package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_4_xpathAccess_ancestor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//xpath-Access with ancestor On Web Table
		driver.get("file:///E:/WebDriver/jars/html/Traversing,%20Independent&Dependent_Table.html");
		System.out.println(driver.findElement(By.xpath("//td[text()='Testing']")).getText()); //Testing
		System.out.println(driver.findElement(By.xpath("//td[text()='Testing']/ancestor::tbody/child::tr[2]/child::td[3]")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("//td[text()='1000']/ancestor::table/child::tbody/child::tr[3]/child::td[2]")).getText()); //Core Java
		System.out.println(driver.findElement(By.xpath("//td[text()='Core Java']/ancestor::table/child::tbody/child::tr[3]/child::td[3]")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("//td[text()='10000']/ancestor::body/child::table/child::tbody/child::tr[4]/child::td[2]")).getText()); //Hadoop
		System.out.println(driver.findElement(By.xpath("//td[text()='Hadoop']/ancestor::body/child::table/child::tbody/child::tr[4]/child::td[3]")).getText()); //Fee

		driver.quit();
	}
	
}
