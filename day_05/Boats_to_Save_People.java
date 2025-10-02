package day_05;

import java.util.*;

public class Boats_to_Save_People {
    public static void main(String[] args) {
        int[] people={3,2,2,1};
        int limit=3;
        int i=0;
        int j=people.length-1;
        int b=0;
        Arrays.sort(people);
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                i++;
                j--;
            }
            else
            {
                j--;
            }
            b++;
        }
        System.out.println(b);
    }
}
