import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ewi21211 on 8-1-2017.
 */
public class CheckWebsiteContent {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", false);
        driver = new FirefoxDriver(capabilities);
        driver.manage().window().maximize();
        driver.get("http://www.otwn.nl");
    }

    @Test
    public void checkWebsiteTitle(){
//        WebdriverSetup webdriverSetup = new WebdriverSetup(driver);

        driver.findElement(By.linkText("MAVEN")).click();

        String textOnPage = driver.findElement(By.className("single_page")).getText();

        assertTrue(textOnPage.contains("Bron: https://nl.wikipedia.org/wiki/Apache_Maven"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }



}
