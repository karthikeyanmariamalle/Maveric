package juno02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng01 {

	
	@Test (invocationCount =2)
	public void name() {
		System.out.println("first name ");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\juno02\\driver\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
	   driver.close();
}
}