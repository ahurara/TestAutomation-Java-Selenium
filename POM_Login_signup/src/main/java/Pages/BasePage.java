package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait
    }

    // Scroll to element
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Click with scroll
    public void clickElement(WebElement element) {
        scrollToElement(element); // Scroll first
        wait.until(ExpectedConditions.elementToBeClickable(element)); // Wait until clickable
        element.click();
    }

    // Send keys with scroll
    public void sendKeysToElement(WebElement element, String text) {
        scrollToElement(element); // Scroll first
        wait.until(ExpectedConditions.visibilityOf(element)); // Wait until visible
        element.sendKeys(text);
    }
}
