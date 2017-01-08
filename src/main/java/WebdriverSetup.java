import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by ewi21211 on 8-1-2017.
 */
public class WebdriverSetup {
//    protected static WebDriver driver;

    public WebdriverSetup(WebDriver driver){
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//        Changge to true to use Selenium 3 (Geckodriver)
        capabilities.setCapability("marionette", false);
        driver = new FirefoxDriver(capabilities);
        driver.manage().window().maximize();
        driver.get("http://www.otwn.nl");
    }
}
