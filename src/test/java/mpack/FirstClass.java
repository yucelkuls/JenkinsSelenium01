package mpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.time.Duration;

public class FirstClass {

    @Test
    public void test01(){
        String expectedUrl = "https://www.google.com/";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String urlOfThePAge = driver.getCurrentUrl();

        Assert.assertEquals(urlOfThePAge,expectedUrl);
        driver.close();
        driver.quit();
    }
}
