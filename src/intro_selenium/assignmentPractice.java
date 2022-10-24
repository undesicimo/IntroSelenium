package intro_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmentPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JPZ4373\\Documents\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String userName = driver.findElement(By.xpath("//p[@class='text-center text-white']/b[1]")).getText();
		String passWord = driver.findElement(By.xpath("//p[@class='text-center text-white']/b[2]")).getText();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-info']")));
		List <WebElement> products = driver.findElements(By.xpath("//*[@class='btn btn-info']"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout"));
		
		
		
	}

}
