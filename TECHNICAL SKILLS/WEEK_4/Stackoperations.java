// Write a program to implement stack operations (push, pop, peek, isEmpty) using Java's Stack class.

import java.util.Stack;
public class Stackoperations {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: "+stack);
        System.out.println("Top element: "+stack.peek());
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Stack after pop: "+stack);
        System.out.println("Second popped element: "+stack.pop());
        System.out.println("Stack after popping two elements: "+stack);
        System.out.println("Is stack empty? "+stack.isEmpty());
        System.out.println("Third popped element: "+stack.pop());
        System.out.println("Stack after popping three elements: "+stack);
        System.out.println("Is stack empty? "+stack.isEmpty());
    }
}
    