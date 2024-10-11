package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SaucePage {

    WebDriver driver;

    public SaucePage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By password= By.id("password");
    By login = By.id("login-button");

    public void enterUserName(String userName) {
        driver.findElement(username).sendKeys(userName);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }

}
