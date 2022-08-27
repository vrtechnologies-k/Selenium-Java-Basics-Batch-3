package SeleniumJavaTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeBrowser {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
		driver.navigate().back();
		
		Thread.sleep(10000);
		
		driver.navigate().forward();
		
		Thread.sleep(10000);
		
		driver.navigate().refresh();
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
