// Given an array of integer nums.Calculate the pivot index of the array. 
// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
// This also applies to the right edge of the array.Return the leftmost pivot index. If no such index exists, return -1.


// Observation: We can calculate the total sum of the array and then iterate through the array while keeping track of the left sum. 
// The right sum can be derived from the total sum minus the left sum and the current element.


// Pseudo Code:-
// Calculate the total sum of the array.
// Initialize left sum to 0.
// Iterate through the array.
// For each element, calculate the right sum as total sum - left sum - current element.
// If left sum equals right sum, return the current index as the pivot index.
// If no pivot index is found, return -1.


import java.util.Scanner;
public class Leftpivot_index{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the  elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum=totalsum+arr[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=totalsum-leftsum-arr[i];
            if(leftsum==rightsum){
                System.out.println(i);
                return;
            }
            leftsum+=arr[i];
        }
        System.out.println(-1);
    }
}
