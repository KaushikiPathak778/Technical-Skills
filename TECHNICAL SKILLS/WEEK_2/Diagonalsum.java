// Write a program to  print the matrix and find the sum of the diagonal elements of a matrix.

// Observation: In a square matrix, the diagonal elements are those where the row index is equal to the column index (i.e.,i==j).

// Pseudocode:-
// Read the number of rows and columns from the user.
// Create a 2D array (matrix) to store the elements.
// Read the elements of the matrix from the user.
// Print the matrix.
// Initialize a variable to store the sum of diagonal elements.
// Iterate through the matrix and check if the current element is a diagonal element (i.e.,if i==j).
// If it is a diagonal element,add it to the sum.
// Print the sum of the diagonal elements.

import java.util.Scanner;
public class Diagonalsum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the number of rows and columns: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] matrix=new int[rows][cols];
        System.out.print("Enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.print("Sum of the diagonal elements: "+ sum);
    }   
}
