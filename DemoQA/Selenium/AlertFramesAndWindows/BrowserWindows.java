package com.DemoQA.Selenium.AlertFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindows {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.findElement(By.id("tabButton")).click();
        Set<String> Tabs = driver.getWindowHandles();
        Iterator<String> i=Tabs.iterator();
        String ParentTab = i.next();
        String ChildTab  = i.next();
        driver.switchTo().window(ChildTab);
        String Text1 =driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(Text1);
        driver.close();
        driver.switchTo().window(ParentTab);

        driver.findElement(By.id("windowButton")).click();
        Set<String> Windows = driver.getWindowHandles();
        Iterator<String> i1 = Windows.iterator();
        String ParentWindow =i1.next();
        String ChildWindow = i1.next();
        driver.switchTo().window(ChildWindow);//sampleHeading
        String Text2 =driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(Text2);
        driver.close();
        driver.switchTo().window(ParentWindow);

        driver.findElement(By.id("messageWindowButton")).click();
        Set<String> WindowMessage = driver.getWindowHandles();
        Iterator<String> i2 = WindowMessage.iterator();
        String ParentWindowMsg =i2.next();
        String ChildWindowMsg = i2.next();
        driver.switchTo().window(ChildWindowMsg);
        String Text3 =driver.findElement(By.tagName("body")).getText();
        System.out.println(Text3);
        driver.close();
    }
}
