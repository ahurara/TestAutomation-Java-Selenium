import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.security.Key;

public class Test1 {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
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



        WebElement fName= driver.findElement( By.id("firstName"));
        scrollToElement(fName);
        fName.sendKeys("Abu");

        WebElement lName= driver.findElement( By.id("lastName"));
        scrollToElement(lName);
        lName.sendKeys("Champ");


        WebElement email= driver.findElement( By.id("userEmail"));
        scrollToElement(email);
        email.sendKeys("champ@gmail.com");



        WebElement gender= driver.findElement( By.cssSelector("label[for='gender-radio-1']"));
        scrollToElement(gender);
        gender.click();




        WebElement num= driver.findElement( By.id("userNumber"));
        scrollToElement(num);
        num.sendKeys("03002677511");


        WebElement dob= driver.findElement( By.id("dateOfBirthInput"));
        scrollToElement(dob);
        dob.click();
        dob.sendKeys(Keys.ENTER);




        WebElement subject = driver.findElement( By.id("subjectsInput"));
        scrollToElement(subject);
        subject.sendKeys("Maths");
        subject.sendKeys(Keys.ENTER);



        WebElement hobbies=  driver.findElement( By.xpath("//label[normalize-space()='Sports']"));
        scrollToElement(hobbies);
        Thread.sleep(1000);
        hobbies.click();


        WebElement upload = driver.findElement( By.id("uploadPicture"));
        scrollToElement(upload);
        Thread.sleep(2000);
        upload.sendKeys("D:\\selenium Scripts\\SeleniumIntro\\src\\test\\java\\paul-hanaoka-o6RbK3y7mK4-unsplash.jpg");


        WebElement address= driver.findElement( By.id("currentAddress"));
        scrollToElement(address);
        address.sendKeys("Karachi");

        WebElement stateDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
        scrollToElement(stateDropdown);
        stateDropdown.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.SPACE).perform();

        WebElement cityDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
        scrollToElement(cityDropdown);
        cityDropdown.click();
        Thread.sleep(1000);
        actions.sendKeys(Keys.SPACE).perform();

        WebElement submitButton = driver.findElement(By.id("submit"));
        scrollToElement(submitButton);
        Thread.sleep(1000);
        submitButton.sendKeys(Keys.ENTER);
        
    }

    @AfterSuite
    public void tearDown() {

    }
}