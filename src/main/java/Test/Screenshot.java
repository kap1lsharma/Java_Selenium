package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String destination = System.getProperty("user.dir", "\\Users\\Admin" + "sample.png");
		Files.copy(f, new File("C:\\Users\\Admin.sample.png"));

	}

}
