package intro_selenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Streams;

public class streamsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JPZ4373\\Documents\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<String> riceName;
		do{
		//Repeat until price is found 
		//traverse to rice
		//get rice WebElement
		List <WebElement> listNames = driver.findElements(By.xpath("//tr/td[1]"));
		riceName = listNames.stream().filter(s->s.getText().contains("Cherry")).map(s->getPrice(s)).collect(Collectors.toList());
		riceName.forEach(a->System.out.println(a));
		
		//check next page
		if(riceName.size()<1) {
			driver.findElement(By.xpath("//*[@aria-label='Next']")).click();
		}
		
		 
		
		}while(riceName.size()<1);
		
		
		//get rice price 
	}

	public static String getPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price ;	
	}

}