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


    @FindBy (xpath = "//*[@class='signIn btn btn-outline-light my-4 py-2 px-4 m-1 flex-wrap btn btn-info']")
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

    @FindBy (xpath = "//*[@class='my-2 text-center']")
    public WebElement ourDepartments;

    @FindBy (xpath = "//*[text()='Search']")
    public WebElement search;

    @FindBy (xpath = "(//*[@class=' css-13cymwt-control'])[1]")
    public WebElement selectCity;

    @FindBy (xpath = "(//*[@class=' css-19bb58m'])[2]")
    public WebElement selectUni;

    @FindBy (xpath = "(//*[@class=' css-19bb58m'])[3]")
    public WebElement selectDepartment;

    @FindBy (xpath = "//*[@class='slide-image carousel slide']")
    public WebElement geography;

    @FindBy (xpath = "//*[text()='Are You Already Working With Us?']")
    public WebElement areYouAlready;

    @FindBy (xpath = "//*[@class='SearchBox-icon  material-icons']")
    public WebElement subscribe;

    @FindBy (xpath = "//*[@class='SearchBox-input']")
    public WebElement emailBox;

    @FindBy (xpath = "//*[text()='Universities']")
    public WebElement universities;

    @FindBy (xpath = "(//*[text()='Departments'])[1]")
    public WebElement departments;

    @FindBy (xpath = "(//*[@class='toast-header bg-success text-white'])[2]")
    public WebElement compareAddedSuccess;

    @FindBy (xpath = "(//*[text()='Favorite added successfully.'])[1]")
    public WebElement favoriAddedSuccess;

    @FindBy (xpath = "(//*[text()='Compare'])[1]")
    public WebElement compare;
    @FindBy (xpath = "(//*[text()='Compare'])[2]")
    public WebElement compare2;

    @FindBy (xpath = "//*[@class='dropdown-toggle btn btn-primary']")
    public WebElement myAccount;

    @FindBy (xpath = "//*[@class='tit btn  my-2 py-2 m-1 flex-wrap ']")
    public WebElement compareDepartment;

    @FindBy (xpath ="//*[@class='tit btn  my-1 py-2 m-1 flex-wrap ']")
    public  WebElement favoriDepartment;

    @FindBy (xpath = "(//*[@class='heart fa-solid fa-heart-circle-check'])[1]")
    public WebElement favori;

    @FindBy (xpath = "//*[@class='comp  h-20 p-1 px-2 rounded-circle border-0 d-flex justify-content-center align-items-center']")
    public WebElement favoriSil;
    @FindBy (xpath = "//*[@id='language-dropdown']")
    public WebElement language1;

    @FindBy (xpath = "//*[@class='titbtn py-1 text-center']")
    public WebElement logout;


}

