package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQaPage {

   WebDriver driver;

    public DemoQaPage(WebDriver driver) {
        this.driver = driver;
    }


    //locators for the fields of DemoQa page
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By userEmail = By.id("userEmail");
    By genderMale = By.cssSelector("label[for='gender-radio-1']");
    By userNumber = By.id("userNumber");
    By dobInput = By.id("dateOfBirthInput");
    By subjectsInput = By.id("subjectsInput");
    By hobbiesCheckbox = By.xpath("//label[normalize-space()='Sports']");
    By uploadPicture = By.id("uploadPicture");
    By currentAddress = By.id("currentAddress");
    By stateDropdown = By.xpath("//div[contains(text(),'Select State')]");
    By cityDropdown = By.xpath("//div[contains(text(),'Select City')]");
    By submitButton = By.id("submit");

    // Methods to perform actions on the page

    public void enterFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void enterUserEmail(String email) {
        driver.findElement(userEmail).sendKeys(email);
    }

    public void enterGender() {
        driver.findElement(genderMale).click();
    }

    public void enterNumber(String number) {
        driver.findElement(userNumber).sendKeys(number);
    }

    public void enterDOB(String dob) {
        driver.findElement(dobInput).sendKeys(dob);
        driver.findElement(dobInput).sendKeys(Keys.ENTER);
    }

    public void setSubjectsInput(String subjects) {

        driver.findElement(subjectsInput).sendKeys(subjects);
        driver.findElement(subjectsInput).sendKeys(Keys.ENTER);

    }

    public void setHobbiesCheckbox() {
            driver.findElement(hobbiesCheckbox).click();

    }

    public void setUploadPicture(String path) {

        driver.findElement(uploadPicture).sendKeys(path);
    }

    public void enterCurrentAddress(String address) {
        driver.findElement(currentAddress).sendKeys(address);
    }

    public void enterStateDropdown() {
        driver.findElement(stateDropdown).click();
        try {
            Thread.sleep(1000);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.SPACE).perform();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public void enterCity() {
        driver.findElement(cityDropdown).click();
        try {
            Thread.sleep(1000);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.SPACE).perform();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

}
