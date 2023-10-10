package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownLoadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("generate file displayed  is "
				+ driver.findElement(By.xpath("//button[@id='createTxt']")).isDisplayed());

		System.out.println(
				"generate file enabled is " + driver.findElement(By.xpath("//button[@id='createTxt']")).isEnabled());
		System.out.println(
				"generate file selected is " + driver.findElement(By.xpath("//button[@id='createTxt']")).isSelected());
		// driver.close();

		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing notes is downloaded");
		System.out.println("download link is displayed is "
				+ driver.findElement(By.xpath("//a[@id='link-to-download']")).isDisplayed());
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();// generate file button
		System.out.println("download link is displayed is "
				+ driver.findElement(By.xpath("//a[@id='link-to-download']")).isDisplayed());

		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();// download link

	}

}
