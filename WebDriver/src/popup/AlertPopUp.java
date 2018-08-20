package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/Mars2/jars/Alert.html");
		driver.findElement(By.xpath("//a[text()=' Click here to enter your name ']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		//alert.accept();
		alert.dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

}
