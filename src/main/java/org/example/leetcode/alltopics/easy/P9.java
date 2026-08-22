package org.example.leetcode.alltopics.easy;

public class P9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int x) {
        //second

        if(x<0){
            return false;
        }
        int palin=0;
        int orig=x;
        while(x>0){
            palin = palin*10 + x%10;
            x=x/10;
        }
        return orig == palin;


        //Ist
     /*   if(x<0){
            return false;
        }
        try{
        String s1=new StringBuilder(String.valueOf(x)).reverse().toString();
        if(Integer.parseInt(s1)==x){
            return true;
        }
        }catch (Exception e){

        }
        return false;*/
    }
}
