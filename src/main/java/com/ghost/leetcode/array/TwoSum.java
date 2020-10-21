package com.ghost.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author NorthernGhost
 * @Description
 * @Date 2020/10/21 16:40
 * @Version 1.0
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 15, 11, 7};
        int target = 9 ;

        System.out.println(twoSum(nums,target).toString());
    }

    /**
     * *************************最优解*************************
     * 解题思路
     * 通过使用哈希表
     * map(nums[i],i)
     * 用 target - 当前元素 如果差值存在map中就返回当前元素下标和map对应元素的value
     * 时间复杂度为：O（n）   空间复杂度为：O（n）
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums , int target){
        int[] result = new int[2];
        int length = nums.length-1;
        Map< Integer, Integer> map = new HashMap<>(length);
        int sub;
        for (int i = 0; i < nums.length; i++) {
            sub = target-nums[i];
            if (map.containsKey(sub)) {
                result[0] = i;
                result[1] =map.get(sub) ;
                return result;
            }
            map.put(nums[i],i);
        }
        return null;
    }





}
