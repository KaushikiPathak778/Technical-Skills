// Given an integer array of size n.In one second you can increase the value of one element by 1.Find the minimum time in seconds to make all the elements of the array equal.

// Observation:To make all elements equal,we need to increase all elements to the value of the maximum element in the array.

// Pseudo Code:-
// 1. Find the maximum element in the array.
// 2. For every element calculate how much it needs to be increased to reach the maximum element.
// 3. Sum all the increases to get the total time required.

import java.util.Scanner;
public class Mintime{
    public static void main(String[] args) {
        int[]arr={2,4,1,3};
        int time=0 ;
        int max=arr[0] ;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            time+=max-arr[i];
        }
        System.out.println(time);
    }
}        