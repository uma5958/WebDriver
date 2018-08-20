package CoverStory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.coverstory.co.in/");
		WebElement usericon = driver.findElement(By.cssSelector(".user-icon-inner"));
		//Actions a=new Actions(driver);
		WebDriverWait w=new WebDriverWait(driver,60);
		w.until(ExpectedConditions.visibilityOf(usericon));
		usericon.click();
		WebElement login = driver.findElement(By.cssSelector(".user_icon"));
		login.click();
		driver.findElement(By.cssSelector("#loginInput")).sendKeys("vinodmgr22@gmail.com");
		driver.findElement(By.cssSelector("#signPassword")).sendKeys("123456");
		driver.findElement(By.cssSelector("#stepOneSubmit")).click();
		driver.findElement(By.cssSelector(".user_icon")).click();
		driver.findElement(By.xpath("//div[@class='mini-cart-content3 after-login']//following::a[6][contains(@title,'Logout')]"));
		usericon.click();
		Assert.assertTrue(login.isDisplayed(), "Test Fail");
		Reporter.log("PASS",true);
		
		
		
	}

}
