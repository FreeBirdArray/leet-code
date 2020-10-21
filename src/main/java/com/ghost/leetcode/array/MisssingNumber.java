package com.ghost.leetcode.array;

/**
 * @auther NorthernGhost
 * @date 2020/10/21 19:56
 * @description   leetCode第268题
 * @Version 1.0
 */
public class MisssingNumber {


    public static void main(String[] args) {
       int[] nums = new int[]{3,1,0};

        System.out.println(missingNumber(nums));
    }


    /**
     * 数学法解：通过等差数字前N项和的求和公式sum=(n*(n+1))/2-nums数组的和就能得到确实的数字
     * 由于对数字求和的时间复杂度为 O(n) 所以此解法的时间复杂度为 O(n)
     * 由于只是使用了基本数据类型int存储sum所以空间复杂度为 O(n)
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums){

        int sum = (nums.length*(nums.length+1))/2;
        int sum1 = 0;
        for (int num : nums) {
            sum1+=num;
        }
        return sum-sum1;
    }
}
