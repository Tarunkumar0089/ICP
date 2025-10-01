package day_04;

import java.util.*;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int[] freq=new int[26];
        int ans=0;
        int maxFreq=0;
        int maxWindow=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            int windowLength=right-left+1;
            if(windowLength-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowLength=right-left+1;
            maxWindow=Math.max(maxWindow, windowLength);
        }
        System.out.println(maxWindow);
    }
}
