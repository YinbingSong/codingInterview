package com.leetcode;

import java.util.*;

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

    public static String isPangram(List<String> pangram) {
        int s = pangram.size();
        int[] result = new int[s];
        HashMap<Integer,Integer> hash = new HashMap<>();

        final int[] p = {0};
        pangram.forEach(
                x -> {
                    if (x.length() < 26) {
                        result[p[0]] = 0;
                        p[0]++;
                        return;
                    }
                    for (int i = 0; i < x.length(); i++) {
                        if (' ' == x.charAt(i)) {
                            continue;
                        }
                        int a = x.charAt(i) - 'a';
                        if (hash.getOrDefault(i, 0) == 0) {
                            hash.put(a, 1);
                        } else {
                            hash.put(a, hash.get(i) + 1);
                        }
                    }
                    if (hash.size() == 26) {
                        result[p[0]] = 1;
                    } else {
                        result[p[0]] = 0;
                    }
                    hash.clear();
                    p[0]++;
                }
        );
        StringBuilder b = new StringBuilder();
        for (int i : result) {
            b.append(i);
        }
        return b.toString();
    }

    public static int gemstones(List<String> rocks) {
        int size = rocks.size();

        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (String rock : rocks) {
            HashSet<Character> stringSet = new HashSet<>();
            char[] charArray = rock.toCharArray();
            for (char sand : charArray) {
                stringSet.add(sand);
            }
            for (Character character : stringSet) {
                resultMap.put(character, resultMap.getOrDefault(character,0)+1);
            }
        }

        List<Object> keyList = new ArrayList<>();
        for(Object key: resultMap.keySet()){
            if(resultMap.get(key).equals(size)){
                keyList.add(key);
            }
        }
        return keyList.size();
    }

}
