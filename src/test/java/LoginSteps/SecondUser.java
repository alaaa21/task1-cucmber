package LoginSteps;
import Pages.LoginUser2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondUser {
    WebDriver driver = null;
    LoginUser2 login2 = new LoginUser2();
    @When("user enter valid username and password")
    @And("user click on login button")
    public void User2() {
        driver.navigate().to("https://www.saucedemo.com/");
        login2.usernamePOM(driver).sendKeys();
        login2.passwordPOM(driver).sendKeys();
        login2.LoginBtnPOM(driver).click();
    }
    @Then("the user cant login")
    public void UnSuccessLogin2(){

        String expectedResult= "Epic sadface: Sorry, this user has been locked out.";
        String actualResult = driver.findElement(By.className("error-message-container error")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult),true);
    }
}
