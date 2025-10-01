package day_04;

import java.util.*;

public class Permutation_in_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n=s1.length();
        int m=s2.length();
        if(n>m) {
            System.out.println(false);
            return;
        }
        int[] freq1 = new int[26];
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        int[] freq2 = new int[26];
        int l=0;
        for(int r=0;r<m;r++){
            freq2[s2.charAt(r) - 'a']++;
            if (r - l + 1 == n) {
                if (matches(freq1, freq2)) {
                    System.out.println(true);
                    return;
                }
                freq2[s2.charAt(l) - 'a']--;
                l++;
            }
        }
        System.out.println(false);
    }
    public static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
