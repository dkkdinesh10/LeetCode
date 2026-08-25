package org.example.leetcode.alltopics.easy;

import java.util.Arrays;

public class P27 {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        System.out.println(removeElement(arr,3));
    }

    public static int removeElement(int[] nums, int val) {
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                counter++;
                for(int j=nums.length-1;j>i;j--){
                    if(nums[j]!=val){
                        nums[i]=nums[j]+nums[i];
                        nums[j]=nums[i]-nums[j];
                        nums[i]=nums[i]-nums[j];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-counter;
    }
}
