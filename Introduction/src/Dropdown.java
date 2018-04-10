import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/Default.aspx");
		Select s= new Select(driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_Adult']"));
		//s.selectByValue("3");
		//s.selectByIndex(3);
		int randomInt = (int)(8.0 * Math.random());
		String randomIntAsString = String.valueOf(randomInt);
		s.selectByVisibleText(randomIntAsString);
		System.out.println(randomIntAsString);
		//driver.quit();
		
	}

}