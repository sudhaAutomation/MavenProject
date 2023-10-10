package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CategoryListParamscp {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "url", "username", "password" })
	public void beforeMethod(String browser, String url, String username, String password) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
	}

	@DataProvider
	public String[][] dp() throws IOException {
		return getData();
	}

	@Test(dataProvider = "dp")
	public void addCategoryTestCase(String CategoryName, String SortOrder, String MetaTitle, String MetaDescription,
			String MetaKeywords, String results) {

		driver.findElement(By.xpath("//span[contains(text(),'Categories List')]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath(
				"//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
				.sendKeys(CategoryName);
		driver.findElement(By.xpath(
				"//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"))
				.sendKeys(SortOrder);
		driver.findElement(By.xpath(
				"//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]"))
				.sendKeys(MetaTitle);
		driver.findElement(By.xpath(
				"//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]"))
				.sendKeys(MetaDescription);
		driver.findElement(By.xpath(
				"//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"))
				.sendKeys(MetaKeywords);
		driver.findElement(By.xpath(
				"//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[6]/input[1]"))
				.click();
		String message = driver
				.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]"))
				.getText();
		System.out.println("message");
		if ("pass".equals(results)) {
			Assert.assertTrue(message.contains("successfully"));
		} else {
			Assert.assertTrue(message == null || message.trim().isEmpty());
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	public String[][] getData() throws IOException {

		XLUtility xl = new XLUtility(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Java_Training\\excelFiles\\testdata.xlsx");
		int rowcount = xl.getRowCount("addCategory");
		int colcount = xl.getCellCount("addCategory", 2);
		System.out.println("rows:" + rowcount + " cols: " + colcount);
		String data[][] = new String[rowcount][colcount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				data[i][j] = xl.getCellData("addCategory", i + 2, j);
			}
			System.out.println(Arrays.toString(data[i]));
		}

		System.out.println("Number of records: " + data.length);
		return data;
	}
}
