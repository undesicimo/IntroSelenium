package intro_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JPZ4373\\Documents\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("INR");
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(2000);
		
		/* int i = 1;
		while (i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		} */
		
		
		
		for (int i = 1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
