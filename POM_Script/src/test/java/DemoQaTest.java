import Pages.DemoQaPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQaTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeTest
    public void setUpTest() {
        driver.get("https://demoqa.com/automation-practice-form/");
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test
    public void TC01_Fill_Form() throws InterruptedException {

        DemoQaPage demoQaPage = new DemoQaPage(driver);

        demoQaPage.enterFirstName("Abu");
        demoQaPage.enterLastName("Hurara");
        demoQaPage.enterUserEmail("Abu@hurara.com");
        demoQaPage.enterGender();
        demoQaPage.enterNumber("03002677511");
        demoQaPage.enterDOB("09 Oct 2024");
        demoQaPage.setSubjectsInput("Math");
        demoQaPage.setHobbiesCheckbox();
        demoQaPage.setUploadPicture("C:\\Users\\Hurara\\POM_Script\\src\\test\\java\\48.jpg");
        demoQaPage.enterCurrentAddress("karachi pakistan");
        demoQaPage.enterStateDropdown();
        demoQaPage.enterCity();
        demoQaPage.clickSubmitButton();
    }

    @AfterSuite
    public void tearDown() {
        /*
 Close the browser
        if (driver != null) {
            driver.quit();
        }
*/
    }


}
