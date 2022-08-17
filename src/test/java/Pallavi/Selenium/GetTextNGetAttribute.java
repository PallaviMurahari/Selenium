package Pallavi.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextNGetAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
        String text = d.findElement(By.id("p1")).getText();
        System.out.println(text);
        WebElement un=d.findElement(By.id("input1"));
        WebElement pw=d.findElement(By.id("input2"));
        un.sendKeys("JAVA");
        pw.sendKeys("SELENIUM");
        String UserName1 =un.getAttribute("value");
        System.out.println(UserName1);
        String Password1 =pw.getAttribute("value");
        System.out.println(Password1);
        un.clear();
        pw.clear();
        d.close();
	}
}
