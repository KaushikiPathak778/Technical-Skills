// Given an integer A.Find and return first positive A integers in ascending order containing only digits 1,2 and 3.

// Example Input
// A=3
// Example Output
// [1,2,3]

// Pseudocode:
// 1. Create an empty list to store the result and a queue to generate the numbers.
// 2. Add the initial numbers "1", "2", and "3" to the queue.
// 3. Use a loop to generate numbers until we have A numbers in the result list.
// 4. In each iteration, remove the front element from the queue, convert it to an integer, and add it to the result list.
// 5. Generate new numbers by appending "1", "2", and "3" to the current number and add them back to the queue.
// 6. Continue this process until we have A numbers in the result list, then return the list.

package WEEK_6;
import java.util.*;
public class Numbersusing_123{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int A=sc.nextInt();
        ArrayList<Integer> result=new ArrayList<>();
        Queue<String> queue=new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        int index=0;
        for(int i=0;i<A;i++){
            String temp=queue.poll();
            int num = Integer.parseInt(temp); 
            result.add(num);
            
            queue.add(temp + "1"); 
            queue.add(temp + "2");
            queue.add(temp + "3");
        }
    
        System.out.println(result);
    }
}
