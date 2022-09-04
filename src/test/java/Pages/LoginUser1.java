
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUser1 {
    public WebElement usernamePOM(WebDriver driver) {

        return driver.findElement(By.id("username"));
    }

    public WebElement passwordPOM(WebDriver driver) {

        return driver.findElement(By.name("Password"));
    }
    public WebElement LoginBtnPOM(WebDriver driver) {

        return driver.findElement(By.className("submit-button btn_action"));
    }
}