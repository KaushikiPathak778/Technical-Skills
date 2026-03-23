// Write a program to perform the transpose of a matrix.

import java.util.Scanner;
public class Transpose {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[][] transpose=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("The transpose of the matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
