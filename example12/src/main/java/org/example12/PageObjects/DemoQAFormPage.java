package org.example12.PageObjects;

import org.example12.Enums.DemoQAEnums;
import org.example12.constants.FrameworkPathConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example12.ConfigLoaders.JsonUtils.getValue;
import static org.example12.PageObjects.DemoQAFormPageLocators.*;
import static org.example12.PageObjects.DemoQAFormPageTestData.*;
import static org.example12.Utilities.Utility.scrollToElement;
import static org.example12.drivers.WebDriverManager.getWebDriver;

public class DemoQAFormPage {

    public void navigateToDemoQAPage() {
        getWebDriver().get(getValue(DemoQAEnums.URL, FrameworkPathConstants.TEST_DATA_FILE_PATH));
    }

    public void fillFirstName(){
        WebElement firstName = getWebDriver().findElement(By.id(firstNameLocator));
        scrollToElement(firstName);
        firstName.sendKeys(firstNameTestData);
    }

    public void fillLastName(){
        WebElement lastName = getWebDriver().findElement(By.id(lastNameLocator));
        scrollToElement(lastName);
        lastName.sendKeys(lastNameTestData);
    }

    public void fillUserEmail(){
        WebElement userEmail = getWebDriver().findElement(By.id(emailLocator));
        scrollToElement(userEmail);
        userEmail.sendKeys(emailTestData);
    }

}
