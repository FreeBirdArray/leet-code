package com.ghost.leetcode.sort;

import java.util.jar.JarOutputStream;

/**
 * @auther NorGhost
 * @date 2020/11/6 22:45
 * @description
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {6,3,7,9,5,1,4,8};


      quickSort(arr, 0, arr.length - 1);
        for (int anInt : arr ){
            System.out.print(anInt+" ");
        }


    }



    public static void quickSort(int[] arr , int left ,int right){
        if (left>right){
            return  ;
        }

        int pivot = arr[left] ;
        int i =left;
        int j = right;

        while (i != j){

          while (arr[j] >= pivot && i < j){
              j--;
          }

          while (arr[i] <= pivot && i < j){
              i++;
          }
          //交换元素
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        arr[left] = arr[j] ;
        arr[j] = pivot;

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);


    }



}
