package stepDefinitions.UiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;
import java.time.Duration;

public class SmokeStepDef extends TestPage{

   // TestPage testPage=new TestPage();


       JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }

    @When("Kullanici sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(signIn));
        element.click();
       // executor.executeScript("aruments[0].click()", testPage.signIn);
/*
        try {
            testPage.signIn.click();
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf(testPage.signIn));
            testPage.signIn.click();
        }

 */

    }

    @Then("Gecerli email girer")
    public void gecerliEmailGirer() {
        userName.sendKeys(ConfigReader.getProperty("userName"));
        ReusableMethods.waitFor(2);
    }

    @And("Gecerli password girer")
    public void gecerliPasswordGirer() {
       password.sendKeys(ConfigReader.getProperty("password"), Keys.ENTER);
    }

    @And("Login butonuna tiklar")
    public void loginButonunaTiklar() {
       //Driver.getDriver().navigate().refresh();
    }

    @And("Homepage sayfasinda oldugunu dugrular")
    public void homepageSayfasindaOldugunuDugrular() {
        homePage.click();
        Assert.assertTrue(homePage.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.getDriver().quit();
    }

    @Then("Save password butonunun gorunur ve tiklanabilir oldugunu dogrular")
    public void savePasswordButonununGorunurVeTiklanabilirOldugunuDogrular() {

        ReusableMethods.waitForVisibility(savePassword,5);
        Assert.assertTrue(savePassword.isDisplayed());
        savePassword.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(savePassword.isDisplayed());
        savePassword.click();
        ReusableMethods.waitFor(3);

    }

    @Then("forget password butonunun gorunur ve tiklanabilir oldugunu dogrular")
    public void forgetPasswordButonununGorunurVeTiklanabilirOldugunuDogrular() {
        ReusableMethods.waitForVisibility(forgotPassword,5);
        Assert.assertTrue(forgotPassword.isEnabled());
    }

    @And("forget password butonunun sifre yenileme sayfasina yonlendirdigini dogrular")
    public void forgetPasswordButonununSifreYenilemeSayfasinaYonlendirdiginiDogrular() {
        ReusableMethods.waitFor(3);
        forgotPassword.click();

    }

    @Then("Don't have an account yet? Sign Up kisminin oldugu ve signup butonunun tiklanabilir oldugunu dogrular")
    public void donTHaveAnAccountYetSignUpKismininOlduguVeSignupButonununTiklanabilirOldugunuDogrular() throws IOException {
        ReusableMethods.waitForVisibility(signUpYet,5);
        ReusableMethods.getScreenshot("sign up");
    }

    @And("Sign up butonuna tiklaninca dogru yonlendirdigini dogrular")
    public void signUpButonunaTiklanincaDogruYonlendirdiginiDogrular() throws IOException {
        signUpYet.click();
        signUp.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshot("signUp");

    }
}
