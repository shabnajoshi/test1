package testingPackahge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DebugingTest {

	WebDriver driver;

	@Test
	public void t1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.medlablive.in");
		driver.findElement(By.name("userid")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo1212");
		driver.findElement(By.name("Login")).click();

	}

	@Test
	public void u1() {
		driver.close();
	}

}
