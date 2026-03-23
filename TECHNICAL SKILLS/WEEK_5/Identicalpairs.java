// To transform the string,you should perform the following operations repeatedly:
// Identify the first occurence of consecutive identical pairs of character within a string.
// Remove this pair of identical characters from the string.
// Repeat stacks 1 and 2 until no more consecutive identical pairs of characters are left.
// The final string will be the transformed string.

// Create an empty stack.
// Iterate through each character in the string from left to right.
// For each character, check if the stack is not empty and the top of the stack is the same as the current character.
// If it is, pop the top character from the stack (removing the pair).
// If it is not, push the current character onto the stack.
// After processing all characters, the stack will contain the characters of the transformed string in order. 
// You can then construct the final string by concatenating the characters in the stack.

package WEEK_5;

import java.util.Stack;
public class Identicalpairs {
    public static void main(String[]args){
        String s="abccbc";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(st);
    }
}
