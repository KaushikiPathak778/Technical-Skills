// Write a program to find the sum of upper diagonal and lower diagonal elements of a matrix.

// Observation: The upper diagonal elements of a matrix are those that are above the main diagonal and i<j.
// The lower diagonal elements are those that are below the main diagonal and i>j.

// Pseudocode:
// 1.Initialize a 2D array.
// 2.Initialize two variables, UpperDiagonalSum and LowerDiagonalSum, to store the sums of the upper and lower diagonal elements, respectively.
// 3.Use nested loops to iterate through the elements of the matrix.
// 4.Inside the inner loop, check if the current element is an upper diagonal element (i<j) and add it to UpperDiagonalSum.
// 5.If the current element is a lower diagonal element (i>j), add it to LowerDiagonalSum.
// 6.After the loops, print the values of UpperDiagonalSum and LowerDiagonalSum.

public class Upper_lower_diagonalsum {
    public static void main(String[]args){
        int[][] matrix={{1,2,0},{4,2,2},{0,3,1}};
        int UpperDiagonalSum=0;
        int LowerDiagonalSum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i<j){
                    UpperDiagonalSum+=matrix[i][j];
                }else if(i>j){
                    LowerDiagonalSum+=matrix[i][j];
                }
            }
        }  
        System.out.println("Upper diagonal Sum= "+ UpperDiagonalSum); 
        System.out.println("Lower diagonal Sum= "+ LowerDiagonalSum);
    }
}
