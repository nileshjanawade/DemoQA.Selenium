package com.DemoQA.Selenium.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        String actual_Page_Title = "Text Box";
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        String expected_Page_Title = driver.findElement(By.xpath("//div[text()='Text Box']")).getText();
        if (actual_Page_Title.equals(expected_Page_Title)) {
            System.out.println("We are on - " + expected_Page_Title);
        } else {
            System.out.println("We are on wrong page");
        }
        TextBoxPage.fillFullNameTextBox(driver);
        TextBoxPage.enterEmialIdTextBox(driver);
        String current_address = "Om PG, near punjabi dhaba, Kharadi";
        String parmanent_address = current_address;
        TextBoxPage.enterCurrentAddressTextBox(driver, current_address);
        TextBoxPage.enterParmanentAddressTextBox(driver, parmanent_address);
        sumbitButton(driver);
        displayValidDetails(driver);

    }

    private static void fillFullNameTextBox(WebDriver driver)  {
        driver.findElement(By.id("userName")).sendKeys("Nilesh Janawade");
    }
    private static void enterEmialIdTextBox(WebDriver driver)  {
        driver.findElement(By.id("userEmail")).sendKeys("nileshjanawade@lcl.com");
    }
    private static void enterCurrentAddressTextBox(WebDriver driver,String address)  {
        driver.findElement(By.id("currentAddress")).sendKeys(address);
    }
    private static void enterParmanentAddressTextBox(WebDriver driver,String address)  {
        driver.findElement(By.id("permanentAddress")).sendKeys(address);
    }
    static void sumbitButton(WebDriver driver){
        driver.findElement(By.id("submit")).click();
    }
    static void displayValidDetails(WebDriver driver){
        System.out.println(driver.findElement(By.id("name")).getText());
        System.out.println(driver.findElement(By.id("email")).getText());
        System.out.println(driver.findElement(By.cssSelector("p#currentAddress")).getText());
        System.out.println(driver.findElement(By.cssSelector("p#permanentAddress")).getText());
    }
}
