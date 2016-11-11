package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A {
	
	WebDriver driver= new FirefoxDriver();
	
	@Test
	public void test(){
		driver.get("http://www.facebook.com");
	}

}
