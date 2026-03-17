package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class nMeeting {
    int maxMeet(int[] start, int[] end){
        int count = 0;
        int freetime = 0;
        int n = start.length;
        Pair[] arr = new Pair[n];

        for (int i = 0; i < start.length; i++) {
            arr[i]= new Pair(start[i],end[i], i);
        }

        Arrays.sort(arr,(a,b) -> Integer.compare(a.end, b.end));

        for (int i = 0; i < n; i++) {
            if(freetime< arr[i].start){
                count +=1;
                freetime = arr[i].end;
                //arr[i] = new Pair(start[i],end[i],i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] start = {0,3,1,5,5,8};
        int[] end = {5,4,2,9,7,9};

        nMeeting t = new nMeeting();
        System.out.println(t.maxMeet(start, end));

    }

}
class Pair {
    int start; int end; int index;
       Pair(int start, int end, int index){
           this.start = start;
           this.end = end;
           this.index = index;
       }

}

