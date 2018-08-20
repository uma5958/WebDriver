package com.Day2_To_Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_7_xpath_with_GroupIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//xpath with Group Index On Web Table
		driver.get("file:///E:/WebDriver/jars/html/Traversing,%20Independent&Dependent_Table.html");
		System.out.println(driver.findElement(By.xpath("(//td)[5]")).getText()); //Testing
		System.out.println(driver.findElement(By.xpath("(//td)[6]")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("(//td)[8]")).getText()); //Core Java
		System.out.println(driver.findElement(By.xpath("(//td)[9]")).getText()); //Fee
		
		System.out.println(driver.findElement(By.xpath("(//td)[11]")).getText()); //Hadoop
		System.out.println(driver.findElement(By.xpath("(//td)[last()]")).getText()); //Last Column - Fee

		//xpath with Group Index On Links
		driver.navigate().to("file:///E:/WebDriver/jars/html/Text%20function_Links.html");
		driver.findElement(By.xpath("(//a)[1]")).click(); //Google
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.xpath("(//a)[3]")).click(); //SeleniumHq
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.xpath("(//a)[last()]")).click(); //Last Link - Naukri
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.quit();
	}
}
