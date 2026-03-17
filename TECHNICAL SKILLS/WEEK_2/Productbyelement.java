// Given an array of integer size n,find and return the product array of the same size where the ith element of the product to the product of all the elements divided by the ith element of the array.

// Observation: The product of all elements can be calculated first, then each element in the product array can be derived by dividing the total product by the corresponding element in the original array.

// Pseudocode:-
// First we will calculate the total product of all elements in the array.
// Then we create a new product array.
// For each index i in the original array, we set product[i] to total product divided by arr[i].
// Return the product array.


import java.util.Scanner;
public class Productbyelement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int totalProduct=1;
        for(int i=0;i<n;i++){
            totalProduct*=arr[i];
        }
        int[]product=new int[n];
        for(int i=0;i<n;i++){
            product[i]=totalProduct/arr[i];
        }
        System.out.print("Product array: ");
        for(int i=0;i<n;i++){
            System.out.print(product[i]+" ");
        }
    }
    
}
