import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;

public class PostmanTest {
    private static String BASE_URL = "https://postman-echo.com/";

    @Test
    public void getRequestTest() {
        given()
                .when()
                .get(BASE_URL + "get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(200)
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", startsWith("t="))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", startsWith("Root="))
                .body("headers.user-agent", startsWith("Apache-HttpClient/4.5.13"))
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))

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
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", startsWith("t="))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", startsWith("Root="))
                .body("headers.user-agent", startsWith("Apache-HttpClient/4.5.13"))
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/post"))

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
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", startsWith("t="))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", startsWith("Root="))
                .body("headers.user-agent", startsWith("Apache-HttpClient/4.5.13"))
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/post"))

                .body("form.name", equalTo("Jhony"))
                .body("form.age", equalTo("15"))
                .body("json.name", equalTo("Jhony"))
                .body("json.age", equalTo("15"));
    }

    @Test
    public void putRequestTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("boo", "apple")
                .put(BASE_URL + "put")
                .then()
                .statusCode(200)
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", startsWith("t="))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", startsWith("Root="))
                .body("headers.user-agent", startsWith("Apache-HttpClient/4.5.13"))
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/put"))

                .body("form.boo", equalTo("apple"))
                .body("json.boo", equalTo("apple"));
    }

    @Test
    public void patchRequestTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("boo", "orange")
                .patch(BASE_URL + "patch")
                .then()
                .statusCode(200)
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", startsWith("t="))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", startsWith("Root="))
                .body("headers.user-agent", startsWith("Apache-HttpClient/4.5.13"))
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/patch"))

                .body("form.boo", equalTo("orange"))
                .body("json.boo", equalTo("orange"));
    }

    @Test
    public void deleteRequestTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("boo", "orange")
                .delete(BASE_URL + "delete")
                .then()
                .statusCode(200)
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", startsWith("t="))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", startsWith("Root="))
                .body("headers.user-agent", startsWith("Apache-HttpClient/4.5.13"))
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/delete"))

                .body("form.boo", equalTo("orange"))
                .body("json.boo", equalTo("orange"));
    }
}
