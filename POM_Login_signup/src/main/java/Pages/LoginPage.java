package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver); // Call the BasePage constructor
    }

    By newUserBtn = By.id("newUser");
    By userName = By.id("userName");
    By password = By.id("password");
    By loginBtn = By.id("login");


    public void newUserClick(){
        WebElement newUserbtn =driver.findElement(newUserBtn);
        clickElement(newUserbtn);
    }

    public void enterUserName(String name){
       WebElement username = driver.findElement(userName);
        sendKeysToElement(username,name);
    }

    public void enterPassword(String pwd){
       WebElement pd = driver.findElement(password);
       sendKeysToElement(pd,pwd);
    }

    public void clickLogin(){
       WebElement loginbtn = driver.findElement(loginBtn);
       clickElement(loginbtn);
    }


}
