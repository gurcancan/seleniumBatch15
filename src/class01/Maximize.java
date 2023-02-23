package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        driver.close();

    }
}
