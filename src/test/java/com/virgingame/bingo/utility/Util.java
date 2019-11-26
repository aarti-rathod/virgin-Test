package com.virgingame.bingo.utility;

/**
 * Created by JANVI on 25/11/2019.
 */
public class Util {


    public boolean verifyExpectedTimeIsInFutureTimeStamp(Long startTime) {

        Long actualCurrentMilliSeconds = System.currentTimeMillis();


        if (startTime < actualCurrentMilliSeconds) {
            System.out.println(" .. Start Time is Not in Future Stamp ..");
            return false;
        }
        return true;
    }
}
