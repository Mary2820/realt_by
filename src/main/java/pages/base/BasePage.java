package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.realthome.RealtHomePage;

import static common.Config.EXPLICIT_WAIT;

public class BasePage {

    By cookies = By.xpath("//button[@id='accept-cookie']");

    protected WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    public BasePage open (String url) {
        driver.get(url);
        return this;
    }

    public BasePage acceptCookies() {
        driver.findElement(cookies).click();
        return this;
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
