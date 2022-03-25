package com.DemoQA.Selenium.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {


    static void clickOnElementsTab(WebDriver driver){
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
    }
    static void clickOnCheckBoxTab(WebDriver driver){
        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
    }
    static void selectYesRadioButton(WebDriver driver){
        driver.findElement(By.xpath("//label[text()='Yes']")).click();////preceding::input[@id='yesRadio']
    }
    static void selectImpressiveRadioButton(WebDriver driver){
        driver.findElement(By.xpath("//label[text()='Impressive']")).click();////preceding::input[@id='impressiveRadio']
    }
    static void displayMessage(WebDriver driver){
        String selectedRadioButton = driver.findElement(By.cssSelector("//span[@class='text-success']//parent::p")).getText();
        System.out.println(selectedRadioButton);
    }
    static boolean checkNoRadioButton(WebDriver driver){
        boolean value = driver.findElement(By.id("noRadio")).isEnabled();
        System.out.println("Is No radio button enabled? -"+value);
        return value;
    }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        clickOnElementsTab(driver);
        clickOnCheckBoxTab(driver);
        selectYesRadioButton(driver);
        displayMessage(driver);
        selectImpressiveRadioButton(driver);
        displayMessage(driver);
        checkNoRadioButton(driver);
        driver.close();
    }
}
