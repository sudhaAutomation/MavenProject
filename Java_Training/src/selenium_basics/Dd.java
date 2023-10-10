package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dd {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// synchronisation
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("projectScreens\\admin.png"));

		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Upcoming Batches')]")).click();
		int rows = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr"))
				.size();
		int cols = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td"))
				.size();

		for (int i = 1; i <= rows; i++) {
			boolean isFound = false;
			for (int j = 1; j <= cols; j++) {
				/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]
				/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]
				// /html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[8]/a[1]/i[1]
				/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[8]/a[2]/i[1]
				/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/a[2]/i[1]
				/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/a[2]/i[1]
				String halfxpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";

				String rowdata = driver.findElement(By.xpath(halfxpath + i + "]/td[" + j + "]")).getText();
				rowdata = driver.findElement(By.xpath(halfxpath + i + "]")).getText();

				if (rowdata.contains("Hyderabad")) {
					System.out.print(rowdata + "   ");
					driver.findElement(By.xpath(halfxpath + i + "]/td[8]/a[2]/i[1]")).click();

					isFound = true;
					break;
				}

			}
			System.out.println();
			// if(isFound) break;
		}

	}

}
