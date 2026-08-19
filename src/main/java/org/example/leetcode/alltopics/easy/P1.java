package org.example.leetcode.alltopics.easy;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3,2,4},6));
    }

    public static int[] twoSum( int[] nums, int target ) {
        int[] ret=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(target-nums[i])!=null){
                ret[0]=map.get(target-nums[i]);
                ret[1]=i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return ret;
    }
}
