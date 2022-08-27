package SeleniumJavaTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkboxes.size());
		
		for (int i=0; i<checkboxes.size(); i++) {
			
			checkboxes.get(i).click();
			
			if (checkboxes.get(i).isSelected()) {
				
				System.out.println("Checkbox "+(i+1)+" is selected");
			} else {
				
				System.out.println("Checkbox "+(i+1)+" is not selected");
			}
			
			
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	
	}

}
