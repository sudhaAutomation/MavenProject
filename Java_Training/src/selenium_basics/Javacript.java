package selenium_basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javacript {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location='https://www.facebook.com/'");
		js.executeScript("alert('logged in the facebook application')");
		driver.switchTo().alert().accept();
		js.executeScript("window.location='https://html.com/input-type-file/'");

		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//input[@id='fileupload']")));
		// js.executeScript("arguments[0].style.border='solid 3px red'",
		// driver.findElement(By.xpath("//input[@id='fileupload']")));
		// Screenshot.screenshotmethod(driver, "htmlpage");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.location='http://integratedtoolingsystems.in/1swishzz_staging/admin'");
		js.executeScript("arguments[0].style.border='solid 3px red'",
				 driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]")));
	}

}
