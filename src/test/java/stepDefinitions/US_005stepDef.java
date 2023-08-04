package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import pages.TestPage;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class US_005stepDef extends TestPage {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @And("Sayfa altında Address, navigation ve my account kısımlarının göründüğünü doğrular")
    public void sayfaAltındaAddressNavigationVeMyAccountKısımlarınınGöründüğünüDoğrular() throws IOException {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("home page fouter");
    }

    @And("Her sayfada olduğunu doğrular")
    public void herSayfadaOlduğunuDoğrular() throws IOException {
        ReusableMethods.waitFor(2);
        universities.click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("universities page fouter");
        departments.click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("departments page fouter");



    }
}
