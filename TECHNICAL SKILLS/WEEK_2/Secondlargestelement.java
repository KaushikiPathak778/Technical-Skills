// Write a program to find second largest element of the array.

// Observation: We will traverse the array while keeping track of the largest and second largest values, updating them as needed.
// This ensures that after one complete pass, the second largest element is correctly identified.

// Pseudocode:
// 1. Initialize two variables, largest and secondlargest, to hold the largest and second largest values.
// 2. Iterate through the array:
//    a. If the current element is greater than largest, update secondlargest to largest and largest to the current element.
//    b. Else if the current element is greater than secondlargest and not equal to largest, update secondlargest to the current element.
// 3. After the loop, secondlargest will hold the value of the second largest element in the array.
// 4. Print the second largest element.

import java.util.Scanner;
public class Secondlargestelement{
    public static void main(String[]args){
        int[] matrix={2,1,3,-6,0,9};
        int largest=matrix[0];
        int secondlargest=matrix[1];
        for(int i=0;i<matrix.length;i++){
            if(matrix[i]>largest){
                secondlargest=largest;
                largest=matrix[i];
            }else if(matrix[i]>secondlargest && matrix[i]!=largest){
                secondlargest=matrix[i];
            }
        }
        System.out.println("Second largest element is:"+secondlargest);
    }
}