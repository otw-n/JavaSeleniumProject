import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ewi21211 on 8-1-2017.
 */
public class WebsiteTitle {
    private static WebDriver driver;

    @Test
    public void checkWebsiteTitle(){
//        WebdriverSetup webdriverSetup = new WebdriverSetup(driver);
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", false);
        driver = new FirefoxDriver(capabilities);
        driver.manage().window().maximize();
        driver.get("http://www.otwn.nl");



        String getTitle = driver.getTitle();

//        Check if page title is equal to expected page title
        assertEquals("otwn – Werkgroep testautomatisering",getTitle);

//        Check if page title starts with "otwn"
        assertTrue(getTitle.startsWith("otwn"));

        driver.quit();
    }



}
