package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {
WebDriver driver;
@Test
    public void openurl() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("attarde@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("abcd12345");
        driver.findElement(By.name("login")).click();

    }
    }
