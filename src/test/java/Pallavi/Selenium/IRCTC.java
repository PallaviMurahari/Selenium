package Pallavi.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Launch https://www.irctc.co.in web application, verify the correct page opened
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.irctc.co.in");
        String ExpTitle = d.getTitle();
        if(ExpTitle.equals("IRCTC Next Generation eTicketing System"))
        {
        	System.out.println("Titles matched");
        }
        else
        {
        	System.out.println("Titles not matched");
        }
        Thread.sleep(1000);
        //Accept the Alert message
        d.findElement(By.xpath("//button[@type='submit']")).click();
        //Enter "Hyd" in “From city” field, in the auto search results, select the "HYDERABAD DECAN - HYB" station
        d.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("HYB");
        d.findElement(By.xpath(("//*[@id='origin']//ul//li//span[contains(text(),'HYDERABAD DECAN - HYB')]"))).click();
        //Enter "Pune" in "To city” field, in the auto search results, select the "PUNE JN - PUNE" station
        d.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Pune");
        d.findElement(By.xpath("//*[@id='destination']//ul//li//span[contains(text(),'PUNE JN - PUNE')]")).click();
        //Choose future date after 4days from today in the journey date field
        d.findElement(By.xpath("//*[@id=\"pr_id_2_list\"]/li/span")).click();
        WebElement D=d.findElement(By.xpath("//*[@id=\"jDate\"]/span/input"));
        D.click();
        D.clear();
        Thread.sleep(5000);
        d.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']//tr[2]//td[6]")).click();
        Thread.sleep(5000);
        //Select "Sleeper Class" from all classes drop down box
        d.findElement(By.xpath("//span[contains(text(),'All Classes')]")).click();
        List<WebElement> options = d.findElements(By.xpath("//p-dropdown[@id='journeyClass']//ul//li/span"));
        for (WebElement option : options)
        {
        	String Text=option.getText();
        	if (Text.equals("Sleeper (SL)"))
            {
                option.click(); 
                break;
            }
        }
        Thread.sleep(4000);
        //Select the check box "Divyaang concession"
        d.findElement(By.xpath("//label[@for='concessionBooking']")).click();
        d.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
        Thread.sleep(4000);
        //Click on "Find trains" button
        d.findElement(By.xpath("//button[@label='Find Trains']")).click();
        Thread.sleep(5000);
        //Verify & Display the number of trains available and names on console
        WebElement  elements=d.findElement(By.xpath("(//div[@class='hidden-xs']//span)[1]"));
        System.out.println(elements.getText());
        List<WebElement> T = d.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));
        System.out.println("No. of Trains: " + T.size());
        for(int i = 0; i< T.size(); i++) {
           String s = T.get(i).getText(); 
           System.out.println("Available Train: " + s);
        }
        //Capture the results screenshot
		File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\SelePics\\IRCTC5.png"));
        //Close the Application
        d.close();
}
}






