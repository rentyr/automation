import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElementById("username").sendKeys("text@text.com");
		driver.findElementByName("pw").sendKeys("123456");
		driver.findElementByXPath("//*[@id='Login']").click();
		System.out.println(driver.findElementByXPath("//*[@id='error']").getText());
		
		
		driver.quit();
		
		
	}

}
