package Greedy;

import java.util.Scanner;

public class JumpGame {
    boolean jump(int[] arr ){
        int maxIndex = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(i>maxIndex) return false;
            else{
                maxIndex = Math.max(maxIndex, i+ arr[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        JumpGame jg = new JumpGame();
        System.out.println(jg.jump(arr));
    }
}
