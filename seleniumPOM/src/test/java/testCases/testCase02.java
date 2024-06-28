package testCases;

import config.ConfigurationSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.homePage;

public class testCase02 {
    WebDriver driver;
    homePage homePage;

    @BeforeClass
    public void setUp() {
        driver = ConfigurationSetup.setUp();
        homePage = new homePage(driver);
    }

    @Test
    public void testBrandsCategory() {
        try {

            WebElement brandsCategoryButton = homePage.brandsCategory();
            String brandsCategoryText = brandsCategoryButton.getText();
            System.out.println("Brands Category Text: " + brandsCategoryText);
            String expectedText = "Brands";
            System.out.println("Asserting for Brands Category Text");
            Assert.assertEquals(brandsCategoryText, expectedText, "Assertion for Brands Category Text failed");
        } catch (Exception e) {
            System.out.println("Error performing actions on Brands category - " + e.getMessage());
        }
    }

    @Test
    public void testForYouCategory() {
        try {
            WebElement forYouCategoryButton = homePage.forYouCategory();
            String forYouCategoryText = forYouCategoryButton.getText();
            System.out.println("For You Category Text: " + forYouCategoryText);

            String expectedText = "For You";
            System.out.println("Asserting for For You Category Text");
            Assert.assertEquals(forYouCategoryText, expectedText, "Assertion for For You Category Text failed");
        } catch (Exception e) {
            System.out.println("Error performing actions on For You category - " + e.getMessage());
        }
    }

    @Test
    public void testTiraRedCategory() {
        try {
            WebElement tiraRedCategoryButton = homePage.tiraRedCategoty();
            String tiraRedCategoryText = tiraRedCategoryButton.getText();
            System.out.println("Tira Red Category Text: " + tiraRedCategoryText);

            String expectedText = "Tira Red";
            System.out.println("Asserting for Tira Red Category Text");
            Assert.assertEquals(tiraRedCategoryText, expectedText, "Assertion for Tira Red Category text failed");
        } catch (Exception e) {
            System.out.println("Error performing actions on Tira Red category - " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
