package pages;

import config.ConfigurationSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage{
    static WebDriver driver = ConfigurationSetup.setUp();

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement brandsCategory(){
        WebElement brandsButton = driver.findElement(By.xpath("//a[contains(text(),'Brands')]"));
        return brandsButton;
    }
    public WebElement forYouCategory(){
        WebElement forYouButton = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]"));
        return forYouButton;
    }
    public WebElement tiraRedCategoty(){
        WebElement tiraRedButton = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]"));
        return tiraRedButton;
    }

}