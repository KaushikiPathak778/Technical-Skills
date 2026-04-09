// Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.
// Chech whether A has redundant braces or not.
// NOTE: A will be always a valid expression.

// Pseudocode:
// 1. Create a stack to keep track of characters in the expression.
// 2. Iterate through each character in the input string A.
// 3. If the character is a closing brace ')':
//    a. Initialize a boolean variable operatorFound to false.
//    b. Pop elements from the stack until an opening brace '(' is found.
//    c. If an operator ('+', '-', '*', '/') is found during the popping process, set operatorFound to true.
//    d. If the stack becomes empty before finding an opening brace '(', return 1 (indicating redundant braces).
//    e. Pop the opening brace '(' from the stack.
//    f. If operatorFound is false after popping the opening brace, return 1 (indicating redundant braces).
// 4. If the character is not a closing brace, push it onto the stack.
// 5. After iterating through the string, if no redundant braces are found, return 0.


package WEEK_5;
import java.util.*;
public class RedundantBraces{
    public int solve(String A){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch==')'){
                boolean operatorFound=false;
                while(!st.isEmpty() && st.peek()!='('){
                    char top=st.pop();
                    if(top=='+' || top=='-' || top=='*' || top=='/'){
                        operatorFound=true;
                    }
                }
                if(st.isEmpty()){
                    return 1; 
                }
                st.pop();
                if(!operatorFound){
                    return 1;
                }
            } else {
                st.push(ch); 
            }
        }
        return 0;
    }

    public static void main(String[] args){
        RedundantBraces rb=new RedundantBraces();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String input=sc.nextLine();
        int result=rb.solve(input);
        if(result==1){
            System.out.println("Redundant Braces Found");
        } else {
            System.out.println("No Redundant Braces");
        }
        sc.close();
    }
}