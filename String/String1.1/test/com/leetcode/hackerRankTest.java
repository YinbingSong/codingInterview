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
}