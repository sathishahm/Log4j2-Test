import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLog4j {

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger(TestLog4j.class.getName()); // classs name shouble written here
		log.debug("The test execution has started");
		System.setProperty("webdriver.chrome.driver","C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		log.debug("Chrome browser aunched");
		driver.get("http://omayo.blogspot.com/"); // main window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		log.debug("MAximize and added implesit wait");

		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("compendiumdev")).click();
		log.debug("Open the browser window and clic on URL");
		driver.getTitle();
		driver.navigate().back();
		driver.navigate().forward();
		log.debug("Forward and backward executed");
		
		if (driver.getTitle().equals("Basic Web Page Titleaa")) {
		
			//System.out.println("The Title of the web page is Correct");  instead of this below used
			
			log.info("The Title of the web page is Correct");
			
		} else {

			//System.out.println("The Title of the web page is Not Correct");
			
			log.error("The Title of the web page is Not Correct");
		}

		driver.close();
		log.debug("verifies the title and close the browser");
	}

}
