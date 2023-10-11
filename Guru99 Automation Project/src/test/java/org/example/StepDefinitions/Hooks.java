package org.example.StepDefinitions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Hooks {
    public static WebDriver driver;
@BeforeClass
    public static void open_Browser(){


    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    driver.manage().window().maximize();
    driver.get("http://live.techpanda.org/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
}
@AfterClass
    public static void close_Browser(){
    driver.quit();
}

}
