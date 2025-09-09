package WebAutomation;

import java.security.DomainCombiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validate_PP_Web {

	
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		
	}
	
}
