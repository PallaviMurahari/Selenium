package Pallavi.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://money.rediff.com/gainers/bse/daily/groupa");
		WebElement Value=d.findElement(By.xpath("//a[contains(text(),'Triveni Turbine')]/following::td[3]"));
		String Price=Value.getText();
		System.out.println("Current Price of Triveni Turbine: "+ Price);
	}

}
