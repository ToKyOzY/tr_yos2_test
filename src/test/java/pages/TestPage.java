package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TestPage {
    public TestPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//*[text()='Sing In']")
    public WebElement signIn;


    @FindBy(id = "UserEmail")
    public WebElement userName;

    @FindBy(id = "exampleInputPassword1")
    public WebElement password;


    @FindBy(xpath = "//*[@class='nav-link text-danger']")
    public WebElement homePage;

    @FindBy (xpath = "//*[text()='Save Password']")
    public WebElement savePassword;

    @FindBy (xpath = "//*[text()='Forget Password']")
    public WebElement forgotPassword;


    @FindBy (xpath = "//*[@class='text-primary mx-2']")
    public WebElement signUpYet;

    @FindBy (xpath = "//*[text()='Sing Up']")
    public WebElement signUp;




}

