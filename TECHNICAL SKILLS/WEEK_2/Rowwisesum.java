// Write a program to find the sum of every row of a matrix.

// Observation: We will iterate through each row of the matrix and calculate the sum of the elements in that row.

// Pseudocode:
// 1. Initialize a matrix.
// 2. For each row index from 0 to the number of rows:
//    a. Initialize a variable sum to 0.
//    b. For each column index from 0 to the number of columns:
//       i. Add the element at the current row and column to sum.
//    c. After the inner loop, print the sum of the current row.
// 3. Repeat for all rows.
// 4. The output will display the sum of each row in the matrix.

import java.util.Scanner;
public class Rowwisesum{
    public static void main(String[]args){
        int[][]matrix={{1,2,1},{3,2,1},{5,1,2}};
        for (int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[i][j];
            }
            System.out.println("Sum of row "+(i+1)+":"+sum);
        }
    }
}