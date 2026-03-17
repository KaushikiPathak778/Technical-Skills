// Write a program to print the sum of the core elements.

import java.util.Scanner;
public class Coreelements {
    public static void main(String[]agrs){
        int [][]arr={{1,2,3,13,14},{4,5,6,15,16},{7,8,9,17,18},{10,11,12,19,20},{21,22,23,24,25}};
        int sum=0;
        for(int i=1;i<arr.length-1;i++){
            for(int j=1;j<arr[i].length-1;j++){
                sum+=arr[i][j];
               }
        }    
        System.out.println("Sum of core elements: "+sum);
    }
    
}
