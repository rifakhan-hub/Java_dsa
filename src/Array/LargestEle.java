package Array;

import java.util.Scanner;

public class LargestEle {
    int findMax(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i]> max) max = nums[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array" );
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LargestEle l = new LargestEle();
        System.out.println(l.findMax(arr));

    }
}
