package Pallavi.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlineMobileSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		String PageTitle=d.getTitle();
		System.out.println(PageTitle);
		WebElement Search=d.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("mobile smartphones under 30000");
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		WebElement element = d.findElement(By.id("s-result-sort-select"));
		Select sel=new Select(element);
		List <WebElement> options = sel.getOptions();
        System.out.println("No.of options: "+ (options.size()-1)); 
        sel.selectByVisibleText("Newest Arrivals");
		WebElement Newest=d.findElement(By.id("s-result-sort-select_4"));
		boolean SelectedOption=Newest.isDisplayed();
		System.out.println(SelectedOption);
		if(SelectedOption=true) {
			System.out.println("SelectedOption is same as displayedoption");
		}
		else
		{
			System.out.println("SelectedOption is not same as displayedoption");
		}
		d.close();
	}
}
