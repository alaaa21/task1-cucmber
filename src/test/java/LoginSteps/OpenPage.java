package LoginSteps;
import Pages.LoginUser1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class OpenPage {
    WebDriver driver = null;
    LoginUser1 login = new LoginUser1();
@Given(" user navigates to login page")
@BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
@When("user enter valid username and password")
@And("user click on login button")
@AfterTest
    public void FirstUser() {
        driver.navigate().to("https://www.saucedemo.com/");
        login.usernamePOM(driver).sendKeys();
        login.passwordPOM(driver).sendKeys();
        login.LoginBtnPOM(driver).click();

    }
    @Then(" the user login successfully")
    public void successLogin(){
        String expectedResult = "https://www.saucedemo.com/inventory.html";
        String actualResult = driver.findElement(By.className("html")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult),true);
    }
}


