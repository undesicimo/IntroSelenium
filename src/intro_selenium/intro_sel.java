package intro_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro_sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JPZ4373\\Documents\\chromedriv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trade-milestone-tradingview-alpha1.linesec-apps-beta.com/");
		driver.findElement(By.className("XJp_Tw")).click();
		driver.findElement(By.name("tid")).sendKeys("financial.ltk+76@gmail.com");
		driver.findElement(By.name("tpasswd")).sendKeys("ltk0852");
		driver.findElement(By.className("MdBtn01")).click();
		driver.navigate().to("https://trade-milestone-tradingview-alpha1.linesec-apps-beta.com/stock/detail/6613/pro-chart");
		
	}

}
