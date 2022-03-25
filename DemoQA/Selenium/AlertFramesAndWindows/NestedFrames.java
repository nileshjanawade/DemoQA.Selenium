package com.DemoQA.Selenium.AlertFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        String OutterText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
        System.out.println(OutterText);

        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        String InnerText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        System.out.println(InnerText);
    }
}
