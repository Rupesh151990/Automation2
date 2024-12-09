package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestUtils;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/configuration/config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions op = new ChromeOptions();
			op.addArguments("");
			driver = new ChromeDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public void extentSparkReprot() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);

	}

	
	public  void takeScreenShotFailedTC()  {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("E:\\Eclipse Program2024\\AutomationSample\\ScreenShots"));
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
		
	}

}
