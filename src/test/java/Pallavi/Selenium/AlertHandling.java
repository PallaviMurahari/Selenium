package Pallavi.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("http://www.uitestpractice.com/students/switchto");
        d.findElement(By.id("confirm")).click();
        Alert alert =d.switchTo().alert();
        //System.out.println(alert.getText());
        String alertmsg=alert.getText();
        System.out.println(alertmsg);
        Thread.sleep(4000);
        //alert.accept(); // clicks on ok
        alert.dismiss(); // clicks on cancel
        String confmsg=d.findElement(By.id("demo")).getText();
        System.out.println(confmsg);

	}

}
