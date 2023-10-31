package tests.searchapartments;

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
    public void checkIsSelectedRegion(){
        basePage
                .open("https://realt.by");
//                .acceptCookies();

        realtHomePage
                .SelectRegion();

        grodnoRegionPage
                .checkIsOpenedGrodnoRegionPage();

    }
}
