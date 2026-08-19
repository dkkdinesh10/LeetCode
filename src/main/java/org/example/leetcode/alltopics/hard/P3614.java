package org.example.leetcode.alltopics.hard;

public class P3614 {

    public static void main(String[] args) {
        System.out.println(P3614.processStr("fwp*m*#a%%",5));
    }

    public static char processStr(String s, long k) {
        String str="";
        for(int i=0;i<s.length();i++){
            str=getNewString(str,String.valueOf(s.charAt(i)));
            System.out.println("For  ::"+str);
        }
        if(str.isEmpty() || str.length()<=k){
            return '.';
        }
        return str.charAt((int)k);
    }

    private static String getNewString(String current,String spcl){
        String newStr="";
        switch(spcl){
            case "*":
                if(current!=null && !current.isEmpty()){
                    newStr=current.substring(0,current.length()-1);
                }
                break;
            case "#":
                newStr=current+current;
                break;
            case "%":
                newStr = new StringBuilder(current).reverse().toString();
                break;
            default:
                newStr=current+spcl;
        }
        return newStr;
    }
}
