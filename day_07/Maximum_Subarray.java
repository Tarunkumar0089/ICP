package day_07;
import java.util.*;
public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar=nums[0];
        int maxEndingHere=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEndingHere=Math.max(nums[i],maxEndingHere+nums[i]);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        System.out.println(maxSoFar);
    }
}
