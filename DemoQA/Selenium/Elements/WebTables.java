package com.DemoQA.Selenium.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class WebTables {


    static void clickOnElementsTab(WebDriver driver){
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
    }
    static void clickOnWebTableTab(WebDriver driver){
        driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
    }
    static void getFirstRowFirstName(WebDriver driver){
        String FirstName = driver.findElement(By.xpath("//div[text()='First Name']//following::div[@class='rt-tr -odd'][1]/div[1]")).getText();
        System.out.println("First Name :- "+FirstName);
    }
    static void getFirstRowLastName(WebDriver driver){
        String LastName = driver.findElement(By.xpath("//div[text()='Last Name']//following::div[@class='rt-tr -odd'][1]/div[2]")).getText();
        System.out.println("Last Name:- "+LastName);
    }
    static void getFirstRowAge(WebDriver driver){
        String Age = driver.findElement(By.xpath("//div[text()='Age']//following::div[@class='rt-tr -odd'][1]/div[3]")).getText();
        System.out.println("Age:- "+Age);
    }
    static void getFirstRowEmail(WebDriver driver){
        String Email = driver.findElement(By.xpath("//div[text()='Email']//following::div[@class='rt-tr -odd'][1]/div[4]")).getText();
        System.out.println("Email:- "+Email);
    }
    static void getFirstRowSalary(WebDriver driver){
        String Salary = driver.findElement(By.xpath("//div[text()='Salary']//following::div[@class='rt-tr -odd'][1]/div[5]")).getText();
        System.out.println("Salary:-"+Salary);
    }
    static void getFirstRowDepartment(WebDriver driver){
        String Department = driver.findElement(By.xpath("//div[text()='Department']//following::div[@class='rt-tr -odd'][1]/div[6]")).getText();
        System.out.println("department:- "+Department);
    }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\InteiJ\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        clickOnElementsTab(driver);
        clickOnWebTableTab(driver);
        getFirstRowFirstName(driver);
        getFirstRowLastName(driver);
        getFirstRowAge(driver);
        getFirstRowEmail(driver);
        getFirstRowSalary(driver);
        getFirstRowDepartment(driver);
    }

}
