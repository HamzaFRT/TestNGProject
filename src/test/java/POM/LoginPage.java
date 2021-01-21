package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By username = By.id("userName");
    By password = By.id("password");
    By LoginButton = By.id("login");

    public LoginPage(WebDriver driver){

        this.driver=driver;
    }
    public void typeusername(String user){
        driver.findElement(username).sendKeys(user);
    }
    public void typepassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void clickLoginBtn(){
        driver.findElement(LoginButton).click();
    }
}

