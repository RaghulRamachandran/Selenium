package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();



            driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//        driver.findElement(By.xpath("//[@name='firstname']")).click();
            driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Ram");
        driver.findElement(By.name("lastname")).sendKeys("Anna");
        driver.findElement(By.cssSelector("input.id")).sendKeys("89889988");


    }
}