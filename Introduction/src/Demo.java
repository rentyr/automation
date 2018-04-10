import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main( String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https://google.com");
		driver.navigate().back();
		driver.quit();
	}

}
