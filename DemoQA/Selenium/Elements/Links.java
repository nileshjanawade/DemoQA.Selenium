package com.DemoQA.Selenium.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Links {

    static void clickOnElementsTab(WebDriver driver){
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
    }

    static void clickOnLinkTab(WebDriver driver){
        driver.findElement(By.xpath("//span[text()='Links']")).click();
    }
//    static void clickOnHomeTab(WebDriver driver){
//        driver.findElement(By.id("simpleLink")).click();
//    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        clickOnElementsTab(driver);
        clickOnLinkTab(driver);
        driver.findElement(By.id("simpleLink")).click();
        Set<String> Windows = driver.getWindowHandles();
        Iterator<String> i = Windows.iterator();
        String Window1 = i.next();
        String Window2 = i.next();
        driver.switchTo().window(Window2);
        driver.close();
        driver.switchTo().window(Window1);
        driver.findElement(By.id("dynamicLink")).click();
        Set<String> Tabs = driver.getWindowHandles();
        Iterator<String> t = Tabs.iterator();
        String Tab1 = t.next();
        String Tab2 = t.next();
        driver.switchTo().window(Tab2);
        clickOnElementsTab(driver);

    }
}
