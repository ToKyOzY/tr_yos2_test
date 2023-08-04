package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TestPage;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class US_006stepDef extends TestPage {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Then("Universities butonuna tıklar")
    public void universitiesButonunaTıklar() {
        universities.click();
    }

    @And("Universities sayfa başlığını doğrular")
    public void universitiesSayfaBaşlığınıDoğrular() {
        String actualResult=universities.getText();
        String expectedResult="Universities";
        Assert.assertEquals(expectedResult, actualResult);
        ReusableMethods.waitFor(3);
    }

    @And("Unilerin default sıralandığını doğrular")
    public void unilerinDefaultSıralandığınıDoğrular() throws IOException {
        ReusableMethods.getScreenshot("universities page");

        Driver.closeDriver();
    }


    @And("Sıralanan üniversitelerde adres, tel no, şehir ve navigasyon işareti olduğu doğrulanır")
    public void sıralananÜniversitelerdeAdresTelNoŞehirVeNavigasyonIşaretiOlduğuDoğrulanır() throws IOException {
        long scrollHeight = (Long) js.executeScript("return Math.max( document.documentElement.scrollHeight, document.body.scrollHeight);");
        long halfScroll = scrollHeight / 2;
        js.executeScript("window.scrollTo(0, arguments[0]);", halfScroll);

        ReusableMethods.getScreenshot("adres, tel no, sehir, navi");
        ReusableMethods.waitFor(3);
    }

    @And("Sayfa altında kayıtlı bütün ünileri görebilmek için sayfa numaralarının olduğu doğrulanır")
    public void sayfaAltındaKayıtlıBütünÜnileriGörebilmekIçinSayfaNumaralarınınOlduğuDoğrulanır() throws IOException {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("sayfaların sıralanması");

    }
}
