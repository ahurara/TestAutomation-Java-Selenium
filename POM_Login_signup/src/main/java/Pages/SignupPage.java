package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage extends BasePage{


    public SignupPage(WebDriver driver) {
        super(driver);
    }

    By firstname = By.id("firstname");
    By lastname = By.id("lastname");
    By userName = By.id("userName");
    By password = By.id("password");
    By register = By.id("register");
    By login = By.id("gotologin");

    public void enterFirstname(String fName) {
      WebElement fname = driver.findElement(firstname);
      sendKeysToElement(fname, fName);
    }

    public void enterLastname(String lName) {
       WebElement lname = driver.findElement(lastname);
       sendKeysToElement(lname, lName);
    }

    public void enterUserName(String uName) {
       WebElement uname = driver.findElement(userName);
       sendKeysToElement(uname, uName);
    }

    public void enterPassword(String p) {
       WebElement pwd = driver.findElement(password);
       sendKeysToElement(pwd, p);
    }
    public void enterRegister() {
       WebElement reg = driver.findElement(register);
       clickElement(reg);

    }

    public void enterLogin() {
       WebElement log = driver.findElement(login);
       clickElement(log);
    }

}
