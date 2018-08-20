package com.Day11_POM_ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimePO {
	WebDriverWait wait;
	public ActiTimePO(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	@FindBy(id="username")
	private WebElement unTxtBx;
	@FindBy(name="pwd")
	private WebElement pwTxtBx;
	@FindBy(xpath="//div[contains(text(), 'Login')]")
	private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInChkBx;
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotpswd;
	@FindBy(id="forgetPasswordEmailOrUsername")
	private WebElement emTxtBx;
	@FindBy(xpath="//div[contains(text(), 'Request Login Info')]")
	private WebElement reqLogInBtn;
	@FindBy(id="toLoginPageLink")
	private WebElement link;
	@FindBy(id="taskSearchControl_field")
	private WebElement AddTasksTxtBx;
	@FindBy(id="SubmitTTButton")
	private WebElement savechangesBtn;
	@FindBy(xpath="//span[text()='Add Recent Task']")
	private WebElement addRecentTaskLink;
	@FindBy(xpath="//div[@class='row task'][3]")
	private WebElement task;
	@FindBy(xpath="//span[text()='Add Tasks from the List']")
	private WebElement AddTaskLink;
	@FindBy(xpath="//td[contains(text(), ' Ready for Approval')]")
	private WebElement ReadyForApproveBtn;
	@FindBy(xpath="//div[text()='Save']")
	private WebElement saveBtn;
	@FindBy(xpath="//span[text()='New']")
	private WebElement newTaskBtn;
	@FindBy(id="createTasksPopup_cancelBtn")
	private WebElement cancelBtn;
	@FindBy(xpath="//span[text()='Me']")
	private WebElement meDropdown;
	@FindBy(xpath="//span[contains(text(), 'Uma')]")
	private WebElement adminUma;
	@FindBy(id="ext-gen23")
	private WebElement caleder;
	@FindBy(xpath="//a[text()='current week']")
	private WebElement currentWeek;
	@FindBy(xpath="//a[contains(text(), 'View Time-Track')]")
	private WebElement viewTT;
	@FindBy(xpath="//input[@class='showTasks']")
	private WebElement showTasks;
	@FindBy(xpath="//td[@class='middle-left-cell contents customRightPart']")
	private WebElement mothDropdown;
	@FindBy(xpath="//span[text()='Filters']")
	private WebElement filters;
	@FindBy(xpath="//span[@id='ext-gen57']")
	private WebElement customerProjectDD;
	@FindBy(xpath="//img[@id='ext-gen1071']")
	private WebElement allProjects;
	@FindBy(xpath="//img[@id='ext-gen1086']")
	private WebElement allActiveProjects;
	@FindBy(xpath="//img[@id='ext-gen1143']")
	private WebElement selectedCustom;
	@FindBy(xpath="//span[@id='ext-gen1158']")
	private WebElement closeBtn;
	@FindBy(xpath="//input[@id='viewTTStatusCheckboxId_0']")
	private WebElement approvedRadio;
	@FindBy(xpath="//input[@id='viewTTStatusCheckboxId_1']")
	private WebElement readyForApprovRadio;
	@FindBy(xpath="//input[@id='viewTTStatusCheckboxId_2']")
	private WebElement notReadyRadio;
	@FindBy(xpath="//input[@id='applyFilterEdit']")
	private WebElement applyBtn;
	@FindBy(id="logoutLink")
	private WebElement logOutBtn;

	
	
	public void LoginwithRememberMe(String un, String pw) {
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		keepLoggedInChkBx.click();
		loginBtn.click();
	}
	public void Login(String un, String pw) {
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		loginBtn.click();
	}
	public void ForgotPswd() {
		forgotpswd.click();
	}
	public void SendForGotemail(String email) {
		emTxtBx.sendKeys(email);
		reqLogInBtn.click();
	}
	public void ReturnToLogIn() {
		link.click();
	}
	public void AddTasksByName(String tname) {
		AddTasksTxtBx.sendKeys(tname);
	}
	public void SaveChanges() {
		savechangesBtn.click();
	}
	public void AddRecentTask() {
		addRecentTaskLink.click();
		task.click();
	}
	public void AddTasksFromList() {
		AddTaskLink.click();
	}
	public void ReadyForapprove() {
		ReadyForApproveBtn.click();
		saveBtn.click();
	}
	public void CreateNewTasks() {
		newTaskBtn.click();
		cancelBtn.click();
	}
	public void MeDropDown() {
		meDropdown.click();
		adminUma.click();
	}
	public void Calender() throws InterruptedException {
		caleder.click();
		Thread.sleep(3000);
		currentWeek.click();
	}
	public void ViewTimeTrack() {
		viewTT.click();
	}
	public void ShowTasksRadio() {
		showTasks.click();
	}
	public void MonthDropDown() {
		mothDropdown.click();
	}
	public void Filters() {
		filters.click();
	}
	public void CustomerProjectDD() {
		customerProjectDD.click();
	}
	public void ApprovedRadio() {
		approvedRadio.click();
	}
	public void ReadyForApprovalRadio() {
		readyForApprovRadio.click();
	}
	public void NotReadyRadio() {
		readyForApprovRadio.click();
	}
	public void ApplyRadio() {
		applyBtn.click();
	}
	public void Logout() {
		logOutBtn.click();
	}
	
}
