package Pallavi.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PepperFry {

	public static void main(String[] args) {
		//Launch any browser as per the user input ex: Chrome/Firefox. 
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//Open the online shopping website ex: https://www.pepperfry.com/.
		d.get("https://www.pepperfry.com/.");
		//Validate the text “Online Furniture Shopping Store” in the title.
		  String ExpTitle = d.getTitle();
	        if(ExpTitle.equals("Online Furniture Shopping Store: Shop Online in India for Furniture, Home Decor, Homeware Products @ Pepperfry"))
	        {
	        	System.out.println("Titles matched");
	        }
	        else
	        {
	        	System.out.println("Titles not matched");
	        }
	    //Select “Furniture” and click on “Benches”. • Display the total benches with respect to its category 
	        d.findElement(By.xpath("//a[@rel='meta-furniture']")).click();
	        d.findElement(By.linkText("Seating")).click();
	        d.findElement(By.linkText("Benches")).click();
	        List<WebElement> B = d.findElements(By.xpath("//ul[@class='clip-main-cat-wrpr clip-main-wrap-cat']"));
	        List<WebElement> N = d.findElements(By.xpath("//li[@class='clip-main-cat carousel-cell ']"));
	        System.out.println("No. of Benches: " + N.size());
	        for(int i = 0; i< B.size(); i++) {
	           String s = B.get(i).getText(); 
	           System.out.println("Type of Bench: " + s);
	           WebElement I = d.findElement(By.xpath("//p[contains(text(),'16 options')]"));
	           System.out.println("No. available options of Industrial benches:"+ I.getText());
	           // Check whether “Industrial Benches” are more than one
	           String E=I.getText().split(" ")[0];
	           int Count=Integer.parseInt(E);
	           System.out.println("No. of Industrial benches:"+Count);
	           if(Count>1)
	           {
	        	   System.out.println("Industrial benches are morethan 1: 16 options");
	           }
	           else
	           {
	        	   System.out.println("Industrial benches are not available");
	           }
	           //Close the browser
	           d.close();
	        }
	}
}

	


