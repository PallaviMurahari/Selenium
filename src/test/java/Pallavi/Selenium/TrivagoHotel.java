package Pallavi.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrivagoHotel {

	public static void main(String[] args) throws InterruptedException {
		// • Open the application https://www.trivago.in/ in chrome or fire fox browser. 
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.trivago.in/");
        //• In search field, enter City “Mumbai” as destination 
        d.findElement(By.id("input-auto-complete")).sendKeys("Mumbai");
        Thread.sleep(1000);
        d.findElement(By.xpath("//*[@id=\"react-autowhatever-1--item-0\"]//div//div//div[2]//div[1]//span//mark[contains(text(),'Mumbai')]")).click();
        d.findElement(By.xpath("//span[@class='absolute w-2 h-2 bg-grey-900 transform rotate-45 -translate-y-1/2 top-1/2 -translate-x-1/2 left-0']")).click();
        d.findElement(By.xpath("//span[@class='absolute w-2 h-2 bg-grey-900 transform rotate-45 -translate-y-1/2 top-1/2 translate-x-1/2 right-0']")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]//main//div[3]//div[2]//div//div[3]//div//div//form//div[4]//div//div//div[2]//div//div[1]//div//button[1]//span")).click();
        d.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
        d.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
        Thread.sleep(30000);
        d.findElement(By.xpath("//select[@id='sorting-selector']//option[5]")).click();
        Thread.sleep(10000);
        List<WebElement> H = d.findElements(By.xpath("//button[@data-testid='item-name']//span[@itemprop='name']"));
        System.out.println("No. of Hotels: " + H.size());
        for(int i = 0; i< H.size(); i++) {
           String A = H.get(i).getText(); 
          System.out.println("Available Hotels: " + A);
          List<WebElement> Rlist=d.findElements(By.xpath("//span[@itemprop='ratingValue']"));
          for(int k = i; k< Rlist.size();k++)
          { 
            String R=Rlist.get(k).getText(); 
             System.out.println("Rating: "+R);
             if(R.equals(R))
             {
             break;
             }
          }
          List<WebElement> Plist=d.findElements(By.xpath("//p[@itemprop='price']"));
           for(int j = i; j< Plist.size(); j++)
           { 
               String P=Plist.get(j).getText();
               System.out.println("rent: "+P);
               if(P.equals(P))
               {
               break;
               }
           }
           
        }
   
          System.out.println("Ratings of the Hotels are in descending order");

	}
	
}
	


        


	


