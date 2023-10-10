package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginWithTestNG {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");

	}

	@Test(priority=1)
	public void loginWithValidTestData() {
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		String expTitle = "Welcome1";
		System.out.println();
		String acttitile = driver.findElement(By.className("title")).getText();
		System.out.println(acttitile);
		if (acttitile.equals(expTitle)) {
			// System.out.println("System logged in successfully");

			Assert.assertTrue(true, "System logged in successfully");

		} else {
			// System.out.println("System failed to login");

			Assert.assertTrue(false, "System failed to login");
		}
	}

	@Test(priority=2)
	public void loginWithInValidTestData() {
		driver.findElement(By.name("email")).sendKeys("admin1@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		String expError = "Please login with valid credentials";
		String acterror = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[1]")).getText();
		if (acterror.contains(expError)) {
			Assert.assertTrue(true, "System displayed the error message as " + expError);

		} else {
			Assert.assertTrue(false, "System not displayed the error message as " + expError);
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

}
