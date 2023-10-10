package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// will launches our chrome browser
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");

		//WebDriver driver1 = new EdgeDriver();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");

		WebDriver driver2 = new FirefoxDriver();
	
		
		//driver1.manage().window().maximize();
		//driver1.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		

		Thread.sleep(3000);
		//driver.close();

	}

}
