package org.example.leetcode.alltopics.easy;

public class P69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int diff=Integer.MAX_VALUE;
        int num=0;
        if(x==0 || x==1){
            return x;
        }
        for(int i=2;i<=x/2;i++){
            if(i*i==x){
                return i;
            }else{
                if( x-(i*i) < 0){
                    if((x-(i*i))*-1 < diff) {
                        diff = (x - (i * i)) * -1;
                        num = i;
                    }
                }else if( x-(i*i) < diff){
                    diff=x-(i*i);
                    num=i;
                }
            }
        }
        return num;
    }
}
