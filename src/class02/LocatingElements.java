package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of Webdriver
        WebDriver driver = new ChromeDriver();

        // open up facebook
        driver.get("https://www.facebook.com/");

        // send in the username
        driver.findElement(By.id("email")).sendKeys("gurcan");

        // send in the password
        driver.findElement(By.name("pass")).sendKeys("ccc44453gg");

        // click on the button create New Account
        //driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();

    }
}
