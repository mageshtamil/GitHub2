package FirstMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	static WebDriver driver;
	static String homepage = "https://www.google.com";
	
	@Test(priority = 1)
	public void firstprint1() {
		System.out.println("FirstTest1");
	}

	@Test(priority = 2)
	public static WebDriver a() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	
	
	//private static WebDriver driver() {
		// TODO Auto-generated method stub
	//	return null;
	//}

	@Test(priority = 3)
	public void openurl1() throws InterruptedException, IOException {
		driver.get(homepage);
		// Thread.sleep(5000);
		driver.manage().window().maximize();
		
		   
		//driver.findElement(By.xpath("//*[@id='navmenu-2']")).click();

		Thread.sleep(1000);
	}
	@Test(priority = 4)
	public void firstprint2() {
		System.out.println("FirstTest2");
	}

	@Test(priority = 5)
	public void Screenshot1() throws Exception

	{
		TakesScreenshot sshot = ((TakesScreenshot) driver);
		File Sfile = sshot.getScreenshotAs(OutputType.FILE);
		File Dfile = new File("C:\\Selenium\\Work\\Screenshot\\MavenJava\\Sp1.png");
		// FileUtils F= new FileUtils();
		FileUtils.copyFile(Sfile, Dfile);

	}
}