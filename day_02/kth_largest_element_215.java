package day_02;
import java.util.*;
public class kth_largest_element_215 {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minh = new PriorityQueue<>();
        for (int num : nums) {
            minh.add(num);
            if (minh.size() > k) {
                minh.remove();
            }
        }
        return minh.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }
}
