package com.ghost.leetcode.array;

import java.util.Arrays;

/**
 * @auther NorthernGhost
 * @date 2020/10/21 19:56
 * @description   leetCode第286题
 * @Version 1.0
 */
public class MisssingNumber {


    public static void main(String[] args) {
       int[] nums = new int[]{3,1,0};

        System.out.println(missingNumber(nums));
    }



    public static int missingNumber(int[] nums){
        return (nums.length*(nums.length+1))/2-Arrays.stream(nums).sum();
    }
}
