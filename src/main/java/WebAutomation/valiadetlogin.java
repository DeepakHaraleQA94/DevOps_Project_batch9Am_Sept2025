package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class valiadetlogin {
	
	@Test
	public void test() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		System.out.println("hi");
	}

}
