package com.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isUnique() {
//        assertFalse(new Solution().isUnique("leetcode"));
//        assertTrue(new Solution().isUnique("abc"));
//        assertFalse(new Solution().isUnique1("leetcode"));
//        assertTrue(new Solution().isUnique1("abc"));
//        assertTrue(new Solution().isUnique1(""));
//        assertTrue(new Solution().canPermutePalindrome("aa"));
//        assertFalse(new Solution().canPermutePalindrome("abca"));
//        assertFalse(new Solution().canPermutePalindrome("abcabcddda"));
//        assertTrue(new Solution().canPermutePalindrome("abcba"));
//        assertTrue(new Solution().canPermutePalindrome("tactcoa"));
//        assertTrue(new Solution().canPermutePalindrome1("aa"));
//        assertFalse(new Solution().canPermutePalindrome1("abca"));
//        assertFalse(new Solution().canPermutePalindrome1("abcabcddda"));
//        assertTrue(new Solution().canPermutePalindrome1("abcba"));
//        assertTrue(new Solution().canPermutePalindrome1("tactcoa"));
//        assertTrue(new Solution().oneEditAway("ab","a"));
//        assertTrue(new Solution().oneEditAway("adc","abc"));
//        assertTrue(new Solution().oneEditAway("ac","abc"));
//        assertFalse(new Solution().oneEditAway("abdd","abcc"));
//        assertFalse(new Solution().oneEditAway("teacher","bleacher"));
        assertEquals("a2b1c5a2",new Solution().compressString("aabcccccaa"));
        assertEquals("a2b1c5a1",new Solution().compressString("aabccccca"));
    }
}