package tests.searchapartments;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        basePage
                .open("https://realt.by")
                .acceptCookies();

        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage
                .checkCountCards();

    }

    @Test
    @Parameters({"browser"})
    public void checkIsSelectedRegion(String browser){
        basePage
                .open("https://realt.by")
                .acceptCookies();
        System.out.println(browser);

        realtHomePage
                .SelectRegion();

        grodnoRegionPage
                .checkIsOpenedGrodnoRegionPage();

    }
}
