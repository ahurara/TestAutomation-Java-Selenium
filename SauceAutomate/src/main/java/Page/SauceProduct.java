package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SauceProduct {

    WebDriver driver;

    public SauceProduct(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    By item1 = By.id("add-to-cart-sauce-labs-backpack");
    By item2 = By.id("add-to-cart-sauce-labs-bike-light");
    By item3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By item4 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By addToCart = By.cssSelector(".shopping_cart_badge");

    public void setItem1() {
        driver.findElement(item1).click();
    }
    public void setItem2() {
        driver.findElement(item2).click();
    }
    public void setItem3() {
        driver.findElement(item3).click();
    }
    public void setItem4() {
        driver.findElement(item4).click();
    }

    public void setAddToCart() {
       driver.findElement(addToCart).click();
    }
}
