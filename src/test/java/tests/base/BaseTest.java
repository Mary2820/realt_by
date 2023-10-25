package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realthome.RealtHomePage;
import pages.regionpage.GrodnoRegionPage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);

    protected GrodnoRegionPage grodnoRegionPage = new GrodnoRegionPage(driver);

    @AfterSuite(alwaysRun = true)
    public void quite() {
        driver.quit();
    }
}
