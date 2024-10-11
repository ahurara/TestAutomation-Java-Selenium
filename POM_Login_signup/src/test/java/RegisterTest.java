    import Pages.LoginPage;
    import Pages.SignupPage;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.AfterSuite;
    import org.testng.annotations.BeforeSuite;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;

    public class RegisterTest {
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
            driver.get("https://demoqa.com/login");
        }

//        public void scrollToElement(WebElement element) {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].scrollIntoView(true);", element);
//
//        }

        @Test
        public void TC01_Fill_Form() throws InterruptedException {

            LoginPage loginPage = new LoginPage(driver);
            SignupPage signupPage = new SignupPage(driver);

            loginPage.newUserClick();

            signupPage.enterFirstname("Abu");
            signupPage.enterLastname("Hurrerah");
            signupPage.enterUserName("hurrerah");
            signupPage.enterPassword("12345Abcd$.");




            signupPage.enterRegister();


            signupPage.enterLogin();

            loginPage.enterUserName("hurrerah@gmail.com");
            loginPage.enterPassword("12345Abcd$.");
            

            loginPage.clickLogin();








        }

        @AfterSuite
        public void tearDown() {
            /*
     Close the browser
            if (driver != null) {
                driver.quit();
            }
    }*/
    }}