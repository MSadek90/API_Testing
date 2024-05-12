package Org.selenuim.pom.tests;

import Org.selenuim.pom.Base.BaseTest;
import Org.selenuim.pom.objects.BillingAddress;
import Org.selenuim.pom.pages.CartPage;
import Org.selenuim.pom.pages.CheckoutPage;
import Org.selenuim.pom.pages.HomePage;
import Org.selenuim.pom.pages.StorePage;
import Org.selenuim.pom.utils.ConfigLoader;
import Org.selenuim.pom.utils.JacksonUtils;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

public class TestCases{

    @Test
    public void test() {

        POJOClass pojoClass = new POJOClass(1,"ali");


               given()
                       .baseUri("https://simple-books-api.glitch.me").
                        auth().oauth2("36c898d32e9168d7b3e128640b334da6c0f3e682026810085751091c6500dc1f").
                        contentType(ContentType.JSON).
                        body(pojoClass).
						log.all().
                when()

                        .post("/orders").
                then()
                       .log().all();



    }


}
