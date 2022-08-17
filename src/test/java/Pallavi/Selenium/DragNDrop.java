package Pallavi.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
        WebElement draggableicn=d.findElement(By.id("draggable"));
        WebElement droppableicn=d.findElement(By.id("droppable"));
        Actions action=new Actions(d);
        action.dragAndDrop(draggableicn, droppableicn).build().perform();
        System.out.println("Drag N Drop is performed");

	}

}
