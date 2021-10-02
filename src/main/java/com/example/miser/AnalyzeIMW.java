package com.example.miser;

import java.util.ArrayList;
import java.util.Collections;

public class AnalyzeIMW {

    Integer maxSum = 0;
    Integer maxSumTmp = 0;
    ArrayList<Integer> maxVisitors = new ArrayList<Integer>();
    ArrayList<Integer> maxVisitorsTmp = new ArrayList<Integer>();


    public ArrayList<Integer> maxSum (ArrayList<Integer> visitorsList) {


        visitorsList.forEach(visitors-> {
            // first null
            if (visitors == null && maxVisitorsTmp.isEmpty() && maxVisitors.isEmpty()) {
                System.out.println("first null");
            }
            // null
            if (visitors == null && !(maxVisitorsTmp.isEmpty())) {
                        if (maxSumTmp>=maxSum && maxVisitors.size()<=maxVisitorsTmp.size()) {
                            maxSum=maxSumTmp;
                            maxVisitors.clear();
                            maxVisitors = (ArrayList<Integer>) maxVisitorsTmp.clone();
                        }
                        maxSumTmp = 0;
                        maxVisitorsTmp.clear();

                    }
            if (visitors != null ) {
                            maxSumTmp=maxSumTmp+visitors;
                            maxVisitorsTmp.add(visitors);
                        }
            }

        );

        //last
        if (maxSumTmp>=maxSum && maxVisitors.size()<=maxVisitorsTmp.size()) {
            maxSum=maxSumTmp;
            maxVisitors.clear();
            maxVisitors = (ArrayList<Integer>) maxVisitorsTmp.clone();
        }

        System.out.println(maxSum);

        return maxVisitors;

    }



}
