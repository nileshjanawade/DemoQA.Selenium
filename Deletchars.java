package com.DemoQA.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Deletchars {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).sendKeys("Nilesh");
        Thread.sleep(2000);
        driver.findElement(By.id("userName")).clear();
        driver.findElement(By.id("userName")).sendKeys("Neha");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.id("userName"));
        ele.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        Thread.sleep(2000);
        driver.findElement(By.id("userName")).sendKeys("Roshani");
        for (int i=0;i<2;i++) {
            ele.sendKeys(Keys.BACK_SPACE);
        }
        Thread.sleep(3000);
        ele.sendKeys(Keys.HOME);
        for (int i=0;i<2;i++) {
            ele.sendKeys(Keys.DELETE);
        }

        driver.close();
    }
}
