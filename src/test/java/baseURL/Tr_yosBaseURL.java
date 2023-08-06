package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class Tr_yosBaseURL {
    public static RequestSpecification spec;

    @Before
    public void trYosSetUp() {
        spec = new RequestSpecBuilder().setBaseUri("https://tr-yös.com/api/v1/education/university.php?id=1687189250711&token= ").build();
    }
}
