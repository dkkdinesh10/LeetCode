package org.example.leetcode.alltopics.easy;

public class P28 {
    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {
        int end=needle.length();
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int index=0;
            if(haystack.charAt(i) == needle.charAt(index)){
                index++;
                for(int j=i+1;j<i+needle.length();j++){
                    if(haystack.charAt(j)==needle.charAt(index)){
                        index++;
                    }else{
                        break;
                    }
                }
                if(index==end){
                    return i;
                }
            }
        }
        return -1;
    }

}
