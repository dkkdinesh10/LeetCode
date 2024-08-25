package org.example.leetcode.alltopics.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{i,map.get(rem)};
            }
            map.put(nums[i],i);
        }

        return null;
    }
}
