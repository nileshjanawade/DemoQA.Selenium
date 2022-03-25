package com.DemoQA.Selenium.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPage {

    static String homeExpandToggle ="//span[text()='Home']//preceding::button[@title='Toggle']";
    static String documentExpandToggle = "//span[text()='Documents']//preceding::button[@title='Toggle'][1]";
    static String officeExpandToggle ="//span[text()='Office']//preceding::button[@title='Toggle'][1]";
    static String privateExpandToggle="//span[text()='Private']//parent::label/span[1]";

     static void clickOnPrivateCheckbox(WebDriver driver){
        driver.findElement(By.xpath(CheckBoxPage.homeExpandToggle)).click();
        driver.findElement(By.xpath(CheckBoxPage.documentExpandToggle)).click();
        driver.findElement(By.xpath(CheckBoxPage.officeExpandToggle)).click();
        driver.findElement(By.xpath(CheckBoxPage.privateExpandToggle)).click();
        System.out.println(driver.findElement(By.cssSelector("div#result")).getText());

    }

    static void clickOnElementsTab(WebDriver driver){
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
    }
    static void clickOnCheckBoxTab(WebDriver driver){
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        clickOnElementsTab(driver);
        clickOnCheckBoxTab(driver);
        //driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        clickOnPrivateCheckbox(driver);

    }
}
