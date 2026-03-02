package Array;

import java.util.Scanner;


public class SecondOrder {
    int smax(int[] nums){
        int max = nums[0];
        int sec = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]> max){
                sec = max;
                max = nums[i];
            }else if(nums[i]> sec && nums[i]< max) sec = nums[i];
        }
        return sec;
    }int smin(int nums){
        int sec = -1;
        return sec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array" );
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SecondOrder l = new SecondOrder();
        System.out.println(l.smax(arr));

    }
}
