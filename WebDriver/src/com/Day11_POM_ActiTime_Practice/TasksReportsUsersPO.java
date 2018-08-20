package com.Day11_POM_ActiTime_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TasksReportsUsersPO {
	WebDriverWait wait;
	public TasksReportsUsersPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	@FindBy(xpath="//div[text()='Customers & Projects']")
	private WebElement t;
	
	@FindBy(xpath="//div[text()='REPORTS']")
	private WebElement reports;
	@FindBy(xpath="//td[text()='Reports Dashboard']")
	private WebElement r;
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement users;
	@FindBy(xpath="//span[text()='User List']")
	private WebElement u;
	
	public void Tasks() {
		tasks.click();
		String s = t.getText();
		if (s.contains("Projects")) {
			System.out.println("You are in Tasks Module; Test PASS");
		} else {
			System.out.println("You are not in Taks Module; Test FAIL");
		}
	}
	
	public void Reports() {
		reports.click();
		String s = r.getText();
		if (s.contains("Reports")) {
			System.out.println("You are in Reports Module; Test PASS");
		} else {
			System.out.println("You are not in Reports Module; Test FAIL");
			}
		}
	
	public void Users() {
		users.click();
		String s = u.getText();
		if (s.contains("User")) {
			System.out.println("You are Users Module; Test PASS");
		} else {
			System.out.println("You are not in Users Module; Test FAIL");
		}
	}
}
