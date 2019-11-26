package com.virgingame.bingo.testsuite;

import org.testng.annotations.Test;

/**
 * Created by JANVI on 25/11/2019.
 */
public class VirginTest2 extends VirginTest1 {


    @Test
    public void verifyDefaultGameFrequency() {
        defaultFrequency();
    }

    @Test
    public void verifyStartTime() {
        testStartTime();
    }

}