package com.Day2_To_Day6;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3_3_Scanner_Sel_Opt_Browser {

	public static void main(String[] args) {
		System.out.println("Enter the Browser you want: FF/GC/IE");
		Scanner sc=new Scanner(System.in);
		String browser = sc.nextLine();
		
	/*	if(browser.equalsIgnoreCase("GC")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			driver1.get("https://www.google.com");
			System.out.println(driver1.getTitle());
			System.out.println(driver1.getCurrentUrl());
		}
		else if(browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.geckodriver.driver", "./Drivers/geckodriver.exe");
			WebDriver driver2=new FirefoxDriver();
			driver2.get("https://www.google.com");
			System.out.println(driver2.getTitle());
			System.out.println(driver2.getCurrentUrl());
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}*/

	switch (browser) {
	case "gc": 
					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					WebDriver driver1=new ChromeDriver();
					driver1.get("https://www.google.com");
					System.out.println(driver1.getTitle());
					System.out.println(driver1.getCurrentUrl());
					break;
	
	case "ff":
					System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
					WebDriver driver2=new FirefoxDriver();
					driver2.get("https://www.google.com");
					System.out.println(driver2.getTitle());
					System.out.println(driver2.getCurrentUrl());
					break;
	case "ie":
					System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
					WebDriver driver3=new ChromeDriver();
					driver3.get("https://www.google.com");
					System.out.println(driver3.getTitle());
					System.out.println(driver3.getCurrentUrl());
					break;				
					
	default:  System.out.println("Invalid Input");
					
	}
	}
	}	
