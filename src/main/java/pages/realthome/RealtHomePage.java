package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

import javax.swing.*;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.xpath("//select[@id='rooms']");
    private final By option2Rooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    private final By findBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    private final By dropdown = By.xpath("//div[@class='region-selection']");
    private final By region = By.xpath("//div[@class='region-selection']//a[@data-id='4']");

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(option2Rooms).click();
        return this;
    }

    public RealtHomePage clickToFind() {
        driver.findElement(findBtn).click();
        return this;
    }

    public RealtHomePage SelectRegion() {
        WebElement regionsDropDown = driver.findElement(dropdown);
        new Actions(driver)
                .moveToElement(regionsDropDown)
                .perform();
        driver.findElement(region).click();
        return this;
    }
}
