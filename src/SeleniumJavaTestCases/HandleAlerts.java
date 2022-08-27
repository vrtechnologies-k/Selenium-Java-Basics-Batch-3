package SeleniumJavaTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleAlerts {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");


		driver.findElement(By.id("name")).sendKeys("Venkat");
		Thread.sleep(10000);
		
		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(10000);
		
		
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.dismiss();
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}

}
