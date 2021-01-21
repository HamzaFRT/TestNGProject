package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.gecko.driver","/home/hamza/IdeaProjects/my selenium project/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        System.out.println("browser opened");
    }

    @Test(priority = 1)
    public void LoginTest(){

        LoginPage login = new LoginPage(driver);
        login.typeusername("testuser_1");
        login.typepassword("Test@123");
        login.clickLoginBtn();

        Assert.assertEquals(driver.getTitle(),"ToolsQA");
    }
    @Test(priority = 2)
    public void teardown(){
        driver.quit();
    }

}
