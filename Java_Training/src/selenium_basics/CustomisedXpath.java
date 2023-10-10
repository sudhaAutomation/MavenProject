package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomisedXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[text()='Courses List']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-info pull-right btn-icon']")).click();

		// Select sel = new
		// Select(driver.findElement(By.xpath("//select[@name='category_id']")));
		// sel.selectByVisibleText("Testing");

		new Select(driver.findElement(By.xpath("//select[@name='category_id']"))).selectByVisibleText("Testing");
		driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys("Software testing");
		driver.findElement(By.xpath("//input[@name='course_slug']")).sendKeys("www.Softwaretesting.com");
		driver.switchTo().frame(driver.findElement(By.id("TypeHere11_ifr")));
		//driver.switchTo().frame(0);
		/// html/body
		driver.findElement(By.xpath("/html/body"))
				.sendKeys("software testing different approches with manual and automation testing");
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		driver.findElement(By.name("userfile"))
				.sendKeys("C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\Testing\\pics\\agile model.jpg");
		driver.findElement(By.name("submit")).click();
	}

}
