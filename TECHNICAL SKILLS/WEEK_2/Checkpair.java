// Write a program that checks whether a given array contains any pair of distinct elements whose sum equals a target value k.

// Observation: Both the elements of the pair should be distinct, which means that we cannot use the same element twice to form a pair. 
// Sum of the pair should be equal to the target value k.

// Pseudocode:
// 1. Initialize an array of integers and a target value k.
// 2. Use two nested loops to iterate through the array and check for pairs of distinct elements.
// 3. In the inner loop, check if the sum of the current pair of elements equals k and if the indices of the elements are different (i.e.,i!=j).
// 4. If a pair is found, print a message indicating that a pair is available and break out of the inner loop.


import java.util.Scanner;
public class Checkpair {
    public static void main(String[]args){
        int[] arr={3,-2,1,4,3,6,8};
        int k=10;
        boolean Found  =false; 
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i]+arr[j]==k && i!=j){
                    System.out.println(arr[i]+"+"+arr[j]+"="+k);
                    Found=true;
                    break;
                }
            }
        }
        if (Found){
            System.out.println("Pair is Available.");
        }else{
            System.out.println("Pair is not Available.");
        }
        
    }
}
