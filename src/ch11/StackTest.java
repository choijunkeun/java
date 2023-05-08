package ch11;

import java.util.*;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
