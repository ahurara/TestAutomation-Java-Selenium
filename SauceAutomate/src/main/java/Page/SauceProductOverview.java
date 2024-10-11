package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceProductOverview {

    WebDriver driver;

    public SauceProductOverview(WebDriver driver) {
        this.driver = driver;
    }

    By finishBtn = By.id("finish");

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }
}
