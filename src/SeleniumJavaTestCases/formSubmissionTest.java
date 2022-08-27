package SeleniumJavaTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class formSubmissionTest {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "D:\\EclipseAutomation\\SeleniumJavaBatch_3\\BrowserDrivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Venkat");
		
		driver.findElement(By.name("email")).sendKeys("venkat@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Venkat@1234");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		new Select(driver.findElement(By.id("exampleFormControlSelect1"))).selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.name("bday")).sendKeys("01-08-1988");
		
		driver.findElement(By.className("btn-success")).click();
		
		String validationText = driver.findElement(By.className("alert-success")).getText();
		
		System.out.println(validationText);
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
