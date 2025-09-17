package WebAutomation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class valiadetlogin {
	
	@Test
	public void test() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	@Nullable
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	Assert.assertEquals(ActualTitle,"123");
	System.out.println("succesfully landed to the home page");
	}

}
