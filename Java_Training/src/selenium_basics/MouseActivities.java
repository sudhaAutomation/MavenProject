package selenium_basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActivities {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		// act.dragAndDrop(source, target).build().perform();

		act.clickAndHold(source).moveToElement(target).release().build().perform();
	}

	public static void epfo() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.epfindia.gov.in/site_en/index.php#");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Exempted Es"))).build().perform();
		// driver.findElement(By.partialLinkText("List of Exempted Est")).click();
		// act.click(driver.findElement(By.partialLinkText("List of Exempted
		// Est"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("")))).click();
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id(""))));
		// act.contextClick(driver.findElement(By.partialLinkText("Exempted
		// Es"))).build().perform();

	//	FluentWait waitf = new FluentWait(driver);
		//waitf.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id(""))))
		//.ignoring(NoSuchElementException.class).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
				

		//act.moveToElement(driver.findElement(By.partialLinkText("Exempted Es"))).contextClick().build().perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[contains(text(),'Directory')]"))).build().perform();
	}

}
