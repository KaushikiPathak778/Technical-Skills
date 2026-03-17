// Given n array elements, count number of equilibirium index. 
// An equilibirium index is an index such that the sum of all elements on the left side of the index is equal to the sum of all elements on the right side of the index.


// Observation: Prefix sum array helps compute left and right sums.
// Total array sum is stored at prefix[n−1].
// Multiple equilibrium index may exist, including index 0.

// Pseudocode:-
// Create a prefix sum array where prefix[i] is the sum of elements from index 0 to i.
// Iterate through each index i of the array.
// Calculate left sum as prefix[i-1] (0 if i is 0).
// Calculate right sum as prefix[n-1]-prefix[i].
// If left sum equals right sum, increment the equilibrium index count.
// Print the count of equilibrium index.


import java.util.Scanner;
public class EquilibiriumIndex{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]prefixArray=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prefixArray[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixArray[i]=prefixArray[i-1]+arr[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            int leftElementSum=(i==0)?0:prefixArray[i-1];
            int rightElementSum=prefixArray[n-1]-prefixArray[i];
            if(leftElementSum==rightElementSum){
                count++;
            }
        }
        System.out.print("Number of equilibrium index: "+count);
    }
}
