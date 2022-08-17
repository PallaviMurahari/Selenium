package Pallavi.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
        WebElement Click=d.findElement(By.name("click"));
        WebElement Doubleclick=d.findElement(By.name("dblClick"));
        Actions action=new Actions(d);
        action.click(Click).build().perform();
        Alert alert =d.switchTo().alert();
        String alertmsg=alert.getText();
        System.out.println(alertmsg);
        Thread.sleep(4000);
        alert.accept(); 
        action.doubleClick(Doubleclick).build().perform();
        String alertmsg2=alert.getText();
        System.out.println(alertmsg2);
        alert.accept();
        System.out.println("Click & Doubleclick is performed");
	}

}
