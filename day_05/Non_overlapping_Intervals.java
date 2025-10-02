package day_05;
import java.util.*;
public class Non_overlapping_Intervals {
    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{3,4},{1,3}};    
        int cnt=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int last=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<last){
                 cnt++;
            }
            else{
                last=intervals[i][1];
            }
        }
        System.out.println(cnt);
    }
}
