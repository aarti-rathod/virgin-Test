package com.virgingame.bingo.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * Created by JANVI on 25/11/2019.
 */
public class TestBase {

    @BeforeClass

        public static void inIt() {
            RestAssured.baseURI = "https://www.virgingames.com/";
            RestAssured.basePath = "/bingo";  //
        }

    }

