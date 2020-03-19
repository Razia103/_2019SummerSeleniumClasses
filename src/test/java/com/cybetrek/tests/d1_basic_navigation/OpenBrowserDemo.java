package com.cybetrek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();// only this opens new window

        //for main method quick..shortcuts. are:psvm/ main /Syso/sout
        // we created an object in the class, but not recognizes if we don't add dependenct
        // to import class on  windows :alt+enter
        //option+center  Mac

        //we have to enter this line everytime we want to open
        //whithout it we get exception
//        WebDriverManager.chromedriver().setup();

        //under this part is selenium
        //WebDriver driver= new ChromeDriver();
        //webdriver-->represents the browser
        // new ChromeDriver(); --> this line opens chrome browser()


        driver.get("https://cybertekschool.com/");// waits for page to load
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().to("https://cybertekschool.okta.com/");
        // does not wait for page to load
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.close();


    }
}
