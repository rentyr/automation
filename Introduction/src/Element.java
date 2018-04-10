import org.openqa.selenium.chrome.ChromeDriver;

public class Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		//driver.findElementById("email").sendKeys("testerqa12345@gmail.com");
		//driver.findElementByName("pass").sendKeys("renty123");
		//driver.findElementByLinkText("Forgotten account?").click();
	
		
		
		//driver.findElementByCssSelector("#email").sendKeys("test@test.com");
		//driver.findElementByCssSelector("#pass").sendKeys("12345");
		driver.findElementByXPath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a").click();
		driver.findElementByXPath("//*[@id='identify_email']").sendKeys("test@test.com");
		driver.findElementByName("did_submit").click();
		driver.quit();
	}

}
