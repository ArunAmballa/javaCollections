package Stack;

import java.util.Stack;

public class StackBasics {


    public static void main(String args[]){

        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack Elements "+stack);
        System.out.println("Popped Element "+stack.pop());
        System.out.println("Top ELement of Stack "+stack.peek());
        System.out.println("Stack Size "+stack.size());
        System.out.println("Checking if Stack is Empty "+stack.isEmpty());
        

    }
}
