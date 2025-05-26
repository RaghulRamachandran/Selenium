import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorrPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
//        driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
//        driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
//        driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
//        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rasfsf");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dsfadsfgadga");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dsfadsfgadga");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("3253454235");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
    }
}
