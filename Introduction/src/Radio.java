import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/renty/Desktop/Selenium_New/Driver/chromedriver");
		ChromeDriver driver= new ChromeDriver();	
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElementByXPath("//input[@value='Milk']").click();
		//System.out.println(driver.findElementsByXPath("//input[@name='group1']").size());
		
		int count= driver.findElementsByXPath("//input[@name='group1']").size();
		
		for (int i=0;i<count;i++);
		{
			driver.findElementsByXPath("//input[@name='group1']").get(i).click();
			//System.out.println(driver.findElementsByXPath("//input[@name='group1']").get(i).getAttribute("value"));
		}
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
