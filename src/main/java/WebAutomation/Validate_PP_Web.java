package WebAutomation;

import java.security.DomainCombiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_PP_Web {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		
	}
	
}
