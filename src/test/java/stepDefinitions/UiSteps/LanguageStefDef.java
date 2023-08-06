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

public class LanguageStefDef extends TestPage {


    @And("Ana sayfadaki on tane dili tek tek degistirip dogrular")
    public void anaSayfadakiOnTaneDiliTekTekDegistiripDogrular() throws IOException {


        language1.click();
        ReusableMethods.waitFor(2);
        List<WebElement> elements= Driver.getDriver().findElements(By.xpath("//*[@class='dropdown-item']"));

        for (int i = 0; i <elements.size() ; i++) {
            WebElement lang= elements.get(i);
            lang.click();
            ReusableMethods.waitFor(2);
            ReusableMethods.getScreenshot("language");
            language1.click();
            ReusableMethods.waitFor(2);

        }








    }
}
