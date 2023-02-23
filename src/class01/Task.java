package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        Thread.sleep(3000);
        driver.close();

    }
}
