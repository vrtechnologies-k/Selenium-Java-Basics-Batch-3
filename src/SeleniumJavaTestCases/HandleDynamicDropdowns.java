package SeleniumJavaTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {

			
	
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
		
		System.out.println(options.size());
		
		for (int i=0; i<options.size(); i++) {
			
			String option = options.get(i).getText();
			
			System.out.println(option);
			
		}
		// We can select the value from the dropdown three ways
		//index
		//value
		//visibleText
		new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']"))).selectByVisibleText("Option2");
		
		Thread.sleep(10000);
		
		driver.quit();
		
	
	}

}
