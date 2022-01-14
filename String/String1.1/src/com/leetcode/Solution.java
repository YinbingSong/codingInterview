package com.leetcode;

import java.util.HashMap;

public class Solution {
    public boolean isUnique(String astr){
        if ("".equals(astr)){
            return true;
        }
        int length = astr.length();
        if (length > 128){
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < length ;i++){
            int c = astr.charAt(i);
            if (char_set[c]) return false;
            else {
                char_set[c] = true;
            }
        }
        return true;
    }
    public boolean isUnique1(String astr){
//        if ("".equals(astr)) return true;
        int length = astr.length();
        int check = 0;

        for (int i = 0; i < length ;i++){
            int c = astr.charAt(i);
            int i1 = c - 'a';
            if ((check & (1<<i1)) > 0){
                return false;
            }
            check |= (1<<i1);
        }
        return true;
    }

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap1 = new HashMap<>();
        for (char c : chars1) {
            if (characterIntegerHashMap1.containsKey(c)){
                characterIntegerHashMap1.put(c ,characterIntegerHashMap1.get(c) + 1);
            }else {
                characterIntegerHashMap1.put(c, 1);
            }
        }
        for (char c : chars2) {
            if (characterIntegerHashMap1.containsKey(c)){
                characterIntegerHashMap1.put(c ,characterIntegerHashMap1.get(c) - 1);
            }else {
                return false;
            }
        }
        for (Integer value : characterIntegerHashMap1.values()) {
            if (value != 0) return false;
        }
        return true;
    }

}
