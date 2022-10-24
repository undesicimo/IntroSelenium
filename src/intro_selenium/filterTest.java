package intro_selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JPZ4373\\Documents\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Check filter is showing sent key as a result
		//Send key to form
		driver.findElement(By.id("search-field")).sendKeys("Mangoa");
		List <WebElement> fruitNames = driver.findElements(By.xpath("//*/td[1]"));
		List <WebElement> searchedFruit= fruitNames.stream().filter(fruitName->fruitName.getText().contains("Mango")).collect(Collectors.toList());
		if(fruitNames.size()==searchedFruit.size()) {
			System.out.println("Its there");
		}
			else {
				System.out.println("Its not there");
			
		}
		
	}

}
