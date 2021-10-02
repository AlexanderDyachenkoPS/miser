package com.example.miser;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnalyzeIMWTest {



    @Test
    public void emptyMaxSum() {

        ArrayList<Integer> visitors = new ArrayList<Integer>();
        AnalyzeIMW ai = new AnalyzeIMW();
        ArrayList<Integer> maxVisitors = ai.maxSum(visitors);

        assertTrue(maxVisitors.isEmpty());

    }

    @Test
    public void nullFirstMaxSum() {

        ArrayList<Integer> visitors = new ArrayList<Integer>(Arrays.asList(new Integer[] {null,1,5,null,null,1,2,2,2,null,3,2}));

        AnalyzeIMW ai = new AnalyzeIMW();
        ArrayList<Integer> maxVisitors = ai.maxSum(visitors);

        assertTrue(maxVisitors.equals(new ArrayList<>(Arrays.asList(new Integer[] {1,2,2,2}))));

    }
        @Test
        public void nullLastMaxSum() {

            ArrayList<Integer> visitors = new ArrayList<Integer>(Arrays.asList(new Integer[] {1,5,null,null,1,2,2,2,null}));
            AnalyzeIMW ai = new AnalyzeIMW();
            ArrayList<Integer> maxVisitors = ai.maxSum(visitors);


            assertTrue(maxVisitors.equals(new ArrayList<>(Arrays.asList(new Integer[] {1,2,2,2}))));


        }

    @Test
    public void twoEqualIMWMaxSum() {

        ArrayList<Integer> visitors = new ArrayList<Integer>(Arrays.asList(new Integer[] {1,5,null,null,1,2,2,2,null,3,3,2,null,null,1,5,2,null}));

        AnalyzeIMW ai = new AnalyzeIMW();
        ArrayList<Integer> maxVisitors = ai.maxSum(visitors);

        assertTrue(maxVisitors.equals(new ArrayList<>(Arrays.asList(new Integer[] {3,3,2}))));

    }

    @Test
    public void simpleIMWMaxSum() {

        ArrayList<Integer> visitors = new ArrayList<Integer>(Arrays.asList(new Integer[] {1,5,null,null,1,2,2,null,3,3,2,null,null,1,2,2,null}));

        AnalyzeIMW ai = new AnalyzeIMW();
        ArrayList<Integer> maxVisitors = ai.maxSum(visitors);

        assertTrue(maxVisitors.equals(new ArrayList<>(Arrays.asList(new Integer[] {3,3,2}))));

    }

}