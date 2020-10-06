package listenersdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MyFirstTestCase {
	
	@Test
	public void Title() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void titleMatch() {
		Assert.assertTrue(false);
	}
	

}
