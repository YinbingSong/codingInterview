package com.leetcode;

import java.util.List;

public class hackerRank {

    public static void plusMinus(List<Integer> arr) {
        int s = arr.size();
        int positive = 0,negative = 0,zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            } else if (integer < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        double rP = 1.0 * positive / s;
        double rN = 1.0 * negative / s;
        double rZ = 1.0 * zero / s;
        System.out.println(rP);
        System.out.println(rN);
        System.out.println(rZ);
    }
}
