// Write a program to find the sum of every column of a matrix.

// Observation: We will iterate through each column of the matrix and calculate the sum of the elements in that column. 
// This can be achieved by using nested loops, where the outer loop iterates through the columns and the inner loop iterates through the rows to accumulate the sum for each column.

// Pseudocode:
// 1. Initialize a matrix.
// 2. For each column index from 0 to the number of columns:
//    a. Initialize a variable sum to 0.
//    b. For each row index from 0 to the number of rows:
//       i. Add the element at the current row and column to sum.
//    c. After the inner loop, print the sum of the current column.
// 3. Repeat for all columns.
// 4. The output will display the sum of each column in the matrix.

import java.util.Scanner;
public class Columnwisesum{
    public static void main(String[]args){
        int[][]matrix={{1,2,1},{3,2,1},{5,1,2}};
        for (int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[j][i];
            }
            System.out.println("Sum of column "+(i+1)+":"+sum);
        }
    }
}