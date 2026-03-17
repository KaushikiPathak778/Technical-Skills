// Given a string 'A' consisting only of opening and closing brackets.
// We need to find whether the paranthesis in 'A' are balanced or not by using stack.
// If it is balanced then return 1 else return 0.
// A="()()" OR A="(()())" OR A="(()"

// Algorithm:
// If we have a opening bracket push into the stack.
// When closing bracket appears pop from the stack.
// If stack becomes empty when trying to pop that means it is not balanced.
// After traversing the whole string if stack becomes empty that means the string is balanced.

import java.util.Stack;
public class Balancedstring{
    public static void main(String[] args) {
       Stack<Character>st=new Stack<>();
       String A="(()";
         for(int i=0;i<A.length();i++){
              char ch=A.charAt(i);
              if(ch=='('){
                st.push(ch);
              }
              else{
                if(st.isEmpty()){
                     System.out.println(0);
                     return;
                }
                st.pop();
              }
        }
        if(st.isEmpty()){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}

