package stepDefinitions.apiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class US_001ApiStepDef {

    Faker faker = new Faker();

    Response response;
    String url;
    String token = "SX2qL5O3ivipPSMIWN8nXnaLWOiy4cEq7UdgZk448T5ZDpT1qbgMIrXVNquP1CWyNAH3JvoEVqnjiyg20a17549275a86d0e835660e56847e87a";
    @When("kullanici pathparams ayarlamasini yapar")
    public void kullaniciPathparamsAyarlamasiniYapar() {
        url="https://tr-yös.com/api/v1/users/user.php?id=1684336076199?token=SX2qL5O3ivipPSMIWN8nXnaLWOiy4cEq7UdgZk448T5ZDpT1qbgMIrXVNquP1CWyNAH3JvoEVqnjiyg20a17549275a86d0e835660e56847e87a";
    }

    @Then("kullanici accountlarin bilgilerini alir")
    public void kullaniciAccountlarinBilgileriniAlir() {
        response=given().headers("Authorization","Bearer "+token).when().get(url);
        response.prettyPrint();

    }

    @And("kullanici alinan bilgilerin dogrulamasini yapar")
    public void kullaniciAlinanBilgilerinDogrulamasiniYapar() {

    }
}
