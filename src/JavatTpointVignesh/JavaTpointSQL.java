package JavatTpointVignesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaTpointSQL {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.javatpoint.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions Act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='link']/div/ul/li[6]/a"));
		Act.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
