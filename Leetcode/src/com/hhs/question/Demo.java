package com.hhs.question;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        HashMap hm = new HashMap<Character,Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))){
                left = Math.max(left,(int)(hm.get(s.charAt(i))) + 1);
            }
            hm.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
