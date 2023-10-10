package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentAppsDifferentTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Open the initial URL in the first tab
		driver.get("https://www.google.com");

		// Use JavaScript to open a new tab in the same window
		((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");

		// Get the handles of all open tabs
		java.util.Set<String> handles = driver.getWindowHandles();

		// Switch to the new tab (the second tab in the set)
		for (String handle : handles) {
			driver.switchTo().window(handle);
		}

		// Navigate to a different URL in the new tab
		driver.get("https://www.example.com");

		// Perform actions in the new tab
		// ...

		// Close the new tab (optional)
		// driver.close();

		// Switch back to the original tab (the first tab in the set)
		driver.switchTo().window(handles.iterator().next());

		// Perform actions in the original tab
		// ...

		// Close the browser when done
		// driver.quit();
	}

}
