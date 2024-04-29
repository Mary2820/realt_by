package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

public class CommonActions {
    private static WebDriver driver = null;

    private CommonActions() {

    }

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER){
                case "win_opera" :
                    System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver2.exe");
                    driver = new OperaDriver();
                    break;
                default:
                    Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;
    }
}

