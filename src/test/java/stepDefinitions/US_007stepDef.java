package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TestPage;
import utils.ReusableMethods;

import java.io.IOException;

public class US_007stepDef extends TestPage {
    @And("Departments butonuna tıklar")
    public void departmentsButonunaTıklar() {
        departments.click();
        ReusableMethods.waitFor(2);
    }

    @And("Departments sayfasında olduğu doğrulanır")
    public void departmentsSayfasındaOlduğuDoğrulanır() {
        String actualResult=departments.getText();
        String expectedResult="Departments";
        Assert.assertEquals(expectedResult, actualResult);
        ReusableMethods.waitFor(3);
    }

    @And("{int} tane şehir, uni ve departman seçer")
    public void taneŞehirUniVeDepartmanSeçer(int num) {

        ReusableMethods.getActions().click(selectCity).sendKeys("Amasya").sendKeys(Keys.TAB).
                sendKeys("Balikesir").sendKeys(Keys.TAB).sendKeys("Erzurum").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("Amasya University").sendKeys(Keys.TAB).sendKeys("Balikesir University").
                sendKeys(Keys.TAB).sendKeys("Ataturk Universty").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("Physics").sendKeys(Keys.TAB).sendKeys("Civil").sendKeys(Keys.TAB).sendKeys("History").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

    }

    @And("seçilenlerin sıralandığı doğrulanır")
    public void seçilenlerinSıralandığıDoğrulanır() throws IOException {
        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshot("seçilen uniler ve bolumler");

    }


    @And("Seçilen uniler için compare butonuna tıklar")
    public void seçilenUnilerIçinCompareButonunaTıklar() {
        ReusableMethods.waitFor(2);
        compare.click();
    }

    @And("Karşılaştırma yapildigini doğrulanır")
    public void karşılaştırmaYapildiginiDoğrulanır() throws IOException {
        ReusableMethods.waitFor(2);
        compareDepartment.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("compare department");
    }

    @And("Sayfada sıralanan ünilerde favari butonuna tıklanır ve favori lambasının yandığı doğrulanır")
    public void sayfadaSıralananÜnilerdeFavariButonunaTıklanırVeFavoriLambasınınYandığıDoğrulanır() {
        favori.click();
        Assert.assertTrue(favori.isDisplayed());
    }


}
