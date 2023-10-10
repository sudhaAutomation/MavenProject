package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSwhizzPortal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		String expTitle = "Welcome";
		System.out.println();
		String acttitile = driver.findElement(By.className("title")).getText();
		System.out.println(acttitile);
		if (acttitile.equals(expTitle)) {
			System.out.println("System logged in successfully");

		} else {
			System.out.println("System failed to login");

		}
		driver.findElement(By.linkText("Courses List")).click();
		String CExptitle="COURSES LIST";
		String acttitleC=driver.findElement(By.xpath("/html/body/div/section/div/div/section/header/div/h3")).getText();
		if (acttitleC.equals(CExptitle)) {
			System.out.println("System navigated to courses List page successfully");

		} else {
			System.out.println("System failed to  navigated to courses List page ");

		}
	
		//
		driver.close();
	}

}
