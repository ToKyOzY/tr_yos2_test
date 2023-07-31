package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

public class TestPage  {
    public TestPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//*[text()='Sing In']")
    public  WebElement signIn;


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

    @FindBy (xpath = "//*[@class='text-center']")
    public WebElement ourDepartments;

    @FindBy (xpath = "//*[text()='Search']")
    public WebElement search;

    @FindBy (xpath = "(//*[@class=' css-13cymwt-control'])[1]")
    public WebElement selectCity;

    @FindBy (xpath = "(//*[@class=' css-19bb58m'])[2]")
    public WebElement selectUni;

    @FindBy (xpath = "(//*[@class=' css-19bb58m'])[3]")
    public WebElement selectDepartment;



}

