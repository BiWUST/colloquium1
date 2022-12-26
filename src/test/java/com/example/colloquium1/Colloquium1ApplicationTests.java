package com.example.colloquium1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class Colloquium1ApplicationTests {
    @Test
    public void restTest1() {
        when().
                get("/factorial?n={n}", 5).
                then().
                statusCode(200).
                body(equalTo("120"));
    }

    @Test
    public void restTest2() {
        when().
                get("/first-factorials?n={n}", 5).
                then().
                statusCode(200).
                body(equalTo("[1,2,6,24,120]"));
    }
}
