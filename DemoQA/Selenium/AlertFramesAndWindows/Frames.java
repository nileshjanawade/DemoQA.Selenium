package com.DemoQA.Selenium.AlertFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        String Text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(Text);
    }
}
