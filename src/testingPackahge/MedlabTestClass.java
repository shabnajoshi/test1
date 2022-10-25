package testingPackahge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class MedlabTestClass {
	WebDriver driver;

	@BeforeMethod
	public void m1() {

		System.out.println("helloaaa");
	}

	@Test(priority = 1)
	public void login() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.medlablive.in");
		driver.findElement(By.name("userid")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo1212");
		driver.findElement(By.name("Login")).click();

	}

	@Test(priority = 2)
	public void billEntry() {
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Bill Entry")).click();

	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		System.out.println("inside after method");
		String location = "C:\\Users\\user\\Desktop\\arun\\"; // location for images
		String methodname = result.getName(); // fetching test method name

		File screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshots, new File(location + methodname + "_" + ".png"));
		System.out.println("location : " + location + methodname + "_" + ".png");
	}

//	@AfterMethod
//	 public void getScreenShot(String fileName) throws IOException{
//	        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
//	        Date date = new Date();
//	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	        FileHandler.copy(scrFile, new File("C:\\Users\\user\\Desktop\\arun\\"+fileName+"-"+dateFormat.format(date)+".png"));
//	    }

}
