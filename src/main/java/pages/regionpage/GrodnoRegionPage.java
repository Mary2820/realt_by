package pages.regionpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class GrodnoRegionPage extends BasePage {

    public GrodnoRegionPage(WebDriver driver) {super(driver);}

    public GrodnoRegionPage checkIsOpenedGrodnoRegionPage() {
        String currentPageURL = driver.getCurrentUrl();
        String grodnoRegionPageURL = "https://realt.by/grodno-region/";
        Assert.assertEquals(currentPageURL, grodnoRegionPageURL);
        return this;
    }
}
