package FirstMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	
	FirstTest abc= new FirstTest();
WebDriver driver = abc.a();
	
	@Test(priority = 1)
	public void thirdprint1()
	{
		System.out.println("ThirdTest 1");
	}
	@Test(priority = 2)
	 public void openurl3() throws InterruptedException, IOException 
	 {
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.get("http://yahoo.com");
	 }
	@Test(priority = 4)
	public void thirdprint2() {
		System.out.println("ThirdTest2");
	}

	@Test(priority = 3)
	public void Screenshot3() throws Exception

	{
		TakesScreenshot sshot = ((TakesScreenshot) driver);
		File Sfile = sshot.getScreenshotAs(OutputType.FILE);
		File Dfile = new File("C:\\Selenium\\Work\\Screenshot\\MavenJava\\Sp3.png");
		// FileUtils F= new FileUtils();
		FileUtils.copyFile(Sfile, Dfile);

	}

	 }
