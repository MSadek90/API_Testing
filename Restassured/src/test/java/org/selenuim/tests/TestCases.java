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

        given().baseUri("https://simple-books-api.glitch.me")
                .when().get("status")
                .then().log().all()
                .assertThat().statusCode(200);

    }


}