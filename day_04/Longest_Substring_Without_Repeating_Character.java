package day_04;
import java.util.*;
public class Longest_Substring_Without_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int si=0;
        int ei=0;
        int ans=0;
        Set<Character> set = new HashSet<>();
        while(ei<s.length()){
            if(set.add(s.charAt(ei))){
                ans=Math.max(ans,ei-si+1);
                ei++;
            }
            else{
               set.remove(s.charAt(si));
               si++;
            }
        }
        System.out.println(ans);
    }
}
