package org.example.leetcode.alltopics.easy;

public class P14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String comm=strs[0];
        for(int i=1;i<strs.length;i++){
            int len= Math.min(comm.length(), strs[i].length());
            String comma="";
            for(int j=0;j<len;j++){
                if(comm.charAt(j)==strs[i].charAt(j)){
                    comma=comma + strs[i].charAt(j);
                }else {
                    break;
                }
            }
            comm=comma;
        }

        return comm;
    }
}
