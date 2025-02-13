package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='sm:w-full w-full p-1.5 sm:p-2.5']");

    public RealtListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));

        int countCards = driver.findElements(card).size();
        Assert.assertEquals(countCards, 30);
        return this;
    }
}
