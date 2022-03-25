package com.DemoQA.Selenium.AlertFramesAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

    static void ClickOnAlertButton(WebDriver driver){
        driver.findElement(By.id("alertButton")).click();
    }

    static void AcceptAlertPopUp(WebDriver driver){
        driver.switchTo().alert().accept();
    }
    static void DismissAlertPopUp(WebDriver driver){
        driver.switchTo().alert().dismiss();
    }
    static void ClickOnTimerAlertButton(WebDriver driver){
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait w = new WebDriverWait(driver,5);
        w.until(ExpectedConditions.alertIsPresent());
    }
    static void ClickOnConfirmButton(WebDriver driver){
        driver.findElement(By.id("confirmButton")).click();
    }
    static void DisplayMessage(WebDriver driver){
        System.out.println(driver.findElement(By.id("confirmResult")).getText());
    }
    static void ClickOnConfirmResult(WebDriver driver){
        driver.findElement(By.id("confirmButton")).click();
    }
    static void ClickOnPromtButton(WebDriver driver){
        driver.findElement(By.id("promtButton")).click();
    }
    static void EnterNameOnAlert(WebDriver driver){
        driver.switchTo().alert().sendKeys("Nilesh");
    }

    static void CloseWindow(WebDriver driver){
        driver.close();
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        ClickOnAlertButton(driver);
        AcceptAlertPopUp(driver);
        ClickOnTimerAlertButton(driver);
        AcceptAlertPopUp(driver);
        ClickOnConfirmButton(driver);
        AcceptAlertPopUp(driver);
        DisplayMessage(driver);
        ClickOnConfirmResult(driver);
        DismissAlertPopUp(driver);
        DisplayMessage(driver);
        ClickOnPromtButton(driver);
        EnterNameOnAlert(driver);
        AcceptAlertPopUp(driver);
        System.out.println(driver.findElement(By.id("promptResult")).getText());
        CloseWindow(driver);
    }
}
