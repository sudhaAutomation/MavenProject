package selenium_basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.keralartc.com/main.html");// Home page
		driver.findElement(By.xpath("//a[contains(text(),'E-Ticketing')]")).click();// E-Ticketing
		driver.findElement(By.xpath("//a[contains(text(),'City Circular')]")).click();// City Circular
		driver.findElement(By.xpath("//a[contains(text(),'Notifications')]")).click();// Notifications
		System.out.println(driver.getCurrentUrl());// in defautl drive will present in the home page
		// String homewindow = driver.getWindowHandle();
		// System.out.println(homewindow);
		Set<String> multipleids = driver.getWindowHandles();
		// System.out.println(multipleids);
		Iterator<String> it = multipleids.iterator();
		System.out.println(it.hasNext());
		String homewindow1 = it.next();
		System.out.println(homewindow1);
		System.out.println(it.hasNext());
		String notifwindow = it.next();
		System.out.println(notifwindow);
		System.out.println(it.hasNext());
		String citywindow = it.next();
		System.out.println(citywindow);
		System.out.println(it.hasNext());
		String eticketwindow = it.next();

		System.out.println(eticketwindow);
		System.out.println(it.hasNext());
		driver.switchTo().window(citywindow);
		System.out.println("driver switched to city circular window");
		driver.findElement(By.xpath("//a[contains(text(),'features')]")).click();
		System.out.println("city circular features button cliked down");
		Thread.sleep(5000);
		driver.switchTo().window(eticketwindow);
		// driver.findElement(By.xpath("//div[@id='submitSearch']")).submit();
		// driver.close();// current browser will closed
		// driver.quit();// used to close the multiple eindows opened by the selenium
		Thread.sleep(2000);
		driver.switchTo().window(notifwindow);
		driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
