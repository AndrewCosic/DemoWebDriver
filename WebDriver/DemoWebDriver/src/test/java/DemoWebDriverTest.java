import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebDriverTest {
	
	static String browser;
	static WebDriver driver;
	
	

	public static void main(String[] args) {
		
		setBrowser();
		setBrowserConfig();
		runBrowser();
	}

	public static void setBrowser() {
		browser="Firefox";
		
	}
	
	public static void setBrowserConfig() {
		
		if(browser.contains("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "/home/andra/Documents/Auto/eclipse/jars/geckodriver");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		}
		
		if(browser.contains("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/home/andra/.config/google-chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}
	
	
	public static void runBrowser() {

		driver.get("https://github.com/");
//		driver.close();
	}
	
}
	
	
	