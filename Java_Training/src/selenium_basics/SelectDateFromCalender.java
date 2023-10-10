package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDateFromCalender {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(
				By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectDate("July 2020", "22", false);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectDate("June 2025", "5", true);

	}

	public static void selectDate(String expMonth, String expDate, boolean isNext) {
		System.out.println(expDate + " " + expMonth);
		while (true) {
			String actMonth = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]"))
					.getText();
			System.out.println(actMonth);
			if (actMonth.equals(expMonth)) {
				driver.findElement(By.xpath("//a[contains(text(),'" + expDate + "')]")).click();
				break;

			} else if (isNext) {
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			} else {
				driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			}

		}

	}

}
