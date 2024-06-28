package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigurationSetup {



    public static WebDriver setUp() {
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.tirabeauty.com/");

        return driver;
    }
}
