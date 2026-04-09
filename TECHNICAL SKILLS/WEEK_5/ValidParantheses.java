// Given a string A, containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// Return 0/1( 0 for false, 1 for true )for this problem.
// Note:  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

// Pseudocode:
// 1. Create a stack to keep track of opening brackets.
// 2. Iterate through each character in the input string A.
// 3. If the character is an opening bracket ('(', '{', '['), push it onto the stack.
// 4. If the character is a closing bracket (')', '}', ']'):
//    a. If the stack is empty, return 0 (invalid).
//    b. Pop the top element from the stack and check if it matches the corresponding opening bracket for the current closing bracket.
//    c. If it does not match, return 0 (invalid).
// 5. After iterating through the string, if the stack is not empty, return 0 (invalid).
// 6. If the stack is empty, return 1 (valid).

package WEEK_5;
import java.util.*;
public class ValidParantheses {
    public int solve(String A) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return 0;
                }
                char top=st.pop();
                if((ch==')'&& top!='('))
                    return 0;
                if((ch=='}'&& top!='{'))
                    return 0;
                if((ch==']'&& top!='[')) 
                    return 0;
            }
        }
        if(!st.isEmpty()){
            return 0;
        }
        else{
        return 1;
        }
    }
    public static void main(String[] args){
        ValidParantheses vp=new ValidParantheses();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of parentheses: ");
        String input=sc.nextLine();
        int result=vp.solve(input);
        if(result==1){
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
        sc.close();
    }
}
