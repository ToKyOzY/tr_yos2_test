package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TestPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class Us_003stepDef extends TestPage {

    public static void signIn(){
        TestPage testPage=new TestPage();
        ReusableMethods.waitFor(3);
        testPage.signIn.click();
        testPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        ReusableMethods.waitFor(3);
        testPage.password.sendKeys(ConfigReader.getProperty("password"),Keys.ENTER);
        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().refresh();

    }
    @Then("Kullanici sign in olur")
    public void kullaniciSignInOlur() {
        Us_003stepDef.signIn();
        ReusableMethods.waitFor(5);
    }

    @And("HomePage'de oldugunu dogrular")
    public void homepageDeOldugunuDogrular() {
       Assert.assertTrue(homePage.isDisplayed());
    }

    @And("Default halinde uni siralndigini gorur")
    public void defaultHalindeUniSiralndiginiGorur() throws IOException {
        ReusableMethods.scrollIntoView(ourDepartments);
       // ReusableMethods.getActions().sendKeys(Keys.ARROW_DOWN).scrollToElement(ourDepartments);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("default Uni siralama");
    }

    @Then("Search butonunun oldugunu dogrular")
    public void searchButonununOldugunuDogrular() {
    Assert.assertTrue(search.isDisplayed());
    }

    @And("Sehir aratir")
    public void sehirAratir() throws IOException {
        selectCity.click();
        selectCity.sendKeys("Ankara",Keys.ENTER);

        ReusableMethods.getScreenshotWebElement("sehir",selectCity);
        ReusableMethods.waitFor(3);
    }

    @And("Sehire gore uni aratir")
    public void sehireGoreUniAratir() {
        selectUni.isSelected();
    }

    @Then("Uniye gore bolum aratir")
    public void uniyeGoreBolumAratir() {
        selectDepartment.isSelected();
        ReusableMethods.waitFor(3);
    }

    @And("Dogru siralandigini dogrular")
    public void dogruSiralandiginiDogrular() {


    }

    @And("Departments sayfasina yonlendirdigini dogrular")
    public void departmentsSayfasinaYonlendirdiginiDogrular() {

    }
}
