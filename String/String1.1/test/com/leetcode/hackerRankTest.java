package com.leetcode;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class hackerRankTest extends TestCase {

    public void testPlusMinus() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);
        hackerRank.plusMinus(list);
    }
    public void testIsPangram(){
        ArrayList<String> list = new ArrayList<>();
        list.add("we promptly judged antique ivory buckles for the next prize");
        list.add("we promptly judged antique ivory buckles for the prizes");
        list.add("the quick brown fox jumps over the lazy dog");
        list.add("the quick brown fox jump over the lazy dog");
        System.out.println(hackerRank.isPangram(list));
    }
}