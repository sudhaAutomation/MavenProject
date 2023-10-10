
package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Upcoming Batches')]")).click();

		/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]
		//// td[contains(text(),'Lightning Web Components')]
		/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]
		//// tbody/tr[4]/td[4]
		/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]
		//// tbody/tr[2]/td[2]
		/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[7]
		//// td[contains(text(),'10000')]
		/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/a[1]
		//// tbody/tr[1]/td[8]/a[1]
		/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[8]/a[2]/i[1]
		//// tbody/tr[7]/td[8]/a[2]/i[1]

		int rows = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr"))
				.size();
		int cols = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td"))
				.size();
		System.out.println("no of rows " + rows);// 7
		System.out.println("no of columns " + cols);// 8
		String halfxpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		for (int i = 1; i <= rows; i++) {
			String theader = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th["
							+ i + "]"))
					.getText();
			System.out.print(theader + "    ");
		}
		System.out.println();
		
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= cols; j++) {

				String celldata = driver.findElement(By.xpath(halfxpath + i + "]/td[" + j + "]")).getText();
				System.out.print(celldata + "   ");
				if (celldata.equals("Hyderabad")) {
					// System.out.print(driver.findElement(By.xpath(halfxpath + i + "]")).getText()
					// + " ");
					driver.findElement(By.xpath(halfxpath + i + "]/td[8]/a[2]/i[1]")).click();// to edit the schedule
					driver.findElement(By.xpath(
							"//body/div[1]/section[1]/div[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]"))
							.clear();
					driver.findElement(By.xpath(
							"//body/div[1]/section[1]/div[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]"))
							.sendKeys("90days");
					driver.findElement(By.xpath(
							"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/form[1]/div[1]/div[2]/div[1]/input[1]"))
							.click();
					System.out.println(driver
							.findElement(
									By.xpath("//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]"))
							.getText());
					driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
					break;
				}
				

			}
			

		}
		driver.close();
	}

}
