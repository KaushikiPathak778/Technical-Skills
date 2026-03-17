// Given an array, count number of elements that have atleast one element greater than itself.
// Observation: The maximum element will not be counted as there is no element greater than itself.
// Pseudo Code:-
// 1. Find the maximum element in the array.
// 2. Iterate through the array and count elements that are not equal to the maximum element.
// 3. Return the count.

public class Count{
    public static void main(String[] args) {
        int[]arr={-3,0,2,8,4,6,8};
        int count=0 ;
        int max=arr[0] ;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=max){
                count++;
            }
        }
        System.out.println(count);  
    }
}