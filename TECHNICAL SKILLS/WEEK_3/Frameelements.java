// Write a program to print the sum of frame elements of the matrix.

import java.util.Scanner;
public class Frameelements{
    public static void main(String[]args){
        int[][]matrix={{1,2,1},{3,2,1},{5,1,2}};
        int sum=0;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==0 || i==matrix.length-1 || j==0 || j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Sum of frame elements:"+sum);
    }
}