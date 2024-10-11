package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceChkInfo {

    WebDriver driver;

    public SauceChkInfo(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    By fName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By submit = By.id("continue");


    public void EnterFirstName(String firstName) {
        driver.findElement(fName).sendKeys(firstName);
    }

    public void EnterLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void EnterZipCode(String zCode) {
        driver.findElement((zipCode)).sendKeys(zCode);
    }

    public void getSubmit() {
        driver.findElement(submit).click();
    }
}
