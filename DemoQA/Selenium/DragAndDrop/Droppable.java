package com.DemoQA.Selenium.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {


    static void clickOnInteractionsTab(WebDriver driver){
        driver.findElement(By.xpath("//h5[text()='Interactions']")).click();
    }

    static void clickOnDroppableTab(WebDriver driver){
        driver.findElement(By.xpath("//span[text()='Droppable']")).click();
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        //clickOnInteractionsTab(driver);
        //clickOnDroppableTab(driver);
        Actions a = new Actions(driver);
        WebElement Dragabble = driver.findElement(By.id("draggable"));
        WebElement Droppable = driver.findElement(By.id("droppable"));
        a.dragAndDrop(Dragabble,Droppable).build().perform();

    }
}
