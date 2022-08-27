package SeleniumJavaTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIEBrowser {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.ie.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
