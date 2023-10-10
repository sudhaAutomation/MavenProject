package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {// elemnets or feilds in the web Page
	// isDispalyed..boolean
	// isSelected
	// isEnabled

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		boolean signup = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).isDisplayed();//every element in the web page
		if (signup) {
			System.out.println("System diplayed the sign up page successfully");
		} else {
			System.out.println("System not diplayed the sign up page successfully");

		}
		
		System.out.println("sign up title is displayed successfully in the sign up page " + signup);
		boolean before = driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected();//for the check boxes and radio buttons
		System.out.println("radio button checked is " + before);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		boolean after = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/input[1]"))
				.isSelected();
		boolean enable = driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isEnabled();
		System.out.println("enable method output is " + enable);// true
		System.out.println("radio button checked is " + after);

		driver.close();
	}

}
