package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

public class SauceAddToCart {

    WebDriver driver;

    public SauceAddToCart(WebDriver driver) {
        this.driver = driver;
    }

    //locator
    By removeItem = By.id("remove-sauce-labs-backpack");
    By chekout = By.id("checkout");

    public void RemoveItem() {
       driver.findElement(removeItem).click();
    }

    public void ToCheckout() {
        driver.findElement(chekout).click();
    }
}
