import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    private static String BASE_URL = "https://postman-echo.com/";

    @Test
    public void getRequestTest() {
        given()
                .when()
                .get(BASE_URL + "get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void postRawRequestTest() {
        given()
                .body("{\"name\":\"Jhon\"," +
                        "\"age\":20}")
                .when()
                .post(BASE_URL + "post")
                .then()
                .statusCode(200)
                .body("data", equalTo("{\"name\":\"Jhon\"," +
                        "\"age\":20}"));
    }

    @Test
    public void postFormRequestTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("name", "Jhony")
                .formParam("age", 15)
                .post(BASE_URL + "post")
                .then()
                .statusCode(200)
                .body("form.name", equalTo("Jhony"))
                .body("form.age", equalTo("15"));
    }

    @Test
    public void putRequestTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("boo", "apple")
                .put(BASE_URL + "put")
                .then()
                .statusCode(200)
                .body("form.boo", equalTo("apple"));
    }

    @Test
    public void patchRequestTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("boo", "orange")
                .patch(BASE_URL + "patch")
                .then()
                .statusCode(200)
                .body("form.boo", equalTo("orange"));
    }

    @Test
    public void deleteRequestTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("boo", "orange")
                .delete(BASE_URL + "delete")
                .then()
                .statusCode(200)
                .body("form.boo", equalTo("orange"));
    }
}
