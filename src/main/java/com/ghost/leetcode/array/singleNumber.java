package com.ghost.leetcode.array;

/**
 * @auther NorGhost
 * @date 2020/10/26 23:20
 * @description
 */
public class singleNumber {

    public static void main(String[] args) {
         int[] nums = new int[]{4,1,2,1,2};
        singleNumber singleNumber = new singleNumber();
        System.out.println(singleNumber.singleNumber(nums));

    }

    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            result = result^nums[i];
        }

    return result;
    }
}