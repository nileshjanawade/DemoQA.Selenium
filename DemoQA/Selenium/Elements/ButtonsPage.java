package com.DemoQA.Selenium.Elements;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {

    static void clickOnElementsTab(WebDriver driver){
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
    }
    static void clickOnButtonsTab(WebDriver driver){
        driver.findElement(By.xpath("//span[text()='Buttons']")).click();
    }
    static void clickDoubleClickMeAndGetMessage(WebDriver driver,Actions a){
        a.moveToElement(driver.findElement(By.xpath("//button[text()='Double Click Me']"))).doubleClick().build().perform();
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
    }
    static void clickRightClickMeAndGetMessage(WebDriver driver,Actions a){
        a.moveToElement(driver.findElement(By.xpath("//button[text()='Right Click Me']"))).contextClick().build().perform();
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
    }
    static void clickRightClickMeAndGetMessage(WebDriver driver){
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        clickOnElementsTab(driver);
        clickOnButtonsTab(driver);
        Actions a = new Actions(driver);
        clickDoubleClickMeAndGetMessage(driver,a);
        clickRightClickMeAndGetMessage(driver,a);
        clickRightClickMeAndGetMessage(driver);
        driver.close();
    }
}
