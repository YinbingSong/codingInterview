package com.leetcode;

import java.util.*;

public class efficientWinning {
    public int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ints = new int[]{i, j};
                }
            }
        }
        return ints;
    }
    public int[] twoSumHash(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]),i};
            }else {
                hashMap.put(nums[i],i);
            }
        }
        return new int[0];
    }

    public int[] twoSum167(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            int sum = numbers[i] + numbers[j];
            if (sum == target) return new int[]{i+1,j+1};
            if (sum < target) i++;
            if (sum > target) j--;
        }
        return new int[0];
    }

    public int findBottomLeftValue(TreeNode root) {
        int val = 0;
        ArrayDeque<TreeNode> treeNodes = new ArrayDeque<>();
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()){
            TreeNode poll = treeNodes.poll();
            if (poll.right != null){
                treeNodes.offer(poll.right);
            }
            if (poll.left != null){
                treeNodes.offer(poll.left);
            }
            val = poll.val;
        }
        return val;
    }

}
