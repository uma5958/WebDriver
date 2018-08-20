package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriUpdate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/login-jobs");
		
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("eLoginNew")).sendKeys("vijaykumar.dn707@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("Aa1@1993");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//a[text()='View Profile']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("uploadLink"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		/*int y = driver.findElement(By.id("uploadLink")).getLocation().getY();
		RemoteWebDriver r=(RemoteWebDriver) driver; //down Casting
		String c="window.scrollTo(0, "+y+")";
		Thread.sleep(2000);
		r.executeScript(c);*/
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Upload New Resume']")).click();
		
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\Uma\\Desktop\\RESUME.doc");
		
		driver.quit();
	}
}
