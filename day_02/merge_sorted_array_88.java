package day_02;
import java.util.Scanner;
public class merge_sorted_array_88 {
    public  static int[] merge(int[] nums1, int m, int[] nums2, int n) {
         int [] res=new int[m+n];
         int i=0,j=0,k=0;
            while(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    res[k++]=nums1[i++];
                }else{
                    res[k++]=nums2[j++];
                }
            }
            while(i<m){
                res[k++]=nums1[i++];
            }
            while(j<n){
                res[k++]=nums2[j++];
            }
            return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int [] nums1=new int[m];
        int n=sc.nextInt();
        int [] nums2=new int[n];
       int res[]= merge(nums1,m,nums2,n);
        for(int i=0;i<res.length;i++){
              System.out.print(res[i]+" ");
         }
    }
}