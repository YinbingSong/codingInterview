package com.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isUnique() {
        assertFalse(new Solution().isUnique("leetcode"));
        assertTrue(new Solution().isUnique("abc"));
        assertFalse(new Solution().isUnique1("leetcode"));
        assertTrue(new Solution().isUnique1("abc"));
        assertTrue(new Solution().isUnique1(""));
    }
}