package Pallavi.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
        String Title = d.getTitle();
        System.out.println(Title);
        if(Title.equals("the automation zone: Mix of Basic WebElements"))
        {
        	System.out.println("Titles matched");
        }
        else
        {
        	System.out.println("Titles mismatched");
        }
        String Title1= d.findElement(By.linkText("the automation zone")).getText();
        System.out.println(Title1);

	}
	

}
