package org.example.leetcode.alltopics.easy;

public class P557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a's s'a x's"));
    }

    public static String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(String str:arr){
            System.out.println(str);
            StringBuilder sb=new StringBuilder(str);
            s=s.replaceAll(s,sb.reverse().toString());
            System.out.println(s);
        }
        return s;
    }
}
