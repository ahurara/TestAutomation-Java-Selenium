import org.example12.PageObjects.DemoQAFormPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.example12.PageObjects.DemoQAFormPageLocators.firstNameLocator;
import static org.example12.Utilities.Utility.scrollToElement;
import static org.example12.drivers.WebDriverManager.*;

public class DemoQAPageObjectModelTestCase {

    DemoQAFormPage demoQAFormPage;

    @BeforeSuite
    public void setUp() {
        setUpWebDriver();
        maximizeWindow();
        demoQAFormPage = new DemoQAFormPage();
    }

    @BeforeTest
    public void setUpTest() {
        demoQAFormPage.navigateToDemoQAPage();
    }

    @Test
    public void TC01_Fill_Form_POM() throws InterruptedException {


        demoQAFormPage.fillFirstName();
        demoQAFormPage.fillLastName();
        demoQAFormPage.fillUserEmail();
        demoQAFormPage.clickGender();
        demoQAFormPage.fillPhoneNumber();
        demoQAFormPage.fillDOB();
        demoQAFormPage.fillSubject();
        demoQAFormPage.clickHobbies();
        demoQAFormPage.sendImg();
        demoQAFormPage.fillAddress();
        demoQAFormPage.clickState();
        demoQAFormPage.clickCity();
        demoQAFormPage.clickSubmitBtn();


    }

    @AfterSuite
    public void tearDown() {
//        demoQAFormPage = null;
//        quitWebDriver();
    }
}