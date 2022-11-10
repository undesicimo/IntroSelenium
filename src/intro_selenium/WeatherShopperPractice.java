package intro_selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherShopperPractice
{



    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://weathershopper.pythonanywhere.com/");
        String temperature = driver.findElement(By.id("temperature")).getText();
        String[] splitTemp = temperature.split(" ");
        String splitActualTemp = splitTemp[0].trim();
        int actualTemp = Integer.parseInt(splitActualTemp);

        /**気温が19度以下なら保湿剤を買う。気温が34度以上の場合は、日焼け止めをお買い求める*/
        if( actualTemp <= 16)
        {   
            driver.findElement(By.linkText("Buy moisturizers")).click();
        }else if(actualTemp >= 34 )
        {
            driver.findElement(By.linkText("Buy sunscreens")).click();
        }
       
        List <WebElement> productName = driver.findElements(By.cssSelector("div[class='text-center col-4']"));
        List<WebElement> aloeProducts = productName.stream().filter(s->s.getText().contains("Aloe")).collect(Collectors.toList());
      
        
        
        
        //String lowestPrice = prices.stream().sorted(Collections.reverseOrder()).findFirst().toString();
        
       
        

        List<Integer> prices = new ArrayList<>();
        for(int i = 0;i<aloeProducts.size();i++)
        {
           System.out.println(aloeProducts.get(i).getText()); 
           System.out.println ( "price is " + aloeProducts.get(i).findElement(By.xpath("//*[contains(text(),'Price')]")).getText());
           String a = aloeProducts.get(i).findElement(By.xpath("//*[contains(text(),'Price')]")).getText();
           String[] b =  a.split("Rs.");
           int actual= Integer.parseInt(b[1].trim());
            prices.add(actual);
        }
       System.out.println(prices);
    }
        
        

        
    }
    

    
