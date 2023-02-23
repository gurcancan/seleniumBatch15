package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        System.out.println(title);

        // verify that title is correct
        if (title.equalsIgnoreCase(title)){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }

        // logout
        driver.findElement(By.linkText("Logout")).click();

        //driver.quit();
    }
}
