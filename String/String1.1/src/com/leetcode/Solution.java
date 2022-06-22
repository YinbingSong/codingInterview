package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

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

    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        int spacesNum = 0;
        for (char aChar : chars) {
            if (aChar == ' '){
                spacesNum++;
            }
        }
        if (spacesNum == 0) return S;

        int realSize = length + spacesNum*2;
        int orlSize = length - 1;

        char[] ans = new char[realSize];
        int i = realSize -1;
        while (orlSize >= 0){
            if (chars[orlSize] == ' ') {
                ans[i--] = '0';
                ans[i--] = '2';
                ans[i--] = '%';
            } else {
                ans[i--] = chars[orlSize];
            }
            orlSize--;
        }
        return String.valueOf(ans, i + 1, S.length() - orlSize - 1);
    }
    public String replaceSpaces1(String S, int length) {
        String substring = S.substring(0, length - 1);
        return substring.replaceAll(" ", "%20");
    }
    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (Character c:chars){
            if (characterIntegerHashMap.containsKey(c)) {
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
            }else {
                characterIntegerHashMap.put(c, 1);
            }
        }
        AtomicInteger count = new AtomicInteger();
        characterIntegerHashMap.forEach((character, integer) -> {
            if (integer % 2 == 1){
                count.getAndIncrement();
            }
        });
        return count.get() <= 1;
    }

    public boolean canPermutePalindrome1(String s){
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (hashSet.add(c)) {
            }else {
                hashSet.remove(c);
            }
        }
        return hashSet.size()<=1;
    }

    public boolean oneEditAway(String first, String second) {
        int firstLength = first.length();
        int secondLength = second.length();
        if (firstLength - secondLength >1 || secondLength - firstLength > 1) return false;
        if (firstLength == 0 || secondLength == 0) return true;
        if (firstLength == secondLength){
            return oneReplace(first,second);
        }else if (firstLength == secondLength + 1){
            return oneInsert(first,second);
        }else {
            return oneInsert(second, first);
        }
    }
    private boolean oneReplace(String s1,String s2){
        if (s1.length() != s2.length()) return false;
        int temp = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (++temp > 1) return false;
            }
        }
        return true;
    }
    private boolean oneInsert(String s1,String s2){
        if (s1.length() - s2.length() != 1) return false;
        int i = 0,temp = 0;
        while (i < s2.length()){
            if (s1.charAt(i + temp) != s2.charAt(i)) {
                temp++;
            }else {
                i++;
            }
            if (temp > 1) return false;
        }
        return true;
    }

    public String compressString(String S) {
        if (S.length() < 2) {
            return S;
        }
        Character temp = S.charAt(0);
        Integer tempNum = 0;
//        StringBuilder ans = new StringBuilder();
        StringBuffer ans = new StringBuffer();
        char[] chars = S.toCharArray();
        for (char aChar : chars) {
            if (aChar == temp) {
                tempNum++;
            } else {
                ans.append(temp).append(tempNum);
                temp = aChar;
                tempNum = 1;
            }
        }
        ans.append(temp).append(tempNum);
        return ans.length() > S.length() ? S : String.valueOf(ans);
    }


    public String longestNiceSubstring(String s) {
        int maxLength = 0;
        int startIndex = 0;
        int length = s.length();

        for(int i = 0 ; i < length ; i++){
            int lower = 0;
            int upper = 0;
            for(int j = 0 ; j < length ; j++){
                if (Character.isLowerCase(s.charAt(j))) {
                    lower |= 1 << (s.charAt(j) - 'a');
                } else {
                    upper |= 1 << (s.charAt(j) - 'A');
                }
                if (lower == upper && j - i + 1 > maxLength) {
                    startIndex = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLength);
    }


}
