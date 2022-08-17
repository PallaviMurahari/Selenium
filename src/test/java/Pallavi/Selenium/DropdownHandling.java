package Pallavi.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {

	private static final String Webelement = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
        WebElement element=d.findElement(By.id("mySelect"));
        Select select=new Select(element);
        //1.  select by index
        //select.selectByValue("pineapple");
        //2. select by value
        //select.selectByVisibleText("Banana");
        //select.selectByIndex(1);

        //3.  select by visible text
        List <WebElement> options = select.getOptions();
        for(int i=0;i<4;i++)
        {
        	String Alloptions = options.get(i).getText();
            System.out.println(Alloptions); // to print all the options of drop down
        }
	}

}
