package Pallavi.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationForm {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("http://www.uitestpractice.com/Students/Form");
        WebElement FN=d.findElement(By.id("firstname"));
        FN.sendKeys("Pallavi");
        WebElement LN=d.findElement(By.id("lastname"));
        LN.sendKeys("M");
        String FirstName = FN.getAttribute("value");
        System.out.println("FirstName:"+ FirstName);
        String LastName = LN.getAttribute("value");
        System.out.println("LastName:"+ LastName);
        WebElement M=d.findElement(By.xpath("//input[@name='optradio']"));
        M.click();
        String Martial  = M.getText();
        System.out.println("Martial Status:"+ Martial);
        WebElement H=d.findElement(By.xpath("//input[@value='dance']"));
        H.click();
        String Hobby  = H.getAttribute("Value");
        System.out.println("Hobby:"+ Hobby);
        WebElement CN=d.findElement(By.id("sel1"));
        String Country = CN.getAttribute("value");
        System.out.println("Country:"+ Country);
        WebElement D=d.findElement(By.id("datepicker"));
        D.sendKeys("07/21/2022");
        String DOB = D.getAttribute("value");
        System.out.println("Date of Birth:"+ DOB);
        WebElement PH=d.findElement(By.id("phonenumber"));
        PH.sendKeys("9900990090");
        String PhoneNumber = PH.getAttribute("value");
        System.out.println("PhoneNumber:"+ PhoneNumber);
        WebElement UN=d.findElement(By.id("username"));
        UN.sendKeys("Pallavi2203");
        String username = PH.getAttribute("value");
        System.out.println("UserName:"+ username);
        WebElement EID=d.findElement(By.id("email"));
        EID.sendKeys("Pallavi2203@gmail.com");
        String EMID = EID.getAttribute("value");
        System.out.println("Email:"+ EMID);
        WebElement YR=d.findElement(By.id("comment"));
        YR.sendKeys("A SoftwareTester");
        String AYR = YR.getAttribute("value");
        System.out.println("About Yourself :"+ AYR);
        WebElement PW=d.findElement(By.id("pwd"));
        PW.sendKeys("********");
        String Pass = PW.getAttribute("value");
        System.out.println("Password:"+ Pass);
        d.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Application Submitted Successfully");
        d.close();
	}

}
