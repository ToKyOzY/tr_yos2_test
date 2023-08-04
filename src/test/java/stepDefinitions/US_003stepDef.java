package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.TestPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class US_003stepDef extends TestPage {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    public static void signIn(){
        TestPage testPage=new TestPage();
        ReusableMethods.waitFor(3);
        testPage.signIn.click();
        testPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        ReusableMethods.waitFor(3);
        testPage.password.sendKeys(ConfigReader.getProperty("password"),Keys.ENTER);
        testPage.homePage.click();
        //Driver.getDriver().navigate().refresh();

    }
    @Then("Kullanici sign in olur")
    public void kullaniciSignInOlur() {
        US_003stepDef.signIn();
        ReusableMethods.waitFor(5);
    }

    @And("HomePage'de oldugunu dogrular")
    public void homepageDeOldugunuDogrular() {

       //Assert.assertTrue(homePage.isDisplayed());
    }



    @And("Default halinde uni siralndigini gorur")
    public void defaultHalindeUniSiralndiginiGorur() throws IOException {


        long scrollHeight = (Long) js.executeScript("return Math.max( document.documentElement.scrollHeight, document.body.scrollHeight);");
        long halfScroll = scrollHeight / 2;
        js.executeScript("window.scrollTo(0, arguments[0]);", halfScroll);
        ReusableMethods.waitForVisibility(ourDepartments,3);
        //ReusableMethods.getActions().sendKeys(Keys.ARROW_DOWN).scrollToElement(ourDepartments);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("default Uni siralama");
    }



    @Then("Search butonunun oldugunu dogrular")
    public void searchButonununOldugunuDogrular() {
    Assert.assertTrue(search.isDisplayed());
    }

    @And("Sehir aratir")
    public void sehirAratir()  {
        ReusableMethods.getActions().sendKeys(Keys.ARROW_UP).build().perform();
        ReusableMethods.getActions().click(selectCity).sendKeys("Ankara").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("Ankara university").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Geography").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

        ReusableMethods.waitFor(3);

    }



    @And("Departments sayfasina yonlendirdigini dogrular")
    public void departmentsSayfasinaYonlendirdiginiDogrular() throws IOException {
        ReusableMethods.waitFor(4);
        ReusableMethods.getScreenshotWebElement("department",geography);
    }


}
