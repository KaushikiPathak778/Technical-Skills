// Given an integer A,you have to find the Ath perfect number.A perfect number has the following properties.
// It comprises only 1 and 2.
// The no. of digits in a perfect number is even.
// It is a palindrome number.
// Use the  concept of queue to solve the problem.

// Pseudocode:
// 1. Create a queue to store the perfect numbers.
// 2. Add the first two perfect numbers "1" and "2" to the queue.
// 3. Initialize an empty string ans to store the Ath perfect number.
// 4. Loop from 0 to A-1:
//    a. Remove the front element from the queue and store it in a variable s.
//    b. Create a variable rev to store the reverse of s.
//    c. Loop through the characters of s in reverse order and append them to rev.
//    d. Concatenate s and rev to form the perfect number and store it in ans.
//    e. Add the new perfect numbers formed by appending "1" and "2" to s back to the queue.
// 5. After the loop, ans will contain the Ath perfect number. Print ans.


package WEEK_7;
import java.util.*;

public class Perfectno{
    public static void main(String[]args){
        int A=6;
        Queue<String> q=new LinkedList<>();
        q.add("1");
        q.add("2");
        String ans = "";
        for(int i=0;i<A;i++){
            String s=q.remove();
            String rev="";
            for(int j=s.length()-1;j>=0;j--){
                rev+=s.charAt(j);
            }
            ans=s+rev;
            q.add(s+"1");
            q.add(s+"2");
        }

        System.out.println(ans);
    }
}