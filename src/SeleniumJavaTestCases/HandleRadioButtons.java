package SeleniumJavaTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));

		WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		
		radio2.click();
		
		if (radio2.isSelected()) {
			
			System.out.println("Radio button 2 is selected");
		} else {
			
			System.out.println("Radio button 2 is not selected");
		}
		
		List<WebElement> radiobuttons = driver.findElements(By.className("radioButton"));
		
		System.out.println(radiobuttons.size());
		
		driver.quit();

	}

}
