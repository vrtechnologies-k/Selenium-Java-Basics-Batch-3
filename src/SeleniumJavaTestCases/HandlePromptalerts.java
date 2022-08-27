package SeleniumJavaTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlePromptalerts {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");
		
		
		// Scroll down the webpage based on the x and y pixel
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Scroll up the webpage based on the x and y pixel
		//js.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(5000);
		
		WebElement prompt = driver.findElement(By.id("promtButton"));
		
		//driver.findElement(By.id("promtButton")).click();
		
		js.executeScript("arguments[0].click();", prompt);
		
		Thread.sleep(10000);
		
		//Actions action = new Actions(driver);
		
		//action.
		
		//sample alert
		//confrim alert
		//prompt alert
		
		// gettext, accept and dismiss
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Venkat");
		
		Thread.sleep(5000);
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		//alert.dismiss();
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}

}
