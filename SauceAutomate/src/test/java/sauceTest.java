import Page.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sauceTest {

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
        driver.get("https://www.saucedemo.com/");
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test
    public void TC01_Fill_Form() throws InterruptedException {

        SaucePage saucePage = new SaucePage(driver);
        saucePage.enterUserName("standard_user");
        saucePage.enterPassword("secret_sauce");
        saucePage.clickLogin();

        SauceProduct sauceProduct = new SauceProduct(driver);
        sauceProduct.setItem1();
        sauceProduct.setItem2();
        sauceProduct.setItem3();
        sauceProduct.setItem4();
        sauceProduct.setAddToCart();

        SauceAddToCart sauceAddToCart = new SauceAddToCart(driver);
        sauceAddToCart.RemoveItem();
        sauceAddToCart.ToCheckout();

        SauceChkInfo sauceChkInfo = new SauceChkInfo(driver);
        sauceChkInfo.EnterFirstName("Abu");
        sauceChkInfo.EnterLastName("Hurera");
        sauceChkInfo.EnterZipCode("69000");
        sauceChkInfo.getSubmit();

        SauceProductOverview sauceProductOverview = new SauceProductOverview(driver);
        sauceProductOverview.clickFinish();

        //assertion
        WebElement heading = driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']")); // or use By.xpath, By.cssSelector, etc.


        String expectedHeading = "Thank you for your order!";
        Assert.assertEquals(heading.getText(), expectedHeading);




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
