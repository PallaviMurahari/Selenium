package Pallavi.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.deltadental.com/");
        WebElement element=d.findElement(By.linkText("For dentists"));
        Actions action=new Actions(d);// Wanted to perform action on driver. So passed web driver variable i.e., d to actions class
        action.moveToElement(element).build().perform();
        d.findElement(By.linkText("Dentist FAQ")).click();
        String Title=d.getTitle();
        System.out.println(Title);
        d.close();
	}

}
