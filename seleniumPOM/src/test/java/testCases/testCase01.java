package testCases;

import config.ConfigurationSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase01 {
    public void runTest() {
        WebDriver driver = ConfigurationSetup.setUp();

        driver.get("https://www.tirabeauty.com/");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        System.out.println("Asserting this page on basis of title which is - Tira: Shop Makeup, Skin, Hair & Beauty Products Online");
        if(pageTitle.equals("Tira: Shop Makeup, Skin, Hair & Beauty Products Online")){
            System.out.println("Title Assertion Passed");
        }else {
            System.out.println("Title Assertion Failed");
        }


        driver.quit();
    }

    public static void main(String[] args) {
        new testCase01();
    }
}
