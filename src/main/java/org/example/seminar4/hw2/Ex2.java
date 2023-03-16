package org.example.seminar4.hw2;

import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        String s="(]";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s){
    Stack<Character> stack=new Stack<>();
    for(char i: s.toCharArray()) {
        if(i=='(')
            stack.push(')');
        else if (i=='{')
            stack.push('}');
        else if (i=='[')
            stack.push(']');
        else if (stack.isEmpty() || stack.pop() !=i)
            return false;
    }
        return true;
    }
}
