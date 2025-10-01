package day_01;
import java.util.*;
public class Minimum_Number_of_Arrows_to_Burst_Balloons_452 {

    public static class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points.length == 0) return 0;
            Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
            int last = points[0][1];
            int cnt = 1;
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] > last) {
                    cnt++;
                    last = points[i][1];
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.findMinArrowShots(points));
    }
}
