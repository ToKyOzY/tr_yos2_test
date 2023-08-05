package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class Tr_yosBaseURL {
    public static RequestSpecification spec;

    @Before
    public void trYosSetUp() {
        spec = new RequestSpecBuilder().setBaseUri("https://tr-yos-2-git-tr-yos-team2-kubracvs.vercel.app/").build();
    }
}
