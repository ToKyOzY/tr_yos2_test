package stepDefinitions.UiSteps;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.TestPage;
import utils.Driver;
import utils.ReusableMethods;

public class US_004stepDef extends TestPage {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @And("sayfa sonunda Are You Already Working With Us? yazısının olduğunu dogrular")
    public void sayfaSonundaAreYouAlreadyWorkingWithUsYazısınınOlduğunuDogrular() {
        ReusableMethods.waitFor(3);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Assert.assertTrue(areYouAlready.isDisplayed());
    }

    @And("Subscribe butonunun olduğu ve tıklanabilir olduğu doğrular")
    public void subscribeButonununOlduğuVeTıklanabilirOlduğuDoğrular() {
        Assert.assertTrue(subscribe.isDisplayed());
        ReusableMethods.waitFor(3);

    }

    @And("subscribe kutusuna email girer")
    public void subscribeKutusunaEmailGirer() {
    ReusableMethods.getActions().click(emailBox).sendKeys("zeyy@gmail.com", Keys.ENTER).build().perform();
    }


}
