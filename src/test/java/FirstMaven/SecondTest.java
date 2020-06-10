package FirstMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SecondTest {

	static WebDriver driver = FirstTest.a();

	@Test(priority = 1)
	public void secondprint1() {
		System.out.println("SecondTest 1");
		
	}

	@Test(priority = 2)
	public void openurl2() {
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());

	}

	@Test(priority = 4)
	public void secondprint2() {
		System.out.println("SecondTest2");
	}

	@Test(priority = 3)
	public void Screenshot2() throws Exception

	{
		
		TakesScreenshot sshot = ((TakesScreenshot) driver);
		File Sfile = sshot.getScreenshotAs(OutputType.FILE);
		File Dfile = new File("C:\\Selenium\\Work\\Screenshot\\MavenJava\\Sp2.png");
		// FileUtils F= new FileUtils();
		FileUtils.copyFile(Sfile, Dfile);
	}

}
