package org.example.leetcode.alltopics.medium;

import java.math.BigInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);

    }

    public static int reverse(int x) {
        if(x>Math.pow(2,32)-1 || x< -(Math.pow(2,32))){
            return 0;
        }
        String s=""+x;
        if(x<0){
            BigInteger ss=BigInteger.valueOf(Long.parseLong(new StringBuilder(s.replace("-","")).reverse().toString()));
            try {
                return -ss.longValue()<-Math.pow(2,31)?0:-ss.intValue();
            }catch (Exception e){
                return 0;
            }
        }else{
            BigInteger ss=BigInteger.valueOf(Long.parseLong(new StringBuilder(s).reverse().toString()));
            try {
                return ss.longValue()>Math.pow(2,31)-1?0:ss.intValue();
            }catch (Exception e){
                return 0;
            }
        }
    }
}
