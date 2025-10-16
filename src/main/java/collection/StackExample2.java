package collection;

import java.util.Stack;

public class StackExample2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("ZAur");
        stack.push("Oleg");
        stack.push("Misha");
        stack.push("Katya");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
