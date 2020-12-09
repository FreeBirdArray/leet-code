package com.ghost.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @auther NorGhost
 * @date 2020/11/8 0:25
 * @description
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        char[] s1=new char[26];
        char[] t1=new char[26];
        for(char c:s.toCharArray()){
            s1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            t1[c-'a']++;
        }
        return Arrays.equals(s1,t1);
    }


 /*   public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int sum=0;
        char[] chars =  s.toCharArray();
        char[] chars1 = t.toCharArray();
        if (s.length()!=t.length()) {
            return false;
        }
        dealMap(hashMap,chars);
        dealMap(hashMap,chars1);

        for (Character character : hashMap.keySet()) {
            sum+=hashMap.get(character);
        }
        return sum==0;
    }*/

    public static void dealMap(Map<Character, Integer> hashMap,char[] chars){
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                Integer integer = hashMap.get(chars[i]);
                if (integer==0) {
                    hashMap.put(chars[i],integer+1);
                }else{
                    hashMap.put(chars[i],integer-1);
                }
            }else {
                hashMap.put(chars[i],1);
            }
        }
    }
    public static int getSum(String str){
        int sum = 0;

        for (char c : str.toCharArray()) {
            sum += c ;
        }
        return sum;
    }

    public static void main(String[] args) {



          Solution solution = new Solution();



        System.out.println(solution.isAnagram("anagram", "nagaram"));

    }
}
