package Array;

import java.util.Arrays;

public class RemoveDuplicate {
    // constrain the array is sorted
    int remDupe(int[] nums){
        int j=0;
        int i =j+1;

        while(i<nums.length){
            if(nums[i]== nums[j]) i++;
            else nums[++j] = nums[i++];
        }

        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 8, 8, 9};
        RemoveDuplicate r = new RemoveDuplicate();
        int newLen = r.remDupe(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, newLen)));
    }
}
