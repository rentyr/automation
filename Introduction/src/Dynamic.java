import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/Default.aspx");
		driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']").click();
		driver.findElementByXPath("//*[@id='dropdownGroup1']/div/ul[2]/li[3]/a").click();
		driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']").click();
		driver.findElementByXPath("(//*[@text='Chennai (MAA)'])[2]").click();
	
		Thread.sleep(1000);
		driver.quit();
	}

}
