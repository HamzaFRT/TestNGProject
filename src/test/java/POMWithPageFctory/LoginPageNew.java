package POMWithPageFctory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

    WebDriver driver;
    public LoginPageNew(WebDriver driver){

        this.driver=driver;
    }

    @FindBy(how= How.ID,using=("userName"))
    WebElement username;
    @FindBy(how= How.ID,using=("password"))
    WebElement password;
    @FindBy(how=How.ID,using = ("login")) WebElement LoginButton;


    public void typeusername(String user){
        username.sendKeys(user);
    }
    public void typepassword(String pass){

        password.sendKeys(pass);
    }
    public void clickLoginBtn(){
        LoginButton.click();
    }

}
