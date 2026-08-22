package org.example.leetcode.alltopics.easy;

import java.util.HashMap;
import java.util.Map;

public class P13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        boolean isLast =false;
        int num=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            isLast = i == arr.length - 1;
            if(arr[i]=='I' && !isLast && ( arr[i+1]=='V' || arr[i+1]=='X' )){
                num= num + map.get(arr[i+1]) - map.get(arr[i]);
                i++;
            }else if(arr[i]=='X' && !isLast && ( arr[i+1]=='L' || arr[i+1]=='C' )){
                num= num + map.get(arr[i+1]) - map.get(arr[i]);
                i++;
            }else if(arr[i]=='C' && !isLast && ( arr[i+1]=='D' || arr[i+1]=='M' )){
                num= num + map.get(arr[i+1]) - map.get(arr[i]);
                i++;
            }else {
                Integer val = map.get(arr[i]);
                num = num + val;
            }
        }
        return num;
    }
}
