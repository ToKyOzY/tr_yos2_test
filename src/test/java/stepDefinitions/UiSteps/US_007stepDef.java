package stepDefinitions.UiSteps;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.TestPage;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class US_007stepDef extends TestPage {
    @And("Departments butonuna tıklar")
    public void departmentsButonunaTıklar() {
        departments.click();
        ReusableMethods.waitFor(2);
    }

    @And("Departments sayfasında olduğu doğrulanır")
    public void departmentsSayfasındaOlduğuDoğrulanır() {
        String actualResult = departments.getText();
        String expectedResult = "Departments";
        Assert.assertEquals(expectedResult, actualResult);
        ReusableMethods.waitFor(3);
    }

    @And("{int} tane şehir, uni ve departman seçer")
    public void taneŞehirUniVeDepartmanSeçer(int num) {

        ReusableMethods.getActions().click(selectCity).sendKeys("Amasya").sendKeys(Keys.TAB).
                sendKeys("Balikesir").sendKeys(Keys.TAB).sendKeys("Erzurum").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("Amasya University").sendKeys(Keys.TAB).sendKeys("Balikesir University").
                sendKeys(Keys.TAB).sendKeys("Ataturk Universty").sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys("Physics").sendKeys(Keys.TAB).sendKeys("Civil").sendKeys(Keys.TAB).sendKeys("History").
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

    }

    @And("seçilenlerin sıralandığı doğrulanır")
    public void seçilenlerinSıralandığıDoğrulanır() throws IOException {
        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshot("seçilen uniler ve bolumler");

    }

    @And("Unileri karsilastirmak için compare butonuna tıklar")
    public void unileriKarsilastirmakIçinCompareButonunaTıklar() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForClickablility(compare, 2);
        compare.click();


    }


    @And("Compare succesfully mesajinin gorundugunu dogrular")
    public void compareSuccesfullyMesajininGorundugunuDogrular() {
        Assert.assertTrue(compareAddedSuccess.isDisplayed());
        // compare2.click();
    }


    @And("Sayfada sıralanan ünilerde favari butonuna tıklanır ve favori lambasının yandığı doğrulanır")
    public void sayfadaSıralananÜnilerdeFavariButonunaTıklanırVeFavoriLambasınınYandığıDoğrulanır() {
        ReusableMethods.waitFor(3);
        favori.click();





    }


    @And("Successfully mesajının gorundugu dorulanir")
    public void successfullyMesajınınGorunduguDorulanir() {

       Assert.assertTrue(favoriAddedSuccess.isDisplayed());

    }

    @And("Favoriye eklenenler favori departments sayfasında gorulur ve silinebildigi dogrulanir")
    public void favoriyeEklenenlerFavoriDepartmentsSayfasındaGorulurVeSilinebildigiDogrulanir() {

        myAccount.click();
        ReusableMethods.waitFor(2);
        favoriDepartment.click();
        //ReusableMethods.scrollIntoView(favoriSil);
        ReusableMethods.clickElement(favoriSil);
        //favoriSil.click();



    }



    @And("Compare eklenenler favori departments sayfasında gorulur ve silinebildigi dogrulanir")
    public void compareEklenenlerFavoriDepartmentsSayfasındaGorulurVeSilinebildigiDogrulanir() {
        myAccount.click();
        compareDepartment.click();
        List<WebElement> compareSil = Driver.getDriver().findElements(By.xpath("comp h-20 p-1 px-2 rounded-circle border-0 d-flex justify-content-center align-items-center"));
        for (int i = 0; i < compareSil.size(); i++) {
            compareSil.get(i).click();
            ReusableMethods.waitFor(3);

        }


    }



    }

