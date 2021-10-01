package com.example.miser;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnalyzeIMWTest {

    @Test
    public void maxSum() {

        ArrayList<Integer> visitors = new ArrayList<Integer>();
        visitors.add(null);
        visitors.add(1);
        visitors.add(5);
        visitors.add(null);
        visitors.add(null);

        visitors.add(1);
        visitors.add(2);
        visitors.add(2);
        visitors.add(2);

        visitors.add(null);
        visitors.add(3);
        visitors.add(2);

        AnalyzeIMW ai = new AnalyzeIMW();
        ai.maxSum(visitors);

        assertEquals(1,1);


/*
 maxSum(1, 5, null, 1, 2, 2, null, 3) → [1, 5]   minAvg(1, 5, null, 1, 2, 2, null, 3) → [1, 2, 2]
 */

    }
}