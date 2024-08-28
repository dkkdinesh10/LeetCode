package org.example.leetcode.alltopics.medium;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        String max="";
        int length=0;
        int count=0;

        if(s.length()==1){
            return 1;
        }

        for(int i=0;i<s.length();i++){
            if(!max.contains(""+s.charAt(i))){
                max=max+""+s.charAt(i);
                count++;
                if(i==s.length()-1 && count>length){
                    length=count;
                }
            }else{
                System.out.println(max);
                if(count>length){
                    length=count;
                }
                max=""+s.charAt(i);
                count=1;
            }
        }
        return length;
    }
}
