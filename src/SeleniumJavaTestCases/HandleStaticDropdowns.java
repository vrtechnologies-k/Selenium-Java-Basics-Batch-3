package SeleniumJavaTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticDropdowns {

	public static void main(String[] args) throws InterruptedException {

			
	
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		Thread.sleep(3000);
		
		List<WebElement> dropdowns = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		
		System.out.println(dropdowns.size());
		
		for (int i=0; i<dropdowns.size(); i++) {
			
			String country = dropdowns.get(i).getText();
			System.out.println(country);
			
			if (country.equals("India")) {
				
				dropdowns.get(i).click();
				break;
			}
			
		}
		
		Thread.sleep(10000);
		
		driver.quit();
		
	
	}

}
