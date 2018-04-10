import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
			
		
			System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://www.spicejet.com/Default.aspx");
			//System.out.println(driver.findElementById("StudentDiv").isSelected());
			//driver.findElementById("StudentDiv").click();
			//System.out.println(driver.findElementById("StudentDiv").isSelected());
			driver.findElementByXPath("//*[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']").click();
			Thread.sleep(5000);
			driver.quit();
			
}
}