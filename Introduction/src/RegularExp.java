import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExp {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//WebElement x = new WebElement();
		driver.get("https://www.google.co.in/");
		driver.findElementByXPath("//*[@id='viewport']/div[3]/div/div/div/div/div/div[2]/a").click();
		driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("apple");
		//driver.findElementByXPath("//*[@id='lst-ib']").sendKeys(Keys.RETURN);
		//WebElement.sendKeys(Keys.RETURN);
		driver.findElementByXPath("//*[@id='mKlEF']/span/*").click();
		driver.findElementByXPath("//*[@id='isr_chc']/div/div[2]/div[1]/a/span").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id='isr_chc']/div/div[1]/div/a/span[2]").click();
		//driver.quit();
	}

}
