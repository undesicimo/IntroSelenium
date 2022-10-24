package intro_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JPZ4373\\Documents\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> multWind = windows.iterator();
		String parentWindow = multWind.next();
		String secondWindow = multWind.next();
		driver.switchTo().window(secondWindow);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println( driver.findElement(By.xpath("//h3")).getText());
			
		
	}

}
