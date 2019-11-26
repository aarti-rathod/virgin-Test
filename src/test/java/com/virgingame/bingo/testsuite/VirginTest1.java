package com.virgingame.bingo.testsuite;

import com.virgingame.bingo.testbase.TestBase;
import com.virgingame.bingo.utility.Util;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by JANVI on 25/11/2019.
 */
public class VirginTest1 extends TestBase {
    Util util;

    /*
    verify "Default game frequency  = 30000 - Always"
     */
    public void defaultFrequency() {
        Response response = given()
                .when()
                .get()
                .then()
                .extract().response();

        String responseBody = response.asString();
        Assert.assertEquals("30000", responseBody);
    }

    /*
    Check the Future Time...
     */
    public void testStartTime() {
        Response response = given().contentType(ContentType.JSON).get("/GetBingoLobbyFeed.do");
        response.prettyPrint();
        JsonPath extractor = response.jsonPath();

        for (int i = 0; i < 7; i++) {
            String a = "bingoLobbyInfoResource.streams[";
            String b = "].startTime";
            Long startTime = extractor.get(a + i + b);

            util = new Util();
            if (!util.verifyExpectedTimeIsInFutureTimeStamp(startTime)) {
                Assert.fail();
            }
        }
    }
}
